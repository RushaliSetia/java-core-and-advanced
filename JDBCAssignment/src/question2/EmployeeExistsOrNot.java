package question2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import Connection.ConnectionProvider;

public class EmployeeExistsOrNot {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		EmployeeExistsOrNot obj = new EmployeeExistsOrNot();
		obj.add();
	}

	public void add() {
		System.out.println("enter the employee id u want to search for:");
		int id = Integer.parseInt(sc.nextLine());
		try {
			Connection con = ConnectionProvider.getCon();
			PreparedStatement ps = con.prepareStatement("select * from employee");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("employee id:" + rs.getInt(1));
				if (rs.getInt(1) == id) {
					System.out.println(rs.getInt(1));
					System.out.println(rs.getString(2));
					System.out.println(rs.getShort(3));
					System.out.println(rs.getInt(4));
					System.out.println(rs.getString(5));
					System.out.println(rs.getDouble(6));
					System.out.println(rs.getDouble(7));
					System.out.println(rs.getInt(8));
				} // end of if
			} // end of while
		} // end of try
		catch (Exception e) {
			e.printStackTrace();
		} // end of catch
	}// end of add()
}// end class
