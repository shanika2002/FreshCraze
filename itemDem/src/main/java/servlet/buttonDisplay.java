package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.item;
import services.itemService;

@WebServlet("/buttonDisplay")
public class buttonDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public buttonDisplay() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	// doPost method is invoked when the servlet receives an HTTP POST request
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Creating a new item object and setting its item code from request parameter
		item item = new item();
		item.setItemCode(request.getParameter("itemCode"));

		// Creating an instance of the itemService class to retrieve item details
		itemService service = new itemService();

		// Retrieving item details based on the item code
		item ite = service.buttonDisplay(item);

		// Forwarding the request to the Categories.jsp page
		RequestDispatcher dispatcher = request.getRequestDispatcher("Categories.jsp");

		// Setting the retrieved item as a request attribute to be forwarded to the JSP
		// page
		request.setAttribute("item", ite);

		// Forwarding the request
		dispatcher.forward(request, response);
	}

}
