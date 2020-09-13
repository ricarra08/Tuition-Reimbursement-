package bs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.beans.Employee;
import com.revature.beans.Form;
import com.revature.dao.FormDAOImpl;
import com.revature.dao.ReimbursementImpl;

public class HomeController {
	
	public static void getHomePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		String s = request.getParameter(null);
		
		if(request.getSession(false) == null || request.getSession().getAttribute("CurrUser") == null) {
			System.out.println("HomeController: reroute to login if no session and null currUser: "+ request.getSession(false));
			RequestDispatcher rd = request.getRequestDispatcher("/LoginEMP.html");
			rd.forward(request,response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("/HomeEMP.html");
			rd.forward(request, response);
		}
	}
	public static void getTrmsForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		String s = request.getParameter(null);
		System.out.println("HomeController"+request.getSession(false));
		/*
		 * if(request.getSession(false) == null ||
		 * request.getSession().getAttribute("CurrUser") == null) { System.out.
		 * println("HomeController: reroute to login if no session and null curUser: "+
		 * request.getSession(false)); RequestDispatcher rd =
		 * request.getRequestDispatcher("/LoginEMP.html"); rd.forward(request,response);
		 * }else {
		 */
			RequestDispatcher rd = request.getRequestDispatcher("/TRF.html");
			rd.forward(request, response);
		}
	
	public static void submitTrmsForm(HttpServletRequest request, HttpServletResponse response) {
		String fname = request.getParameter("Fname");
		String lname = request.getParameter("lname");
		
		String eventName = request.getParameter("EventName");
		
		String role = request.getParameter("role"); //Event Type
		String cost = request.getParameter("cost"); 
		Integer nCost = Integer.parseInt(cost);
		
		String startDate = request.getParameter("trip-start");
		String startTime = request.getParameter("Stime");
		String endTime = request.getParameter("Etime");
		
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String zip = request.getParameter("Zip");
		Integer nZip = Integer.parseInt(zip);
		
		String gradingFormat = request.getParameter("gf");
		String gradeCO = request.getParameter("grade");
		
		String descEvent = request.getParameter("comment"); //Description of Event
		
		Employee emp = (Employee) request.getSession().getAttribute("CurrUser");
		
		ReimbursementImpl ri = new ReimbursementImpl();
		FormDAOImpl fdi = new FormDAOImpl();
		
		ri.insertNewReimbursement(emp.getEmployeeId(), role );
		
		Form tf = new Form(0, 0, fname, lname, eventName, role, nCost, startDate, startTime, endTime,
				address, city, state, nZip, gradingFormat, gradeCO, descEvent);
				
		
		fdi.insertFormDetails(tf, emp.getEmployeeId());
		
		
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(eventName);
		System.out.println(role);
		System.out.println(cost);
		System.out.println(startDate);
		System.out.println(startTime);
		System.out.println(endTime);
		System.out.println(address);
		System.out.println(city);
		System.out.println(state);
		System.out.println(zip);
		System.out.println(gradingFormat);
		System.out.println(gradeCO);
		System.out.println(descEvent);
		
		
		//use a method that inserts into reimbursement  table
		
		
		
	}
}
