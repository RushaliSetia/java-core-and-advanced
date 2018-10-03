package question1;

public class InvalidNumberOfTickets extends Exception {

	private final String error_message = "error please try again";

	public InvalidNumberOfTickets(String s) {

	}

	@Override
	public String toString() {
		return "InvalidNumberOfTickets [error_message=" + error_message + "]";
	}//end of toString

}//end of class
