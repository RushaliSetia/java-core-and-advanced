package question1;

public class ReserveException extends Exception {

	private final String error_message = "error please try again";

	public ReserveException(String s) {

	}//end of constructor

	@Override
	public String toString() {
		return "ReserveException [error_message=" + error_message + "]";
	}//end of toString

}//end of class
