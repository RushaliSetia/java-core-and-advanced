package question1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import Connection.ConnectionProvider;

public class CountEmployees {

	public static void main(String[] args) {
		int count = 0;
		try {
			Connection con = ConnectionProvider.getCon();
			Statement st = con.createStatement();
			ResultSet rs;
			String query = "select * from employees";
			rs = st.executeQuery(query);
			while (rs.next()) {
				count++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("the number of records present in the employee tABLE ARE:"+count);
	}
}
