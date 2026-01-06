import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExampleForStatement {

	public static void main(String[] args) {
	
		String jdbcurl = "jdbc:mysql://127.0.0.1:3306/anpd3911";
		String username = "root";
		String password = "root1234";
		
		try {
			Connection c = DriverManager.getConnection(jdbcurl, username, password);
			
			//create a statement object
			Statement s = c.createStatement();
			
			//Creating a new table
			String createTable = "CREATE TABLE IF NOT EXISTS users(id INT PRIMARY key, name VARCHAR(255))";
		    s.execute(createTable);
		    System.out.println("Table created successfully");
		    
		    //Insert data into the table
		    // Using INSERT IGNORE to avoid errors if data already exists
		    String insertData = "INSERT IGNORE into users(id, name) VALUES(1, 'Madhu'),(2, 'Vamsi'),(3, 'Iram')";
		    int rowsAffected = s.executeUpdate(insertData);
		    System.out.println(rowsAffected + " added successfully");
		    
		    //Retrieve data from the table
		    String selectData = "SELECT * FROM users";
		    ResultSet rs = s.executeQuery(selectData);
		    
		    while(rs.next()) {
		    	System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
		    }
		    
		    rs.close();
		    s.close();
		    c.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}

}
