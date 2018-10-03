package p1;

public interface Payment {

	public boolean makePayment(String paymentMode) throws InvalidPaymentModeException;
	
}
