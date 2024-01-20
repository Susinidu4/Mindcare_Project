package Insert;

import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class FeedbackInsertDB_Util {

	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static boolean insertfeedback(String name, String email, String rating, String message) {

		boolean isSuccess = false;
		
		try {
			
			con = DBconnect.getConnection();
			stmt = (Statement) con.createStatement();
			String sql = "insert into feedback values(0,'"+name+"','"+email+"','"+rating+"','"+message+"')";
			int rs = stmt.executeUpdate(sql);

			if(rs > 0)
			{
				isSuccess = true;
			}
			else
			{
				isSuccess = false;
			}

		}
		catch(Exception e){
			e.printStackTrace();
		}

		return isSuccess;
	}
	
	
}
