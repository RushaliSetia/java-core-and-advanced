package question1;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;

public class Organizer {

	static Scanner sc = new Scanner(System.in);
	Booking bookingObject=new Booking();
	public static void main(String[] args) throws ReserveException, InvalidNumberOfTickets {
		Organizer organizerObject = new Organizer();
		
		while (true) {
			System.out.println("****MENU****");
			System.out.println("1.Press 1 to reserve the ticket");
			System.out.println("2.Press 2 to display the Audieneces");
			System.out.println("3.exit");
			System.out.println("enter your choice:");
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1:
				organizerObject.reserveTicket();
				break;
			case 2:
				organizerObject.display();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("invalid choice....Please choose again!!!");
			}// end of switch
		} // end of while
	}// end of main

	public void reserveTicket() throws ReserveException, InvalidNumberOfTickets {
		int amount = 600;
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("please enter the following details to book the ticket-----");
		System.out.println("enter the ticket id:");
		int ticketId = Integer.parseInt(sc.nextLine());
		System.out.println("enter the audience name:");
		String audienceName = sc.nextLine();
		System.out.println("enter your nationality:");
		String nationality = sc.nextLine();
		System.out.println("enter your age:");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println("enter your mobile number:");
		String cellNo = sc.nextLine();
		int len = String.valueOf(cellNo).length();
		if ((age < 18) && (len < 10)) {
			throw new ReserveException("you are underage and mobile number is less than 10 digits ");
		} // end of if
		System.out.println("enter the reserving date:");
		String reserveDate = sc.nextLine();
		LocalDate localDateObj = LocalDate.parse(reserveDate, dateTimeFormatter);
		Date dm = Date.valueOf(localDateObj);
		Ticket t=new Ticket(ticketId, audienceName, nationality, age, cellNo,dm);
		bookingObject.reserveTicket(t);
		System.out.println("your ticket is booked successfully generated, please pay Rs."+amount+" and your ticket id is:"+ticketId);;
		
	}// end of reserveTicket method

	public void display() {
		System.out.println("the names of the audiences are-------");
		bookingObject.displayAudiences();
	}//end of display method

}// end of class
