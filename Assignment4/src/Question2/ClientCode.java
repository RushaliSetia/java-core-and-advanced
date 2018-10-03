package Question2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ClientCode {

	Scanner sc = new Scanner(System.in);
	Student std[];
    static final File F_1=new File("loweclassman.txt");
    static final File F_2=new File("upperclassman.txt");
    
	public static void main(String[] args) throws IOException {
		ClientCode c = new ClientCode();
		c.enterData();
	}

	public void enterData() throws IOException {
		System.out.println("Enter total number of students");
		int indexValue = Integer.parseInt(sc.nextLine());

		while(true){
			System.out.println("\n0.Exit\n 1.accept info\n 2.display info");
			System.out.println("Enter your choice");
		int choice = Integer.parseInt(sc.nextLine());
		switch (choice) {
		case 0:
			System.exit(0);
			break;
		case 1:
			acceptData(indexValue);
			break;
		case 2:
			printData();
			break;
		default:
			System.out.println("You choosed a wrong option");
		}
		}// end switch
		
		
	}// end enterData()

	public void acceptData(int indexValue) throws FileNotFoundException
	{
		FileOutputStream fos1=new FileOutputStream(F_1);
		FileOutputStream fos2=new FileOutputStream(F_2);
		PrintWriter pw1=new PrintWriter(fos1);
		PrintWriter pw2=new PrintWriter(fos2);
		std=new Student[indexValue];
		
		for(int i=0;i<indexValue;i++)
		{
			System.out.println("Enter student Id");
			int stdId=Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter first name");
			String firstName=sc.nextLine();
			
			System.out.println("Enter last name");
			String lastName=sc.nextLine();
			
			System.out.println("Enter credit hours");
			double creditHours=Double.parseDouble(sc.nextLine());
			
			std[i]=new Student(stdId, firstName, lastName, creditHours);
			
			if(creditHours<=60)
			{
				pw1.write(stdId+","+firstName+" "+lastName+","+creditHours);
				pw1.close();
			}
			else
			{
				pw2.write(stdId+","+firstName+" "+lastName+","+creditHours);
				pw2.close();
			}
			
			
			
		}		
		
		
		  
	}//end acceptData()
	
	public void printData() throws IOException
	{
		FileInputStream fis1=new FileInputStream(F_1);
		FileInputStream fis2=new FileInputStream(F_2);
		
		System.out.println("Details of employees having credit hours less than or equal to 60");
		int c=0;
		while((c=fis1.read())!=-1)
    	{
    		System.out.print((char)c);
    		//System.out.println("\n");
    	}
    	
		fis1.close();
		System.out.println("\nDetails of employees having credit hours more than 60");
		while((c=fis2.read())!=-1)
    	{
    		System.out.print((char)c);
    		//System.out.println("\n");
    	}
	
    	fis2.close();
	}
	
}// end class
