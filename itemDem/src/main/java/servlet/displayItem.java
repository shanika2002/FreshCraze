package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.item;
import services.itemService;

@WebServlet("/displayItem")
public class displayItem extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public displayItem() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	// Handling POST requests to display all items
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Creating an instance of the itemService class to retrieve all items
		itemService service = new itemService();

		// Retrieving all items
		ArrayList<item> item = service.getDisplayItem();

		// Setting the retrieved items as a request attribute to be forwarded to the JSP
		// page
		request.setAttribute("item", item);

		// Forwarding the request to the displayItem.jsp page
		RequestDispatcher dispatcher = request.getRequestDispatcher("displayItem.jsp");

		dispatcher.forward(request, response);
	}

}
