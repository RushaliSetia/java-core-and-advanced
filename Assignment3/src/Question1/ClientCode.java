package Question1;

import java.util.Scanner;

public class ClientCode {
	
	Scanner sc=new Scanner(System.in);
	GoTooFar gtf=new GoTooFar(new int[]{1,2,3,4,5});
	public static void main(String[] args) {
		ClientCode c=new ClientCode();
		c.enterData();
	}
	
	public void enterData()
	{
		System.out.println("The values of array are ");
		int i=0;
		while(i<=5)
		{
			try
			{
				System.out.println(gtf.getArr()[i]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Now you've gone too far");
			}
			
			i++;
		}
	}

}
