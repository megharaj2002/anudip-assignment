import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExampleForPreparedStatement {

    public static void main(String[] args) {

        String jdbcurl = "jdbc:mysql://localhost:3306/anpd3911";
        String username = "root";
        String password = "root1234";

        int userId = 2;
        String userName = "Megharaj";
        String userEmail = "megharaj@gmail.com";

        String insertData = "INSERT INTO user(id, name, email) VALUES(?, ?, ?)";

        Connection c = null;

        try {
            c = DriverManager.getConnection(jdbcurl, username, password);
            PreparedStatement ps = c.prepareStatement(insertData);
            ps.setInt(1, userId);
            ps.setString(2, userName);
            ps.setString(3, userEmail);

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Record inserted successfully");
            } else {
                System.out.println("Failed to insert record");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (c != null) {
                    c.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}
