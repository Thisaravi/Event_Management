package EventPlanner;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {
	
	private static String url="jdbc:mysql://localhost:3306/event";
	private static String user = "root";
	private static String pw = "root";
	private static Connection con;
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url,user,pw);
		}
		catch(Exception e) {
			System.out.println("Database connection is unsuccessfull!");
			
	}
		
		return con;
}
}
