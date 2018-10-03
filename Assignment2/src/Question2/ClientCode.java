package Question2;

import java.util.Scanner;

public class ClientCode
{
	Scanner sc=new Scanner(System.in);
	
    public static void main(String[] args) 
    {
	     ClientCode c=new ClientCode();
	     c.calculateSalary();
	}
    
    public void calculateSalary()
    {
    	System.out.println("Enter Hourly Worker's pay grade per hour");
    	int hourSalary=Integer.parseInt(sc.nextLine());
    	
    	System.out.println("Enter name of Hourly Worker");
    	String nameHourlyWorker=sc.nextLine();
   	
    	System.out.println("Enter total working hours of hourly worker");
    	int hoursHourlyWorker=Integer.parseInt(sc.nextLine());
    	
    	HourlyWorker hrHourlyWorker=new HourlyWorker(nameHourlyWorker,hourSalary,hoursHourlyWorker);
    	
    	System.out.println("Enter Salaried Worker's pay grade per hour");
    	int hourSalariedWorker=Integer.parseInt(sc.nextLine());
    	
    	System.out.println("Enter name of Salaried Worker");
    	String nameSalariedWorker=sc.nextLine();
   	
    	System.out.println("Enter total working hours of hourly worker");
    	int hoursSalariedWorker=Integer.parseInt(sc.nextLine());
    	
    	SalariedWorker srSalariedWorker=new SalariedWorker(nameSalariedWorker,hourSalariedWorker,hoursHourlyWorker);

    	
    }
}
