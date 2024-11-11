package services;

import java.sql.ResultSet;
import java.sql.Statement;

import controller.DBConnect;
import model.admin;

public class adminService {

	// Method to register a new admin
	public void regAdmin(admin ad) {
		try {

			// Method to register a new admin
			String query = "insert into admin values('" + ad.getId() + "' , '" + ad.getName() + "' , '"
					+ ad.getAddress() + "' , '" + ad.getPhoneNumber() + "' , '" + ad.getEmail() + "' , '"
					+ ad.getPassword() + "') ";

			// Creating a statement object
			Statement statement = DBConnect.getConnection().createStatement();

			// Executing the insert query
			statement.executeUpdate(query);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// Method to validate admin credentials
	public boolean validate(admin ad) {
		try {

			// SQL query to retrieve admin with given email and password
			String query = "select * from admin where email = '" + ad.getEmail() + "' and password = '"
					+ ad.getPassword() + "'";

			// Creating a statement object
			Statement statement = DBConnect.getConnection().createStatement();

			// Executing the query
			ResultSet rs = statement.executeQuery(query);

			// If there's at least one result, return true
			if (rs.next()) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		// If no result found, return false
		return false;
	}

	// Method to get admin details based on email and password
	public admin getOne(admin ad) {
		try {

			// SQL query to retrieve admin with given email and password
			String query = "select * from admin where email = '" + ad.getEmail() + "' and password = '"
					+ ad.getPassword() + "'";

			// Creating a statement object
			Statement statement = DBConnect.getConnection().createStatement();

			// Executing the query
			ResultSet rs = statement.executeQuery(query);

			// If there's at least one result
			if (rs.next()) {
				// Set admin details from the result set to the admin object
				ad.setId(rs.getString("id"));
				ad.setName(rs.getString("name"));
				ad.setAddress(rs.getString("address"));
				ad.setPhoneNumber(rs.getString("phoneNumber"));
				ad.setEmail(rs.getString("email"));
				ad.setPassword(rs.getString("password"));
				return ad;// Return the admin object
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		// Return null if no admin found
		return null;
	}

}
