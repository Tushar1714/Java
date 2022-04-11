package Practice;
import java.sql.*;
public class JDBC1 {

public static void main(String[] ss) {
		
		try {
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//creating a connection
			
			String url = "jdbc:mysql://localhost:3306/tushardb";
			String username = "root";
			String password = "root";
		Connection con =DriverManager.getConnection(url,username,password);
		
		if (con.isClosed()) {
			System.out.println("Connection is still Closed");
		}
		else {
			System.out.println("Connection Created");
		}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	}


