package question5;

import java.util.Enumeration;
import java.util.Scanner;

public class MainClass {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		MainClass obj = new MainClass();
		while (true) {
			System.out.println("1.add\n2.display\n3.exit");
			System.out.println("enter choice:");
			int ch = Integer.parseInt(sc.nextLine());
			switch (ch) {
			case 1:
				obj.add();
				break;
			case 2:
				obj.display();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("wrong choice");
			}
		}
	}
	public void add()
	{
		System.out.println("enter the employee number:");
		int empno=Integer.parseInt(sc.nextLine());
		System.out.println("enter name:");
		String name=sc.nextLine();
		System.out.println("enter address:");
		String address=sc.nextLine();
		Employee emp=new Employee(empno,name,address);
		System.out.println("record added to the vector!!!!!");
		emp.addInput(emp);
	}
	public void display()
	{
		Enumeration<Employee> emp1=Employee.emp.elements();
		while (emp1.hasMoreElements()) {
			Employee e=emp1.nextElement();
			System.out.println("Employee Id :"+e.getEmployeeNo());
			System.out.println("Employee Name :"+e.getEmployeeName());
			System.out.println("Employee Address :"+e.getAddress());
			System.out.println("---------------------------------------------");
		}
	
	}
}
