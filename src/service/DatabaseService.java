package service;

import model.Student;
import week12.App.Util.DatabaseUtil;
import week12.App.Util.QueryUtil;

import java.sql.*;

public class DatabaseService {
    private DatabaseUtil dbu = new DatabaseUtil();
    private QueryUtil qu = new QueryUtil();
    public void allStdList() throws SQLException {

        try ( Connection cn = dbu.connect();
              Statement st = cn.createStatement();
              ResultSet rs = st.executeQuery(qu.allStdList())){
            while (rs.next()){
                Student std = new Student(rs.getInt("student_id"), rs.getString("fName"), rs.getString("lName")
                        , rs.getString("gender"), rs.getDate("dob"));

                System.out.println(std.toString());
            }

        }

    }

    public void addStd(Student std) throws SQLException {
        try (Connection cn = dbu.connect();
             PreparedStatement ps = cn.prepareStatement(qu.addStd())){
            ps.setString(1,std.getfName());
            ps.setString(2,std.getlName());
            ps.setString(3,std.getGender());
            ps.setDate(4,std.getDob());
           int check = ps.executeUpdate();
            if (check > 0){
                System.out.println("Student entered to system Successfully. \n");
            }else {
                System.out.println("Student was not able to entered to system \n");
            }
        }
    }

    public void deleteStd(int stdId) throws SQLException{
        try (Connection cn = dbu.connect();
             PreparedStatement ps = cn.prepareStatement(qu.deleteStd())){
             ps.setInt(1, stdId);
              int check = ps.executeUpdate();
              if(check > 0){
                  System.out.println("Selected student removed from the system");
              }else {
                  System.out.println("Selected student could not be removed from the system. Please try again.");
              }
        }
    }
    public Student theStd(int stdId) throws SQLException{
        Student std = null;

        try(Connection cn = dbu.connect();
        PreparedStatement ps = cn.prepareStatement(qu.theStd())) {
        ps.setInt(1,stdId);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            std = new Student(rs.getString("fName"), rs.getString("lName"), rs.getString("gender"), rs.getDate("dob"));
            }
        }
        return std;
    }
    public void updateStd(int stdId,int detail){
        System.out.println("we are about to update student " + stdId);
        switch (detail){
            case 1:
                System.out.println("First Name will be updated." );
                break;
            case 2:
                System.out.println("Last Name will be updated");
                break;
            case 3:
                System.out.println("Gender will be updated");
                break;
            case  4:
                System.out.println("DOB will be updated");
                break;
        }
    }
}
