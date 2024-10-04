// Importing database
import java.sql.*;
// Importing required classes
import java.util.*;

// Main class
class Test {

    // Main driver method

    public static void main(String a[]) {




        // Creating the connection using Oracle DB
        String url = "jdbc:oracle:thin:@localhost:1521:xe";

        // Username and password to access DB
        String user = "system";
        String pass = "12345";



        String sql = "select * from employee";


 	//changes from karthick
 
        // Inserting data using SQL query
        String sql = "insert into student1 values('" + name
                     + "'," + roll + ",'" + cls + "')";
 

        Connection con = null;

        // Try block to check for exceptions
        try {


            DriverManager.registerDriver(
                new oracle.jdbc.OracleDriver());


            con = DriverManager.getConnection(url, user,
                pass);


            Statement st = con.createStatement();


            int m = st.execute(sql);
            if (m == 1)
                System.out.println(
                    "inserted successfully : " + sql);
            else
                System.out.println("insertion failed");

            // Closing the connections
            con.close();
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }
}