package services;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import controller.DBConnect;
import model.item;

public class itemService {

	// Method to add an item to the database
	public void addItem(item item) {
		try {

			// SQL query to insert item details into the database
			String query = "insert into item values('" + item.getItemCode() + "', '" + item.getItemName() + "','"
					+ item.getCategory() + "', '" + item.getQuantity() + "', '" + item.getPrice() + "', '"
					+ item.getDescription() + "')";

			// Creating a statement object
			Statement statement = DBConnect.getConnection().createStatement();

			// Executing the insert query
			statement.executeUpdate(query);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Method to validate if an item exists based on item code
	public boolean validate(item item) {
		try {

			// SQL query to retrieve an item with a given item code
			String query = "select * from item where itemCode = '" + item.getItemCode() + "'";

			// Creating a statement object
			Statement statement = DBConnect.getConnection().createStatement();

			// Executing the query
			ResultSet rs = statement.executeQuery(query);

			if (rs.next()) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	// Method to retrieve details of a single item based on item code
	public item getOne(item item) {
		try {

			// SQL query to retrieve an item with a given item code
			String query = "select * from item where itemCode = '" + item.getItemCode() + "'";

			Statement statement = DBConnect.getConnection().createStatement();

			// Executing the query
			ResultSet rs = statement.executeQuery(query);

			if (rs.next()) {
				// Set item details from the result set to the item object
				item.setItemCode(rs.getString("itemCode"));
				item.setItemName(rs.getString("itemName"));
				item.setCategory(rs.getString("category"));
				item.setQuantity(rs.getInt("quantity"));
				item.setPrice(rs.getDouble("price"));
				item.setDescription(rs.getString("description"));
				return item;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Method to retrieve details of all items
	public ArrayList<item> getAllItem() {
		try {

			// Creating an array list to store items
			ArrayList<item> listItem = new ArrayList<item>();

			// SQL query to retrieve all items
			String query = "select * from item";

			Statement statement = DBConnect.getConnection().createStatement();

			ResultSet rs = statement.executeQuery(query);

			// Loop through the result set and add each item to the list
			while (rs.next()) {
				item item = new item();
				item.setItemCode(rs.getString("itemCode"));
				item.setItemName(rs.getString("itemName"));
				item.setCategory(rs.getString("category"));
				item.setQuantity(rs.getInt("quantity"));
				item.setPrice(rs.getDouble("price"));
				item.setDescription(rs.getString("description"));

				listItem.add(item);

			}
			return listItem;

		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}
	}

	// Method to retrieve a single item based on its item code
	public item singleDataButton(item item) {
		try {

			// SQL query to retrieve an item with a given item code
			String query = "select * from item where itemCode = '" + item.getItemCode() + "'";

			Statement statement = DBConnect.getConnection().createStatement();

			ResultSet rs = statement.executeQuery(query);

			if (rs.next()) {
				// Set item details from the result set to the item object
				item.setItemCode(rs.getString("itemCode"));
				item.setItemName(rs.getString("itemName"));
				item.setCategory(rs.getString("category"));
				item.setQuantity(rs.getInt("quantity"));
				item.setPrice(rs.getDouble("price"));
				item.setDescription(rs.getString("description"));
				return item;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Method to update item details
	public void updateItem(item item) {
		try {

			// SQL query to update item details in the database
			String query = "update item SET itemCode = '" + item.getItemCode() + "', itemName = '" + item.getItemName()
					+ "', category = '" + item.getCategory() + "', quantity = '" + item.getQuantity() + "', price = '"
					+ item.getPrice() + "', description = '" + item.getDescription() + "' where itemCode='"
					+ item.getItemCode() + "'";

			// Creating a statement object
			Statement statement = DBConnect.getConnection().createStatement();

			// Executing the update query
			statement.executeUpdate(query);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Method to delete an item from the database
	public void deleteItem(item item) {
		try {

			// SQL query to delete an item from the database
			String query = "Delete from item where itemCode = '" + item.getItemCode() + "'";

			// Creating a statement object
			Statement statement = DBConnect.getConnection().createStatement();

			// Executing the delete query
			statement.executeUpdate(query);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// Method to retrieve details of all items for display
	public ArrayList<item> getDisplayItem() {
		try {

			// Creating an array list to store items
			ArrayList<item> listite = new ArrayList<item>();

			// SQL query to retrieve all items
			String query = "select * from item";

			// Creating a statement object
			Statement statement = DBConnect.getConnection().createStatement();

			// Executing the query
			ResultSet rs = statement.executeQuery(query);

			// Loop through the result set and add each item to the list
			while (rs.next()) {
				item item = new item();
				item.setItemCode(rs.getString("itemCode"));
				item.setItemName(rs.getString("itemName"));
				item.setCategory(rs.getString("category"));
				item.setQuantity(rs.getInt("quantity"));
				item.setPrice(rs.getDouble("price"));
				item.setDescription(rs.getString("description"));
				listite.add(item);

			}
			return listite;// Return the list of items
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// Method to retrieve details of a single item for display
	public item buttonDisplay(item item) {
		try {

			// SQL query to retrieve an item with a given item code
			String query = "select * from item where itemCode = '" + item.getItemCode() + "'";

			// Creating a statement object
			Statement statement = DBConnect.getConnection().createStatement();

			// Executing the query
			ResultSet rs = statement.executeQuery(query);

			// If there's at least one result
			if (rs.next()) {
				item.setItemCode(rs.getString("itemCode"));
				item.setItemName(rs.getString("itemName"));
				item.setCategory(rs.getString("category"));
				item.setQuantity(rs.getInt("quantity"));
				item.setPrice(rs.getDouble("price"));
				item.setDescription(rs.getString("description"));
				return item;// Return the item object
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		// Return null if no item found
		return null;
	}

}
