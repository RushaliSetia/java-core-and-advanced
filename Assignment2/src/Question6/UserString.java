package Question6;

import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class UserString {
	Scanner sc=new Scanner(System.in);
	
   private char firstString[]=new char[20];
   private char secondString[]=new char[20];
   
   String firstString1,secondString1;
   
   public UserString() {
	   System.out.println("Enter fistString");
	   firstString=sc.nextLine().toCharArray();
	   
	   System.out.println("Enter secondString");
	   secondString=sc.nextLine().toCharArray();
}
   
   public void reverseString()
   {
	   firstString1=new String(firstString);
	   System.out.println("Reverse of first String is "+new StringBuffer(firstString1).reverse());
	   secondString1=new String(secondString);
	   System.out.println("Reverse of second String is "+new StringBuffer(secondString1).reverse());
   }
   
   
   public void copyString() {
	  firstString1=secondString1;
	  System.out.println("After copying the firstString is "+firstString1);
}
   public void concateString()
   {
	   String temp=firstString1+" "+secondString1;
	   System.out.println("After concatenation "+temp);
   }
   
   public void count()
   {
	   System.out.println("Characters in firstString "+firstString1.length());
	   System.out.println("Charcters in secondString "+secondString1.length());
   }
}
