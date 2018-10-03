package Question2;

import java.util.Scanner;

public class Question2 
{
	Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
		Question2 q=new Question2();
		q.enterData();
	}
    public void enterData()
    {
    	System.out.println("Enter a string for number exception");
    	
    	try
    	{
    		System.out.println("The number is "+ Integer.parseInt(sc.nextLine()));
    	}
    	catch(NumberFormatException e)
    	{
    		e.printStackTrace();
    	}
    }
    
}
