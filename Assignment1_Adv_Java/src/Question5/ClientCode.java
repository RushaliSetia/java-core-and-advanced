package Question5;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Scanner;

public class ClientCode {

	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		ClientCode c=new ClientCode();
		c.enterData();
	}
	
	public void enterData()
	{
		while(true)
		{
			System.out.println("Select a choice ");
			System.out.println("0.Exit \n1.Add Records \n2.Display Records");
			int choice=Integer.parseInt(sc.nextLine());
			
			switch(choice)
			{
			case 0:
				System.exit(0);
				break;
			case 1:
				addData();
				break;
			case 2:
				displayData();
				break;
			default:
				System.out.println("Enter correct choice please");
			}//end switch
		}//end while
	}//end enterData
	
	public void displayData()
	{
				Enumeration<Employee> emp1=Employee.emp.elements();
				while (emp1.hasMoreElements()) {
					Employee e=emp1.nextElement();
					System.out.println("Employee Id :"+e.getEmpNo());
					System.out.println("Employee Name :"+e.getEmpName());
					System.out.println("Employee Address :"+e.getAddress());
					System.out.println("---------------------------------------------");
				}
	}//end displayData
	
	public void addData()
	{
		System.out.println("Enter Employee Id");
		int empNo=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Employee Name");
		String empName=sc.nextLine();
		
		System.out.println("Enter Employee Address");
		String empAddress=sc.nextLine();
		
		Employee e=new Employee(empNo, empName.toUpperCase(), empAddress.toUpperCase());
		e.addInput(e);
	}
}//end class
