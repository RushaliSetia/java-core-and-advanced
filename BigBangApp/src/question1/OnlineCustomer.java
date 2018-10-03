package question1;

public class OnlineCustomer extends Customer {

	private String discountCoupon;

	public OnlineCustomer() {
		super();
	}

	public OnlineCustomer(String customername, String customertype, int customerid, String discountCoupon) {
		super(customername, customertype, customerid);
		this.discountCoupon = discountCoupon;
	}

	public String getDiscountCoupon() {
		return discountCoupon;
	}

	public void setDiscountCoupon(String discountCoupon) {
		this.discountCoupon = discountCoupon;
	}

	@Override
	public String toString() {
		return "OnlineCustomer [discountCoupon=" + discountCoupon + "]";
	}

	public String makePayment(String paymentMode) throws InvalidPaymentModeException {
		if (paymentMode.equalsIgnoreCase("internet banking") || paymentMode.equalsIgnoreCase("paytm")) {
			return paymentMode;
		} else
			throw new InvalidPaymentModeException("invalid payment mode!!!");
	}
}
