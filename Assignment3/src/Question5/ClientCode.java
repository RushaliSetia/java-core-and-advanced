package Question5;

import java.util.Scanner;

public class ClientCode {

	
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws EmployeeException {
		ClientCode c=new ClientCode();
		 c.enterData();
	}
	
	public void enterData() throws EmployeeException
	{
		System.out.println("Enter details of 3 employees");
		int i=1;
		while(i<=3){
		System.out.println("Enter employee id");
		int empID=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter employee salary in hourly wages");
		double salary=Double.parseDouble(sc.nextLine());
		
		try{
		if(salary>=6.0 && salary<=50.0)
		{
		    	System.out.println("Employee Object "+i+" with empID "+empID+" and salary "+salary+" successfully created");
		}
		else
		{
			throw new EmployeeException(empID+" and "+salary);
		}}
		catch(Exception e)
		{}
		i++;
		}
	}
}
