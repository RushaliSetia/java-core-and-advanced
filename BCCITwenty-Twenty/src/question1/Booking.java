package question1;

import java.util.Scanner;

public class Booking implements Contracts {
	Ticket ticketArray[] = new Ticket[100];
	int count = 0;
	Ticket ticketObject = new Ticket();

	@Override
	public void reserveTicket(Ticket ticket) throws InvalidNumberOfTickets {
		Scanner sc = new Scanner(System.in);
		int ticketPriceForIndians = 500;
		int ticketPriceForForeigners = 1000;
		int numberOfTicketsAvailable = 100;
		System.out.println("enter the number of tickets that you want to book:");
		int noOfTicketBook = Integer.parseInt(sc.nextLine());
		try {
			if (noOfTicketBook > 100) {
				throw new InvalidNumberOfTickets("You have booked more than 100 tickets which are not allowed.");
			}
			// end of if
			else {
				ticketArray[count] = ticket;
				count++;
			} // end of else
		} // end of try
		catch (Exception e) {

			e.printStackTrace();
		} // end of catch

	}// end of reserveTicket method

	@Override
	public void displayAudiences() {

		System.out.println("displaying all the audience.....");
		for (int i = 0; i < ticketArray.length; i++) {
			System.out.println(ticketArray[count]);
		}//end of for
	}//end of displayAudiences method

}//end of class
