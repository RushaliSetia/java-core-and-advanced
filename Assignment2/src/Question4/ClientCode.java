package Question4;

import java.util.Scanner;

public class ClientCode 
{
	Scanner sc=new Scanner(System.in);
    public static void main(String[] args) 
    {
		ClientCode c=new ClientCode();
		c.performFunctionality();
		
	}
    
    public void performFunctionality()
    {
    	SavingAccount sa=new SavingAccount();
    	sa.acceptDeposit("Deepak Sharma", 01234567, "Savings", 25000.00);
    	sa.displayBalance();
    	
    	System.out.println("Enter years to calculate compound interest");
    	double years=sc.nextDouble();
    	sa.computeInterest(sa.getBalance(), years);
    	
    	sa.permitWithdrawl();
    	
    	CurrentAccount ca=new CurrentAccount();
    	ca.acceptDeposit("Ruhsali", 321648, "Current", 26000.00);
    	ca.setChequeBookNumber(201365);
    	ca.displayBalance();
    	
       ca.permitWithdrawl();
    	
    }
}
