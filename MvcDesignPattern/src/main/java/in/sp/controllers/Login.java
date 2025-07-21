package in.sp.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import in.sp.dbCon.DbConnection;
import in.sp.model.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


// Servlet annotation to map this servlet to /loginForm URL
@WebServlet("/loginForm")
public class Login extends HttpServlet {
	
	// Handles POST requests for user login
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// Get the PrintWriter to write response
		PrintWriter out = resp.getWriter();
		// Set response content type to HTML
		resp.setContentType("text/html");
		
		// Retrieve form parameters from the request
		String myEmail = req.getParameter("email1");
		String myPass = req.getParameter("pass1");
		
		try {
			// Get database connection
			Connection con = DbConnection.getConnection();
			
			// Prepare SQL select statement to check user credentials
			String select_query = "SELECT * FROM register where email=? AND password=?";
			PreparedStatement ps= con.prepareStatement(select_query);
			ps.setString(1, myEmail);
			ps.setString(2, myPass);
			
			// Execute the query
			ResultSet rs= ps.executeQuery();
			
			// If user exists, create session and forward to profile page
			if(rs.next()) {
				User user = new User();
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setCity(rs.getString("city"));
				
				// Create session and set user attribute
				HttpSession session =req.getSession();
				session.setAttribute("session_user", user);
				
				// Forward to profile.jsp
				RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
				rd.forward(req, resp);
				
			}else {
				// If credentials don't match, show error and include login page
				out.println("<h3 style='color:red' >Email id and Password didn't matched </h3>");
				RequestDispatcher rd = req.getRequestDispatcher("/login.html");
				rd.include(req, resp);
			}
			
		} catch (Exception e) {
			// Print stack trace if any exception occurs
			e.printStackTrace();
		}
		
	}
	
}