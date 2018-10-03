package Question1;

import java.util.Scanner;

public class Question1 
{
	static Scanner sc=new Scanner(System.in);
	
    public static void main(String[] args)
    {
	     System.out.println("Enter family contribution");
	     int familyContry=sc.nextInt();
	     
	     System.out.println("Enter savings of first quater");
	     int firstQauter=sc.nextInt();
	     
	     System.out.println("Enter savings of second quater");
	     int secondQauter=sc.nextInt();
	     
	     System.out.println("Enter savings of third quater");
	     int thirdQauter=sc.nextInt();
	     
	     System.out.println("Enter savings of fourth quater");
	     int fourthQauter=sc.nextInt();
	     
	     Question1 que1=new Question1();
	     int quaterlySavings=que1.calcQuaterlySavings(familyContry,firstQauter,secondQauter,thirdQauter,fourthQauter);
	}//end of main
    
    
    
    public int calcQuaterlySavings(int familyContry,int firstQuater,int secondQuater,int thirdQuater,int fourthQuater)
    {
    	double savings=0;
//    	for(int i=0;i<12;i++)
//    	{
//    		savings=(double)familyContry-((75*familyContry)/100);
//    	}
    	
    	
    	return 0;
    }
    
    
}//end of class
