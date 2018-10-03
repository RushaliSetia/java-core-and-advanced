package Question2;

import java.util.Scanner;

public class Question2 
{
	static final double INTEREST=0.09;
	static int count=0;
	static double temp=0.0,newAmount=0.0;
   public static void main(String[] args) 
   {
	   Scanner sc=new Scanner(System.in);
	  
	   System.out.println("Enter final amount");
	   double finalAmount=sc.nextDouble();
	   
	   System.out.println("Enter the initail deposit amount");
	   double initialAmount;
	   
	   while(true)
	   {
		   initialAmount=sc.nextDouble();
		   temp=initialAmount+newAmount;
		   
		   newAmount=temp*0.09+temp;
		   System.out.println(newAmount);
		   if(newAmount>=finalAmount)
		   {
			   count++;
			   break;
		   }
		   else
		   {
			   count++;
		   }
		   
	   }
	   
	   System.out.println("The number of years are "+count);
	  
   }
}
