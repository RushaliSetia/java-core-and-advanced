package Question4;

import java.util.Scanner;

public class CurrentAccount extends Account 
{
	int chequeBookNumber;
	
    Scanner sc=new Scanner(System.in);
	@Override
	public void acceptDeposit(String name,long accountNumber,String accountType,double balance) {
		setCustName(name);
		setAccountNumber(accountNumber);
		setAccountType(accountType);
		setBalance(balance);		
	}

	   
	public int getChequeBookNumber() {
		return chequeBookNumber;
	}


	public void setChequeBookNumber(int chequeBookNumber) {
		this.chequeBookNumber = chequeBookNumber;
	}


	@Override
	public void displayBalance() {
		System.out.println("The balance of current Account is as follows");
		System.out.println("Name :"+getCustName());
		System.out.println("Account Type :"+getAccountType());
		System.out.println("Balance :"+getBalance());
		System.out.println("Cheque book number is :"+getChequeBookNumber());
		
		System.out.println("You want to display your account Number");
		String choice=sc.nextLine();
		
		if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("y"))
		{
			System.out.println("Account Number :"+getAccountNumber());
		}
		else
		{
			System.out.println("Thanks for using our services");
		}
	}



	@Override
	public void permitWithdrawl() {
		System.out.println("Enter withdrawl amount from current account");
		double amount = Double.parseDouble(sc.nextLine());

		if (amount > this.balance) {
			System.out.println("Sorry insufficient balance");
		} else {
			this.balance = this.balance - amount;
			checkMinimumBalance();
			System.out.println("Hello, " + getCustName() + " the remaining balance is " + this.balance);
		}

	}//end permit
	
	
	public void  checkMinimumBalance()
	{
		if(this.balance<1000)
		{
			this.balance=(this.balance-(this.balance*0.02));
			
			System.out.println("Since your account balance is less than our minimum account balance so the deduction of money would be done by 2%");
		}
	}

}
