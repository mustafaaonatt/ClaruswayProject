package week12;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        /*
        1. Load and register the driver/connector                        ( install and opening the Workbench )
        2. Perform the connection ( Location of DB, Username, Password ) (double click connector )
        3. prepare the query                                             (Open and type query )
        4. execute the query                                             ( execute the query )
        5. perform the logic based on the query                          ( check te given table )
        6. close the connection                                          ( Close the workbench )
        */
        try {
        String url = "jdbc:mysql://localhost:3306/edu_pract";
        String username = "root";
        String password = "Galatasaray1905";
        Connection db = DriverManager.getConnection(url,username,password);

        Statement st = db.createStatement();



        ResultSet rs = st.executeQuery("SElect * from Student");

        while (rs.next()){
            //System.out.println(rs.getString(2));
            System.out.println(rs.getInt("Student_id")+ "\t\t"+
                    rs.getString("fName")+ "\t\t" +
                    rs.getString("lName") + "\t\t" +
                    rs.getString("gender")+ "\t\t" +
                    rs.getDate("dob"));
        }

            db.close();
        } catch (SQLException e) {
            System.out.println("we ha DB ERROR");
        }
    }
}
