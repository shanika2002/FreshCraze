package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	// This method establishes a database connection
	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		// Database credentials
		String username = "root";
		String password = "shanika2002";

		// Registering the MySQL JDBC driver
		Class.forName("com.mysql.jdbc.Driver");

		// Establishing a connection to the database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database?characterEncoding=utf8",
				username, password);

		return con;// Returning the established database connection

	}
}
