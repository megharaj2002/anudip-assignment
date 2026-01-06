import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExampleForScrollableResultSet {

    public static void main(String[] args) {

        String jdbcurl = "jdbc:mysql://127.0.0.1:3306/anpd3911";
        String username = "root";
        String password = "root1234";

        try (Connection c = DriverManager.getConnection(jdbcurl, username, password);
                Statement s = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
            String selectData = "SELECT StudentID, FirstName, LastName FROM Student";
            ResultSet resultSet = s.executeQuery(selectData);

            // move the cursor to the last row
            if (resultSet.last()) {
                // retrieve the data from the last row
                String lastID = resultSet.getString("StudentID");
                String fname = resultSet.getString("FirstName");
                String lname = resultSet.getString("LastName");
                System.out.println("Last Student ID : " + lastID + ", Name : " + fname + " " + lname);
            }

            // move the cursor to the first row
            if (resultSet.first()) {
                // retrieve the data from the first row
                String FirstID = resultSet.getString("StudentID");
                String fname = resultSet.getString("FirstName");
                String lname = resultSet.getString("LastName");
                System.out.println("First Student ID : " + FirstID + ", Name : " + fname + " " + lname);
            }

            // move the cursor to the absolute row
            if (resultSet.absolute(3)) {
                // retrieve the data from the absolute row (3rd row)
                String absoluteID = resultSet.getString("StudentID");
                String fname = resultSet.getString("FirstName");
                String lname = resultSet.getString("LastName");
                System.out.println("Absolute Student ID : " + absoluteID + ", Name : " + fname + " " + lname);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
