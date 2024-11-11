package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.admin;
import services.adminService;

@WebServlet("/addAdmin")
public class addAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public addAdmin() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	// doPost method is invoked when the servlet receives an HTTP POST request
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Creating a new admin object and setting its attributes from request
		// parameters
		admin ad = new admin();
		ad.setId(request.getParameter("adminid"));
		ad.setName(request.getParameter("adminname"));
		ad.setAddress(request.getParameter("address"));
		ad.setPhoneNumber(request.getParameter("phonenumber"));
		ad.setEmail(request.getParameter("email"));
		ad.setPassword(request.getParameter("password"));

		// Creating an instance of the adminService class to perform admin registration
		adminService service = new adminService();
		service.regAdmin(ad);

		// Forwarding the request to the index.jsp page
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");

		dispatcher.forward(request, response);
	}

}
