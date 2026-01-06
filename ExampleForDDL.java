import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExampleForDDL {

    public static void main(String[] args) {

        String jdbcurl = "jdbc:mysql://127.0.0.1:3306/anpd3911";
        String username = "root";
        String password = "root1234";

        try (Connection c = DriverManager.getConnection(jdbcurl, username, password);
                Statement s = c.createStatement()) {
            // Ensure table doesn't exist before creating (for clean run)
            s.execute("DROP TABLE IF EXISTS user_ddl_test");

            String createTable = "CREATE TABLE user_ddl_test(id INT primary key, name VARCHAR(255))";
            s.execute(createTable);
            System.out.println("Table created successfully!");

            String alterTable = "ALTER TABLE user_ddl_test ADD COLUMN email varchar(255)";
            s.execute(alterTable);
            System.out.println("Table altered!");

            String dropTable = "DROP TABLE user_ddl_test";
            s.execute(dropTable);
            System.out.println("Table dropped successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
