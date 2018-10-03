package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

	static Connection con = null;

	public static Connection getCon() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		} // end of try
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} // end of catch
		return con;
	}// end of getCon()
}// end of class
