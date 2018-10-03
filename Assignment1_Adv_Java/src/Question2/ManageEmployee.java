package Question2;

import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class ManageEmployee extends Employee{

	static LinkedList<Employee> emp=new LinkedList<>();
	Scanner sc=new Scanner(System.in);
	
	static
	{
		emp.add(new Employee(101, "Deepak Sharma", new Date(1995, 11, 20)));
		emp.add(new Employee(102, "Suchita Sharma", new Date(1999, 04, 20)));
		emp.add(new Employee(103, "Mannu Sharma", new Date(1972, 12, 15)));
		emp.add(new Employee(104, "Shyam Sunder Sharma", new Date(1969, 11, 04)));
	}
}
