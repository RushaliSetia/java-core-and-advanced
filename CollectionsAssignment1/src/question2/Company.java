 package question2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Company {

	LinkedList<Employee> employeeList = new LinkedList<Employee>();
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Company object=new Company();
		while (true) {
			System.out.println("menu");
			System.out.println("1.display the list sorted by employee dob in ascending order");
			System.out.println("2.display the list sorted by employee dob in descending order");
			System.out.println("3.exit");
			System.out.println("enter choice:");
			int ch = Integer.parseInt(sc.nextLine());
			switch (ch) {
			case 1:object.display();
				break;
			case 2:object.display1();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("invalid choice");
			}// end switch
		} // end of while

	}// end of main
	private void display1() {
		Collections.sort(ManageEmployee.employeeList,new SortInAscendingOrder());
		System.out.println("displaying details of the employee");
		for (Employee employee : ManageEmployee.employeeList) {
			System.out.println("id:"+employee.getEmpId());
			System.out.println("name:"+employee.getEmpName());
			System.out.println("dob:"+employee.getEmpDOB());
			System.out.println("-------------------------------------------");
     		}
		
		
	}
	private void display() {
		Collections.sort(ManageEmployee.employeeList, new SortInDescendingOrder());
		System.out.println("displaying details of the employee");
		for (Employee employee : ManageEmployee.employeeList) {
			System.out.println("id:"+employee.getEmpId());
			System.out.println("name:"+employee.getEmpName());
			System.out.println("dob:"+employee.getEmpDOB());
			System.out.println("-------------------------------------------");
		}
		
	}

}// end of class
