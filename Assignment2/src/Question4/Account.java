package Question4;

public abstract class Account 
{
    String custName;
    long accountNumber;
    String accountType;
    double balance=0.0;
    
    
    
    public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public abstract void acceptDeposit(String custName,long accountNumber,String accounType,double balance);
    public abstract void displayBalance();
    public abstract void permitWithdrawl();
    
}
