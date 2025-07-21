package in.sp.controllers;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/logout")
public class Logout extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Invalidate the session to log out the user
		HttpSession session = req.getSession();
		session.invalidate();
		
		// Set response content type to HTML
		RequestDispatcher rd = req.getRequestDispatcher("/login.html");
		rd.forward(req, resp);
		
	}
	
}
