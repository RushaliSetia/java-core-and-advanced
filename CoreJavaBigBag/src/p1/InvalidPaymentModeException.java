package p1;

public class InvalidPaymentModeException extends Exception {

	final String msg = "Invalid payment mode exception ....please try again";

	public InvalidPaymentModeException() {

	}

	@Override
	public String toString() {
		return "InvalidPaymentModeException [msg=" + msg + "]";
	}

}
