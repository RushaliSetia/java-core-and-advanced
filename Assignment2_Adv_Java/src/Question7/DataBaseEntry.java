package Question7;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import ConnectionPackage.ConnectionProvider;

public class DataBaseEntry {

	Scanner sc=new Scanner(System.in);
	Connection con=ConnectionProvider.getCon();
	
	public static void main(String[] args) {
		DataBaseEntry dbe=new DataBaseEntry();
		dbe.selectChoice();
	}
	
	public void selectChoice()
	{
		while(true){
		System.out.println("Select a choice");
		System.out.println("\n0.Exit \n1.Add Customers \n2.Display Data");
		int choice=Integer.parseInt(sc.nextLine());
		
		   switch(choice)
		   {
		   case 0:
			   System.exit(0);
			   break;
		   case 1:
			   enterData();
			   break;
		   case 2:
			   displayData();
			   break;
		   default:
			   System.out.println("Sorry Worng choice please select again");
		   }
		}
		
		
	}
	public void enterData()
	{
		System.out.println("Enter total Number of customers you want to add");
		int count=Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<count;i++)
		{
			System.out.println("Enter customer Id");
			int custId=Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter customer name");
			String custName=sc.nextLine();
			
			System.out.println("Enter customer type (Regular or Corporate)");
			String custType=sc.nextLine();
			
			if(custType.equalsIgnoreCase("Regular"))
			{
				enterValuesReg(custId, custName ,custType);
			}
			else if(custType.equalsIgnoreCase("Corporate"))
			{
				enterValuesCor(custId, custName,custType);
			}
		}
		
		
	}
	
	public void enterValuesReg(int custId,String custName,String custType)
	{

		try{
		PreparedStatement ps=con.prepareStatement("insert into RegularCustomer values(?,?,?)");
		ps.setInt(1, custId);
		ps.setString(2, custName);
		ps.setString(3, custType);
		
		int i=ps.executeUpdate();
		if(i!=0)
		{
			System.out.println("record Instered");
		}
		else
		{
			System.out.println("record not inserted");
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void enterValuesCor(int custId,String custName,String custType)
	{

		try{
		PreparedStatement ps=con.prepareStatement("insert into CorporateCustomer values(?,?,?)");
		ps.setInt(1, custId);
		ps.setString(2, custName);
		ps.setString(3, custType);
		int i=ps.executeUpdate();
		if(i!=0)
		{
			System.out.println("record Instered");
		}
		else
		{
			System.out.println("record not inserted");
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void displayData()
	{
		try{
			PreparedStatement ps=con.prepareStatement("select * from RegularCustomer");
			PreparedStatement ps1=con.prepareStatement("select * from CorporateCustomer");
			ResultSet res=ps.executeQuery();
			ResultSet res1=ps1.executeQuery();
			
			while(res.next())
			{
				System.out.println("Cust Id "+res.getInt(1)+", Customer Name :"+res.getString(2)+", Customer Type :"+res.getString(3));
			}
			
			System.out.println("------------------------------------------");
			
			while(res1.next())
			{
				System.out.println("Cust Id "+res1.getInt(1)+", Customer Name :"+res1.getString(2)+", Customer Type :"+res1.getString(3));
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
}
