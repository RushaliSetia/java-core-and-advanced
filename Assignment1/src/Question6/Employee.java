package Question6;

import java.util.Scanner;

public class Employee {

	float hr_pay;
	int hr_reg,hr_over;
	double salary=0.0;
	Scanner sc=new Scanner(System.in);
	
	public void getData()
	{
		System.out.println("Enter hr_pay of the employee");
		this.hr_pay=sc.nextFloat();
		
		System.out.println("Enter hr_reg of the employee");
		this.hr_reg=sc.nextInt();
		
		System.out.println("Enter hr_over of the employee");
		this.hr_over=sc.nextInt();
	}
	
	public double calculateSalary()
	{
	   salary=((this.hr_reg*(hr_pay/30))+(this.hr_over*1.5*(hr_pay/30)))*7;
	   return salary;	
	}
	
	public void display()
	{
		System.out.println("The weekly salary is "+salary);
	}
	
	
	public static void main(String[] args) 
	{
	   	Employee e=new Employee();
	   	e.getData();
	   	e.calculateSalary();
	   	e.display();
	}
}
