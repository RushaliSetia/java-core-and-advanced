package Question5;

import java.util.Scanner;

public class TicketNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 6 digit ticket number");
		int ticketNumber = sc.nextInt();
		
		TicketNumber tc=new TicketNumber();
		boolean validate=tc.validateTicketNumber(ticketNumber);
		
		System.out.println("The ticket number is valid? "+validate);

	}

	public boolean validateTicketNumber(int ticketNumber) {
		int remainder = ticketNumber % 10;
		ticketNumber=ticketNumber/10;
		
		
		int remainder2 = ticketNumber % 7;
          
	
		if (remainder == remainder2) {
			return true;
		} else {
			return false;
		}
	}
}
