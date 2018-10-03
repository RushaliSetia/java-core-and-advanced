package question6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Connection.ConnectionProvider;

public class UpdataAllData {

	public static void main(String[] args) {

		try {
			Connection con = ConnectionProvider.getCon();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM ITEM");
			ResultSet res = ps.executeQuery();

			while (res.next()) {
				res.updateDouble(3, res.getDouble(3) + (res.getDouble(3) * 2) / 100);
			}

			System.out.println("Price updated");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
