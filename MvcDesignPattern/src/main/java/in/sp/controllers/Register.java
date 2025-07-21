package in.sp.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import in.sp.dbCon.DbConnection;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// Servlet annotation to map this servlet to /regForm URL
@WebServlet("/regForm")
public class Register extends HttpServlet {
	
	// Handles POST requests for user registration
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// Get the PrintWriter to write response
		PrintWriter out= resp.getWriter();
		
		// Set response content type to HTML
		resp.setContentType("text/html");
		
		// Retrieve form parameters from the request
		String myName = req.getParameter("name1");
		String myEmail = req.getParameter("email1");
		String myPass = req.getParameter("pass1");
		String myCity = req.getParameter("city1");
		
		// Try to insert the user data into the database
		try {
			// Get database connection
			Connection con = DbConnection.getConnection();
			
			// Prepare SQL insert statement
			String insert_query = "INSERT INTO register VALUES (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(insert_query);
			ps.setString(1, myName);
			ps.setString(2, myEmail);
			ps.setString(3, myPass);
			ps.setString(4, myCity);
			
			// Execute the insert statement
			int count = ps.executeUpdate();
			
			// If insert is successful, show success message and include login page
			if(count>0) {
				out.println("<h3 style='color:green' > Register Succefully </h3>");
				RequestDispatcher rd = req.getRequestDispatcher("/login.html");
				rd.include(req, resp);
			}else {
				// If insert fails, show error message and include register page
				out.println("<h3 style='color:red' > user not registered due to some error </h3>");
				RequestDispatcher rd = req.getRequestDispatcher("/register.html");
				rd.include(req, resp);
			}
			
		} catch (Exception e) {
			// Print stack trace if any exception occurs
			e.printStackTrace();
		}
		
	}
	
}