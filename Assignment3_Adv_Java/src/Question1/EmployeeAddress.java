package Question1;

import java.util.Scanner;

public class EmployeeAddress {

	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		EmployeeAddress ea=new EmployeeAddress();
	    ea.enterData();
	}
	
	public void enterData()
	{
		System.out.println("Enter city");
		String city=sc.nextLine();
		
		System.out.println("Enter state");
		String state=sc.nextLine();
		
		Employee e=new Employee(city.toUpperCase(), state.toUpperCase());
		System.out.println(e.getFullAddress());
	}
}
