package Insert;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.PreparedStatement;



@WebServlet("/DeleteFeedback")
public class DeleteFeedback extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Connection con;
	Statement stat;
	PreparedStatement pst;
	ResultSet rs;
	int row;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("tex/htmlt");
		PrintWriter out = response.getWriter();
		out.println("<h2>Feedback Delete Successfull</h2>");
		
		String id = request.getParameter("d");
		Integer sid = Integer.parseInt(id);
		out.print(id);
		out.println(sid);
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mindcare","root","NiduDB04");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("delete from feedback where ID = '"+sid+"'");
			response.sendRedirect("FeedbackDisplay.jsp");
			
		}catch(Exception e) {
			e.printStackTrace();
			out.println(e.getMessage());
		}
	}


}
