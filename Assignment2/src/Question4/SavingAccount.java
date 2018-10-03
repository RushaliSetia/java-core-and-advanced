package Question4;

import java.util.Scanner;

public class SavingAccount extends Account {
	Scanner sc = new Scanner(System.in);

	@Override
	public void acceptDeposit(String name, long accountNumber, String accountType, double balance) {
		setCustName(name);
		setAccountNumber(accountNumber);
		setAccountType(accountType);
		setBalance(balance);
	}

	@Override
	public void displayBalance() {
		System.out.println("The balance of Saving Account is as follows");
		System.out.println("Name :" + getCustName());
		System.out.println("Account Type :" + getAccountType());
		System.out.println("Balance :" + getBalance());

		System.out.println("You want to display your account Number");
		String choice = sc.nextLine();

		if (choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y")) {
			System.out.println("Account Number :" + getAccountNumber());
		} else {
			System.out.println("Thanks for using our services");
		}
	}

	public double computeInterest(double balance, double years) {
		balance = (balance + balance * ((Math.pow((1 + 6.5), years)) - 1));
		
		System.out.println("Balance after compound interest is "+balance);
		return balance;
	}

	@Override
	public void permitWithdrawl() {
		System.out.println("Enter withdrawl amount from savings account");
		double amount = Double.parseDouble(sc.nextLine());

		if (amount > this.balance) {
			System.out.println("Sorry insufficient balance");
		} else {
			this.balance = this.balance - amount;
			System.out.println("Hello, " + getCustName() + " the remaining balance is " + this.balance);
		}

	}//end permit

}
