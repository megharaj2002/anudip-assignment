import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExampleForConnection {

    public static void main(String[] args) {

        String jdbcurl = "jdbc:mysql://127.0.0.1:3306/anpd3911";
        String username = "root";
        String password = "root1234";

        try {
            Connection c = DriverManager.getConnection(jdbcurl, username, password);
            System.out.println("Connection successful");
            c.close();
        } catch (SQLException e) {
            System.out.println("SQL State: " + e.getSQLState());
            System.out.println("Error Code: " + e.getErrorCode());
            e.printStackTrace();
        }
    }

}
