package question1;

public class LocalStepInCustomer extends Customer {

	private String maxCreditLimit;

	public LocalStepInCustomer(String customername, String customertype, int customerid, String maxCreditLimit) {
		super(customername, customertype, customerid);
		this.maxCreditLimit = maxCreditLimit;
	}

	public LocalStepInCustomer() {
		super();
	}

	public String getMaxCreditLimit() {
		return maxCreditLimit;
	}

	public void setMaxCreditLimit(String maxCreditLimit) {
		this.maxCreditLimit = maxCreditLimit;
	}

	@Override
	public String toString() {
		return "LocalStepInCustomer [maxCreditLimit=" + maxCreditLimit + "]";
	}

	public String makePayment(String paymentMode) throws InvalidPaymentModeException {
		if (paymentMode.equalsIgnoreCase("banking") || paymentMode.equalsIgnoreCase("paytm")
				|| paymentMode.equalsIgnoreCase("cash") || paymentMode.equalsIgnoreCase("credit")) {

			return paymentMode;
		} else
			throw new InvalidPaymentModeException("invalid payment mode!!!");
	}
}
