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

@WebServlet("/check")
public class check extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public check() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	// Handling POST requests for item validation
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Creating a new item object and setting its item code from request parameter
		item item = new item();

		item.setItemCode(request.getParameter("itemCode"));

		// Creating an instance of the itemService class to perform item validation
		itemService service = new itemService();

		// Validating the item
		boolean status = service.validate(item);

		// Redirecting to appropriate page based on validation status
		if (status) {
			// If item is valid, retrieve item details and forward to product.jsp
			item checkedItem = service.getOne(item);
			RequestDispatcher dispatcher = request.getRequestDispatcher("product.jsp");
			request.setAttribute("item", checkedItem);
			dispatcher.forward(request, response);
		} else {
			// If item is not valid, forward back to checkItem.jsp
			RequestDispatcher dispatcher = request.getRequestDispatcher("checkItem.jsp");
			dispatcher.forward(request, response);
		}

	}
}
