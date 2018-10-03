package Question2;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Company {

	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Company c=new Company();
		c.enterData();
	}
	
	public void enterData()
	{
		while(true)
		{
			System.out.println("Enter choice");
			System.out.println("0.Exit \n1.sorted by Dob in descending order \n2.sorted by Dob in ascending order \n3.Display Details");
			int choice =Integer.parseInt(sc.nextLine());
			
			switch (choice) {
			case 0:
				System.exit(0);
				break;
			case 1:
		        sortInAscendingOrder();		
				break;
			case 2:
				sortInDescendingOrder();
				break;
			case 3:
				displayData();
				break;
			default:
				System.out.println("Select a correct choice");
			}//end switch
		}//end while
	}//end enterData
	
	public void sortInAscendingOrder()
	{
	    Collections.sort(ManageEmployee.emp, new SortInDescendingOrder1());
	    displayData();
	}//end sortInAscendingOrder
	
	public void sortInDescendingOrder()
	{
		Collections.sort(ManageEmployee.emp, new SortInAscendingOrder());
		displayData();
	}//end sortInDescendingOrder
	
	public void displayData()
	{
		for(Employee e:ManageEmployee.emp)
		{
			System.out.println("Employee Id :"+e.getEmpId());
			System.out.println("Employee Name :"+e.getEmpName());
			System.out.println("Employee DOB :"+e.getEmpDob());
			System.out.println("-----------------------------------------------------");
		}
	}
	
}//end class
