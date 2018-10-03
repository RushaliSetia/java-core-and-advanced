package Question4;

import java.util.Scanner;

public class ClientCode 
{
	NewAirthExp nae=new NewAirthExp();
   Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	    ClientCode c=new ClientCode();
        c.enterData();
	}
	
	public void enterData()
	{
		System.out.println("Enter number to take square root");
		int sqRoot=Integer.parseInt(sc.nextLine());
		
		try{
		    System.out.println(nae.takeInput(sqRoot));
		}
		catch (ArithmeticException e) {
		   e.printStackTrace();
		}
		
	}
}
