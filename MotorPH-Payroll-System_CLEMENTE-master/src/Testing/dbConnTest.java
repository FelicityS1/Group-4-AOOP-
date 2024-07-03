package Testing;

import static org.junit.Assert.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.junit.Test;

public class dbConnTest {

	 @Test
	    public void testDatabaseConnection() {
	        String url = "jdbc:mysql://localhost:3306/motorph";
	        String username = "root";
	        String password = "dmns!!404"; 

	        try {
	            Connection conn = DriverManager.getConnection(url, username, password);
	            assertNotNull(conn); // Assert that connection is not null
	            System.out.println("Database connection successful.");
	            conn.close(); // Close the connection
	        } catch (SQLException e) {
	            fail("Database connection failed: " + e.getMessage());
	        }
	    }

}
