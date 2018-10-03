package question5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import Connection.ConnectionProvider;

public class DisplayMetaData {

	public static void main(String[] args) {
		try {
			Connection con = ConnectionProvider.getCon();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM ITEM");
			ResultSet res = ps.executeQuery();
			ResultSetMetaData rsmd = res.getMetaData();
			System.out.println("Total nunber of columns " + rsmd.getColumnCount());
			System.out.println(
					"Name of column 1 is " + rsmd.getColumnName(1) + " having type " + rsmd.getColumnTypeName(1));
			System.out.println(
					"Name of column 2 is " + rsmd.getColumnName(2) + " having type " + rsmd.getColumnTypeName(2));
			System.out.println(
					"Name of column 3 is " + rsmd.getColumnName(3) + " having type " + rsmd.getColumnTypeName(3));
			System.out
					.println("---------------------------------------------------------------------------------------");

			while (res.next()) {
				System.out.println("Item ID :" + res.getInt(1) + " ,Item Name :" + res.getString(2) + " ,Item price :"
						+ res.getDouble(3));
				System.out.println();
			}
			System.out.println(
					"----------------------------------------------------------------------------------------");
		} catch (Exception e) {

		}
	}
}
