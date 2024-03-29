package service;

import model.Student;
import week12.App.Util.DatabaseUtil;
import week12.App.Util.QueryUtil;

import java.sql.*;

public class DatabaseService {
    private DatabaseUtil dbu = new DatabaseUtil();
    private QueryUtil qu = new QueryUtil();

    public void allStdList() throws SQLException {

        try (Connection cn = dbu.connect();
             Statement st = cn.createStatement();
             ResultSet rs = st.executeQuery(qu.allStdList())) {
            while (rs.next()) {
                Student std = new Student(rs.getInt("student_id"), rs.getString("fName"), rs.getString("lName")
                        , rs.getString("gender"), rs.getDate("dob"));

                System.out.println(std.toString());
            }

        }

    }

    public void addStd(Student std) throws SQLException {
        try (Connection cn = dbu.connect();
             PreparedStatement ps = cn.prepareStatement(qu.addStd())) {
            ps.setString(1, std.getfName());
            ps.setString(2, std.getlName());
            ps.setString(3, std.getGender());
            ps.setDate(4, std.getDob());
            int check = ps.executeUpdate();
            if (check > 0) {
                System.out.println("Student entered to system Successfully. \n");
            } else {
                System.out.println("Student was not able to entered to system \n");
            }
        }
    }

    public void deleteStd(int stdId) throws SQLException {
        try (Connection cn = dbu.connect();
             PreparedStatement ps = cn.prepareStatement(qu.deleteStd())) {
            ps.setInt(1, stdId);
            int check = ps.executeUpdate();
            if (check > 0) {
                System.out.println("Selected student removed from the system");
            } else {
                System.out.println("Selected student could not be removed from the system. Please try again.");
            }
        }
    }

    public Student theStd(int stdId) throws SQLException {
        Student std = null;

        try (Connection cn = dbu.connect();
             PreparedStatement ps = cn.prepareStatement(qu.theStd())) {
            ps.setInt(1, stdId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                std = new Student(rs.getString("fName"), rs.getString("lName"), rs.getString("gender"), rs.getDate("dob"));
            }
        }
        return std;
    }

    public void updateStd(int stdId, int detail, String strInput, Date dateInput) throws SQLException {
        try (Connection cn = dbu.connect();
             PreparedStatement ps = cn.prepareStatement(qu.updateStd(detail))) {
            switch (detail) {
                case 1:
                case 2:
                case 3:
                    ps.setString(1, strInput);
                    break;
                case 4:
                    ps.setDate(1, dateInput);
                    break;

            }
            ps.setInt(2, stdId);

            int check = ps.executeUpdate();
            if (check > 0) {
                System.out.println("Student updated successfully based on the given input. ");
            } else {
                System.out.println("Update failed please re-enter ");
            }
        }
    }

    public void  stdListTC() throws SQLException{
        try(Connection cn = dbu.connect();
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(qu.stdListTC())) {
            while (rs.next()){
                if (rs.getInt("student_id")<10){
                    System.out.print(" ");
                }
                System.out.print(rs.getInt("student_id") +"\t -> ");
                System.out.print(rs.getString("name") +" \n");
            }

        }
    }
    public void stdCourseTc(int stdId) throws SQLException{
        try(Connection cn = dbu.connect();
        PreparedStatement ps = cn.prepareStatement(qu.stdCourseTc())) {
           ps.setInt(1,stdId);

           ResultSet rs = ps.executeQuery();

           while (rs.next()){
               String line = rs.getString("name");
               for (int i = rs.getString("name").length(); i < 35; i++){
                   line += " ";
               }
               line += rs.getDouble("finalScore")  + "\t";
               line += rs.getDouble("finalScore") >= 55.00 ? "(Passes)" : "(Failed)";
               System.out.println(line);
           }
        }
    }
    public  void fpTC(boolean fp) throws SQLException{
        try(Connection cn = dbu.connect();
        PreparedStatement ps = cn.prepareCall(qu.fpTC())) {
            ps.setBoolean(1,fp);

            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                String line = rs.getString("stdName");
                for (int i = line.length(); i <= 30 ; i++) {
                    line += " ";
                }
                line += rs.getString("name");
                for (int i = line.length(); i <= 70 ; i++) {
                    line += " ";
                }
                line += rs.getString("finalScore");
                System.out.print(line + "\n");

            }

        }


    }
}