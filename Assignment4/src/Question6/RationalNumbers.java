package Question6;

import java.util.ArrayList;

public class RationalNumbers {
    
	private int number1;
	private int number2;
	static double arr[]=new double[100];
	static int count=0;
	
	public RationalNumbers(int number1, int number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
		
		System.out.println("Object created "+number1+" "+number2);
	}
	
	public double computeRational()
	{
		return ((double)this.number1/this.number2);
	}
	
	public double addNumbers()
	{
		double sum=0.0;
		for(int i=0;i<count;i++)
		{
		   sum=sum+arr[i];	
		}
		return sum;
	}
	
	public double subNumber()
	{
		return arr[0]-arr[1];
	}
	
	public double mulNumber()
	{
		double mul=1.0;
		for(int i=0;i<count;i++)
		{
			mul*=arr[i];
		}
		return mul;
	}
	
	public double divideNumber()
	{
		return arr[0]/arr[1];
	}
	
}
