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

@WebServlet("/updateItem")
public class updateItem extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public updateItem() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	// Handling POST requests to update item details
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Creating a new item object and setting its attributes from request parameters
		item item = new item();

		item.setItemCode(request.getParameter("itemCode"));
		item.setItemName(request.getParameter("itemName"));
		item.setCategory(request.getParameter("category"));
		item.setQuantity(Integer.parseInt(request.getParameter("quantity")));
		item.setPrice(Double.parseDouble(request.getParameter("price")));
		item.setDescription(request.getParameter("description"));

		// Creating an instance of the itemService class to perform item update
		itemService service = new itemService();
		service.updateItem(item);

		// Forwarding the request to the adminItem servlet
		RequestDispatcher dispatcher = request.getRequestDispatcher("adminItem");
		dispatcher.forward(request, response);

	}

}
