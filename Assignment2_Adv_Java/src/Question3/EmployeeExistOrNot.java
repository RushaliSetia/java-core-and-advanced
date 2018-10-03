package Question3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import ConnectionPackage.ConnectionProvider;

public class EmployeeExistOrNot 
{
    Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		EmployeeExistOrNot eeon=new EmployeeExistOrNot();
		eeon.enterData();
	}
     
     public void enterData()
     {
    	 System.out.println("Enter Employee ID to be verified");
    	 int empId=Integer.parseInt(sc.nextLine());
    	 display(empId);
     }
     
     public void display(int empId)
     {
    	 int i=0;
    	 try
    	 {
    		 Connection con=ConnectionProvider.getCon();
    		 PreparedStatement ps=con.prepareStatement("Select * FROM Emp");
    		 ResultSet res=ps.executeQuery();
    		
    		 
    		 while(res.next())
    		 {
    			 if(res.getInt(1)==empId)
    			 {
    				 System.out.println("Employee Id :"+res.getInt(1));
    				 System.out.println("Employee Name :"+res.getString(2));
    				 System.out.println("Employee Department :"+res.getString(3));
    				 System.out.println("Manager Id :"+res.getInt(4));
    				 System.out.println("Employee HireDate :"+res.getString(5));
    				 System.out.println("Employee Salary :"+res.getDouble(6));
    				 System.out.println("Employee Commission :"+res.getDouble(7));
    				 System.out.println("Employee Department No :"+res.getInt(8));
    				 i=1;
    				 break;
    			 }
    		 }
    		 
    		 if(i==0)
    		 {
    			 System.out.println("Employee Id doesn't exist");
    		 }
    	 }
    	 catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
     }
}
