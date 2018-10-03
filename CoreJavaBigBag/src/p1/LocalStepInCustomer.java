package p1;

public class LocalStepInCustomer extends Customer {

	int maxCreditLimit;

	
	public LocalStepInCustomer() {
		
	}

	public LocalStepInCustomer(int customerId, String customerName, String customerType,int maxCreditLimit) {
		super(customerId, customerName, customerType);
		this.maxCreditLimit = maxCreditLimit;
		// TODO Auto-generated constructor stub
	}

	
	public int getMaxCreditLimit() {
		return maxCreditLimit;
	}

	public void setMaxCreditLimit(int maxCreditLimit) {
		this.maxCreditLimit = maxCreditLimit;
	}

	@Override
	public boolean makePayment(String paymentMode) throws InvalidPaymentModeException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return "LocalStepInCustomer [maxCreditLimit=" + maxCreditLimit + "]";
	}

}
