package Insert;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

@WebServlet("/UpdateFeedback")
public class UpdateFeedback extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h2>Registration Sucessfully</h2>");
		
		String fid = request.getParameter("id");
		String fname = request.getParameter("name");
		String femail = request.getParameter("email");
		String frating = request.getParameter("rating");
		String fmessage = request.getParameter("message");
		
		Connection con = null ;
		PreparedStatement pst = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mindcare","root","NiduDB04");
			pst = (PreparedStatement) con.prepareStatement("update feedback set Name = ?, Email = ?, Rating = ?, Message = ? where ID = ?");
			pst.setString(1, fname);
			pst.setString(2, femail);
			pst.setString(3, frating);
			pst.setString(4, fmessage);
			pst.setString(5, fid);
			pst.executeUpdate();
			response.sendRedirect("FeedbackDisplay.jsp");
			
			
		}
		catch(Exception e){
			e.printStackTrace();
			out.println(e.getMessage());
		}
	}

}
