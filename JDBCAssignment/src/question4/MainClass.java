package question4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import Connection.ConnectionProvider;

public class MainClass {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		MainClass obj = new MainClass();
		while (true) {
			System.out.println(
					"1.show all items\n2.search item\n3.update the item\n4.add item\n5.delete an item\n6.delete all items\n7.exit");
			System.out.println("enter choice:");
			int ch = Integer.parseInt(sc.nextLine());
			switch (ch) {
			case 1:
				obj.show();
				break;
			case 2:
				obj.search();
				break;
			case 3:
				obj.update();
				break;
			case 4:
				obj.add();
				break;
			case 5:
				obj.delete();
				break;
			case 6:
				obj.deleteAll();
				break;
			case 7:
				System.exit(0);
				break;
			default:
				System.out.println("wrong choice!!!!");
			}// end of switch
		} // end of while
	}// end of main

	private void deleteAll() {
		try {
			Connection con = ConnectionProvider.getCon();
			String query = "delete from item";
			PreparedStatement ps = con.prepareStatement(query);
			int i = ps.executeUpdate();
			if (i != 0) {
				System.out.println("record deleted......");
			} // end of if
		} // end of try
		catch (Exception e) {
			e.printStackTrace();
		} // end of catch
	}// end of deleteAll()

	private void delete() {

		System.out.println("enter the item id for the item u want to delete:");
		int id = Integer.parseInt(sc.nextLine());
		try {
			Connection con = ConnectionProvider.getCon();
			String query = "delete from item where item_id=" + id;
			PreparedStatement ps = con.prepareStatement(query);
			int i = ps.executeUpdate();
			if (i != 0) {
				System.out.println("record deleted......");
			} // end of if
		} // end of try
		catch (Exception e) {
			e.printStackTrace();
		} // end of catch
	}// end of delete()

	private void update() {
		System.out.println("enter the item id for the item u want to update:");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("enter item name:");
		String name = sc.nextLine();
		System.out.println("enter creation time:");
		int time = Integer.parseInt(sc.nextLine());
		try {
			Connection con = ConnectionProvider.getCon();
			String query = "update item set item_name=?,item_time=? where item_id=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, name);
			ps.setInt(2, time);
			ps.setInt(3, id);
			int i = ps.executeUpdate();
			if (i != 0) {
				System.out.println("record updated .......");
			} // end of if
		} // end of try

		catch (Exception e) {
			e.printStackTrace();
		} // end of catch
	}// end of update()

	public void show() {
		try {
			Connection con = ConnectionProvider.getCon();
			String query = "select * from item";
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("the details of the item are----------");
				System.out.println("item id:" + rs.getInt(1));
				System.out.println("item name:" + rs.getString(2));
				System.out.println("time taken to prepare it:" + rs.getInt(3));
			} // end of while
		} // end of try
		catch (Exception e) {
			e.printStackTrace();
		} // end of catch
	}// end of show()

	public void search() {
		System.out.println("enter the item id u want to search for:");
		int id = Integer.parseInt(sc.nextLine());
		try {
			Connection con = ConnectionProvider.getCon();
			PreparedStatement ps = con.prepareStatement("select * from item where item_id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(
						"item id:" + rs.getInt(1) + "\nitem name:" + rs.getString(2) + "\nitem time:" + rs.getInt(3));

			} // end of while
		} // end try
		catch (Exception e) {
			e.printStackTrace();
		} // end catch
	}// end of search

	public void add() {
		int i = 0;
		System.out.println("enter the  item id:");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("enter item name:");
		String name = sc.nextLine();
		System.out.println("enter creation time:");
		int time = Integer.parseInt(sc.nextLine());
		try {
			Connection con = ConnectionProvider.getCon();
			PreparedStatement ps = con.prepareStatement("insert into item values(?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, time);
			if (i != 0) {
				System.out.println("record inserted successfully.....");
			} // end of if
			else {
				System.out.println("record not added..........");
			} // end of else
		} // end of try
		catch (Exception e) {
			e.printStackTrace();
		} // end of catch
	}// end of method
}// end of class
