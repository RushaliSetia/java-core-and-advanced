package question3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import Connection.ConnectionProvider;

public class Employee {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.add();
	}
	public void display(int empId)
	{
		int i=0;
		try
		{
			Connection con=ConnectionProvider.getCon();
			PreparedStatement ps=con.prepareStatement("select * from employee");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				if(rs.getInt(1)==empId)
				{
					System.out.println(rs.getInt(1));
					System.out.println(rs.getString(2));
					System.out.println(rs.getShort(3));
					System.out.println(rs.getInt(4));
					System.out.println(rs.getString(5));
					System.out.println(rs.getDouble(6));
					System.out.println(rs.getDouble(7));
					System.out.println(rs.getInt(8));
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		if(i==0)
		{
			System.out.println("employee with the entered id does not exists.....");
		}
	}
	public void add()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the employee id:");
		int id=Integer.parseInt(sc.nextLine());
		display(id);
	}

}
