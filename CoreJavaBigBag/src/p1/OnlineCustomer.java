package p1;

public class OnlineCustomer extends Customer {

	String discountCoupon;

	public OnlineCustomer() {

	}

	public OnlineCustomer(int customerId, String customerName, String customerType, String discountCoupon) {
		super(customerId, customerName, customerType);
		this.discountCoupon = discountCoupon;
		// TODO Auto-generated constructor stub
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

	@Override
	public boolean makePayment(String paymentMode) throws InvalidPaymentModeException {
		// TODO Auto-generated method stub
		return false;
	}

}
