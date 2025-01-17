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

@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public login() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Creating a new admin object and setting its email and password from request
		// parameters
		admin ad = new admin();

		ad.setEmail(request.getParameter("username"));
		ad.setPassword(request.getParameter("password"));

		// Creating an instance of the adminService class to perform login validation
		adminService service = new adminService();

		// Validating the login credentials
		boolean status = service.validate(ad);

		// Redirecting to appropriate page based on login status
		if (status) {
			// If login is successful, retrieve admin details and forward to profile.jsp
			admin loginedad = service.getOne(ad);
			RequestDispatcher dispatcher = request.getRequestDispatcher("profile.jsp");
			request.setAttribute("admin", loginedad);
			dispatcher.forward(request, response);
		} else {
			// If login fails, forward back to login.jsp
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		}

	}
}
