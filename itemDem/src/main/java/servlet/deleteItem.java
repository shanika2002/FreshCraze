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

@WebServlet("/deleteItem")
public class deleteItem extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public deleteItem() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	// Handling POST requests to delete an item
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Creating a new item object and setting its item code from request parameter
		item item = new item();
		item.setItemCode(request.getParameter("itemCode"));

		// Creating an instance of the itemService class to perform item deletion
		itemService service = new itemService();

		// Deleting the item
		service.deleteItem(item);

		// Forwarding the request to the adminItem servlet
		RequestDispatcher dispatcher = request.getRequestDispatcher("adminItem");

		dispatcher.forward(request, response);
	}

}
