import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SetupStudentData {
    public static void main(String[] args) {
        String jdbcurl = "jdbc:mysql://127.0.0.1:3306/anpd3911";
        String username = "root";
        String password = "root1234";

        try (Connection c = DriverManager.getConnection(jdbcurl, username, password);
                Statement s = c.createStatement()) {

            // Create table
            String createTable = "CREATE TABLE IF NOT EXISTS Student (" +
                    "StudentID INT PRIMARY KEY, " +
                    "FirstName VARCHAR(50), " +
                    "LastName VARCHAR(50))";
            s.execute(createTable);
            System.out.println("Table 'Student' created or already exists.");

            // Insert data - using INSERT IGNORE to skip if exists
            String insertData = "INSERT IGNORE INTO Student (StudentID, FirstName, LastName) VALUES " +
                    "(1, 'John', 'Doe'), " +
                    "(2, 'Jane', 'Smith'), " +
                    "(3, 'Alice', 'Johnson'), " +
                    "(4, 'Bob', 'Brown')";
            s.executeUpdate(insertData);
            System.out.println("Sample data inserted (or already existed).");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
