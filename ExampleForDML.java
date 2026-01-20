import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExampleForDML {

    public static void main(String[] args) {

        String jdbcurl = "jdbc:mysql://127.0.0.1:3306/anpd3911";
        String username = "root";
        String password = "root1234";

        try (Connection c = DriverManager.getConnection(jdbcurl, username, password);
                Statement s = c.createStatement()) {
            // Setup: Create table for DML operations
            s.execute(
                    "CREATE TABLE IF NOT EXISTS dml_users(id INT PRIMARY KEY, name VARCHAR(255), email VARCHAR(255))");
            s.execute("TRUNCATE TABLE dml_users"); 

            // 1. INSERT
            System.out.println("--- INSERT Operation ---");
            String insertQuery = "INSERT INTO dml_users(id, name, email) VALUES (1, 'John Doe', 'john@example.com')";
            int rows = s.executeUpdate(insertQuery);
            System.out.println(rows + " row(s) inserted.");
            printData(s);

            // 2. UPDATE
            System.out.println("\n--- UPDATE Operation ---");
            String updateQuery = "UPDATE dml_users SET email = 'john.doe@newdomain.com' WHERE id = 1";
            rows = s.executeUpdate(updateQuery);
            System.out.println(rows + " row(s) updated.");
            printData(s);

            // 3. DELETE
            System.out.println("\n--- DELETE Operation ---");
            String deleteQuery = "DELETE FROM dml_users WHERE id = 1";
            rows = s.executeUpdate(deleteQuery);
            System.out.println(rows + " row(s) deleted.");
            printData(s);

            // Cleanup
            s.execute("DROP TABLE dml_users");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private static void printData(Statement s) throws SQLException {
        ResultSet rs = s.executeQuery("SELECT * FROM dml_users");
        if (!rs.isBeforeFirst()) {
            System.out.println("Table is empty.");
        }
        while (rs.next()) {
            System.out.println(
                    "ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Email: " + rs.getString("email"));
        }
    }

}
