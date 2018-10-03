package question1;

public class InvalidPaymentModeException extends Exception {

	private final String error_message = "error please try again";

	public InvalidPaymentModeException(String msg) {

	}

	@Override
	public String toString() {
		return "InvalidPaymentModeException [error_message=" + error_message + "]";
	}

}
