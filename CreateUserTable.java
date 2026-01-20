import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateUserTable {

    public static void main(String[] args) {

        String jdbcurl = "jdbc:mysql://localhost:3306/anpd3911";
        String username = "root";
        String password = "root1234";

        try (Connection c = DriverManager.getConnection(jdbcurl, username, password);
                Statement s = c.createStatement()) {

            String createTable = "CREATE TABLE IF NOT EXISTS user(id INT PRIMARY KEY, name VARCHAR(255), email VARCHAR(255))";
            s.execute(createTable);
            System.out.println("Table 'user' created successfully (if it didn't exist).");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
