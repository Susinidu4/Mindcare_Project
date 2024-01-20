package Insert;

import java.sql.DriverManager;
import com.mysql.jdbc.Connection;

public class DBconnect {
	
	private static String url = "jdbc:mysql://localhost:3306/mindcare";
	private static String userName = "root";
	private static String password = "NiduDB04";
	private static Connection con;
	
	public static Connection getConnection() {
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = (Connection) DriverManager.getConnection(url,userName, password);
			
		}
		catch(Exception e){
			System.out.println("Database connection is not successfull");
		}
		return con;
		
	}
	
}
