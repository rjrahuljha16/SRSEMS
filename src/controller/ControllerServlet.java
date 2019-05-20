package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.EmployeeDao;

@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     private EmployeeDao employeeDao;
     
     public void init()
     {
    	 String jdbcURL=getServletContext().getInitParameter("jdbcURL");
    	 String jdbcUsername= getServletContext().getInitParameter("jdbcUsername");
    	 String jdbcPassword= getServletContext().getInitParameter("jdbcPassword");
    	 
    	 employeeDao= new EmployeeDao(jdbcURL, jdbcUsername, jdbcPassword);
     }
   
    public ControllerServlet() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
