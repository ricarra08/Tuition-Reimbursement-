package bs.controller;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.beans.Employee;
import com.revature.dao.EmployeeDAOImpl;
import com.revature.util.ConnFactory;

public class AuthenticateController {
	public static ConnFactory cf= ConnFactory.getInstance();
	
	
	public static void login(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		/*
		 * Make sure the request is coming from the post method 
		 * otherwise redirect the user to the main page
		 */
		if(!request.getMethod().equals("POST")) { 
			System.out.println("Sending a login request using get");
			response.setStatus(401); //status for unauthorized access
			request.getRequestDispatcher("/LoginEMP.html").forward(request, response);
			
		}else {
			// Take the email and password from the user			 
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			
			/*
			 * some logic pulling information from the database
			 * we have getEmployeeLogin(email,password)
			 */
			EmployeeDAOImpl edi = new EmployeeDAOImpl();
			Employee curr = edi.getEmployeeLogin(email,password);
			
			if(curr != null) {
								
				HttpSession session = request.getSession();
				session.setAttribute("CurrUser", curr);
			
				System.out.println("AuthenticateControl Created Session: " +  request.getSession());
				response.sendRedirect("http://localhost:8080/Project1/api/home");// Forward the user and will cause url to change
		
			}else {
				System.out.println("Wrong Password and email");
				//Incorrect email and password
				PrintWriter pw = response.getWriter();
				response.setContentType("text/html");
				//Send JavaScript alert message
				pw.println("<script type=\"text/javascript\">");
				pw.println("alert('Username and password do not match');");
				pw.println("</script>");
				//Forward the user to the home page
				request.getRequestDispatcher("/LoginEMP.html").include(request, response);
				pw.close();
			}
		}
	}

	public static void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("Authenticaticate: Login out ");
		request.getSession().invalidate();
		response.sendRedirect("http://localhost:8080/Project1/api/");
		
	}
}
