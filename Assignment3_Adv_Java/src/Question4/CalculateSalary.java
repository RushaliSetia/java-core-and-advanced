package Question4;

import java.util.Scanner;

public class CalculateSalary {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		IsSalary sal=new IsSalary() {
			
			@Override
			public int calucluateSalary(int days, int slaPerDay) {
				return days*slaPerDay;
			}
		};
		
		System.out.println("Enter number of days");
		int days=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Per Day salary");
		int salPerDay=Integer.parseInt(sc.nextLine());
		
		System.out.println("Total Salary using Annonymous class is "+sal.calucluateSalary(days, salPerDay));

		
		IsSalary sal1=(int days1,int salPerDay1)->days1*salPerDay1;
		System.out.println("Total Salary using lambda expression is "+sal1.calucluateSalary(days, salPerDay));
		
		
	}
}
