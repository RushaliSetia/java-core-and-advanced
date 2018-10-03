package Question4;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import ConnectionPackage.ConnectionProvider;


public class Menu {

	Connection con=ConnectionProvider.getCon();
	Scanner sc=new Scanner(System.in);
	Date today;
	String dateOut;
	DateFormat dtFmt;


	
	public static void main(String[] args) throws ParseException {
		Menu m=new Menu();
		m.enterData();
	}
	
	public void enterData() throws ParseException
	{
		while(true)
		{
			System.out.println("Select an option");
			System.out.println("\n0.Exit \n1.Show all items \n2.Update Item \n3.Add an Item \n4.Delete an Item \n5.Delete all Items");
			int choice=Integer.parseInt(sc.nextLine());
			
			switch (choice) {
			case 0:
				System.exit(0);
				break;
			case 1:
				displayAll();
				break;
			case 2:
				findData();
				break;
			case 3:
				addData();
				break;
			case 4:
				deleteItem();
				break;
			case 5:
				deleteAllData();
				break;
			default:
				System.out.println("Sorry Wrong choice please enter correct choice");
			}
		}
	}
	
	public void addData() throws ParseException
	{
		System.out.println("Enter Item ID");
		int itemId=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Item Name");
		String itemName=sc.nextLine();  

		try{
		PreparedStatement ps=con.prepareStatement("insert into Item values(?,?,?)");
		ps.setInt(1, itemId);
		ps.setString(2, itemName);
		ps.setString(3, "17-08-18");
		int i=ps.executeUpdate();
		if(i!=0)
		{
			System.out.println("Item Instered");
		}
		else
		{
			System.out.println("Item not inserted");
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void displayAll()
	{
		try{
			PreparedStatement ps=con.prepareStatement("Select * from Item");
			ResultSet res=ps.executeQuery();
			
			while(res.next())
			{
				System.out.println("Item Id :"+res.getInt(1));
				System.out.println("Item Name :"+res.getString(2));
				System.out.println("Item date :"+res.getString(3));
				System.out.println("---------------------------------------------------");
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
	
	public void findData()
	{
		System.out.println("Enter Item Id to update item");
		int itemId=Integer.parseInt(sc.nextLine());
		
		System.out.println("Select Option below");
		System.out.println("\n1.Item Name \n2.Item date");
		int choice=Integer.parseInt(sc.nextLine());
		
		switch(choice)
		{
		case 1:
			try{
				System.out.println("Enter Item Name");
				String name=sc.nextLine();
				PreparedStatement ps=con.prepareStatement("Update ITEM set ITEMNAME= ? where ITEMID=?");
				ps.setString(1, name);
				ps.setInt(2, itemId);
				int i=ps.executeUpdate();
				
				if(i!=0)
				{
					System.out.println("Record Updated");
				}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			
			break;
		case 2:
			try{
				System.out.println("Enter Item date(dd-mm-yy)");
				String date=sc.nextLine();
				PreparedStatement ps=con.prepareStatement("Update set ITEMNAME="+date+" where ITEMID="+itemId);
				int i=ps.executeUpdate();
				
				if(i!=0)
				{
					System.out.println("Record Updated");
				}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			
			break;
		default:
			System.out.println("Sorry Wrong choice start again");
		}
		
		
	}
	
	public void deleteItem()
	{
		try{
			System.out.println("Enter item id to delete");
			int itemId=Integer.parseInt(sc.nextLine());
			PreparedStatement ps=con.prepareStatement("Delete from Item where ITEMID="+itemId);
			int i=ps.executeUpdate();
			
			if(i!=0)
			{
				System.out.println("Record Deleted");
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
	
	public void deleteAllData()
	{
		try{
		
			PreparedStatement ps=con.prepareStatement("Delete FROM Item");
			int i=ps.executeUpdate();
			
			if(i!=0)
			{
				System.out.println("All Records Deleted");
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
}
