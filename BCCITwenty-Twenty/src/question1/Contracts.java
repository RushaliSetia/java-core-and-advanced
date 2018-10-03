package question1;

public interface Contracts {

	abstract void reserveTicket(Ticket ticket) throws InvalidNumberOfTickets;

	abstract void displayAudiences();
}//end of interface
