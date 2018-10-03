package Question3;

import java.util.Scanner;

public class ArrayRelatedExceptions 
{
   static Scanner sc=new Scanner(System.in);
   public static void main(String[] args) {
	System.out.println("Enter size for an array");
    int indexValue=Integer.parseInt(sc.nextLine());
    
    try
    {
    	int arr[]=new int[indexValue];
    	System.out.println("Array created successfully");
    }
    catch(NegativeArraySizeException e)
    {
    	System.out.println("Array was not created");
    }
    catch(NumberFormatException e)
    {
    	System.out.println("Number format is not correct");
    }
   }
}
