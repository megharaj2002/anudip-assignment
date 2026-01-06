import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExampleOfResultset {

    public static void main(String[] args) {

        String jdbcurl = "jdbc:mysql://127.0.0.1:3306/anpd3911";
        String username = "root";
        String password = "root1234";

        try (Connection c = DriverManager.getConnection(jdbcurl, username, password);
                Statement s = c.createStatement()) {
            String select_Data = "SELECT id, name from users";
            ResultSet resultSet = s.executeQuery(select_Data);

            // Iterating over the resultset.

            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");

                System.out.println("ID : " + id + ", Name : " + name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
