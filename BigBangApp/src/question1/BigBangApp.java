package question1;

import java.util.Scanner;

public class BigBangApp {

	public static void main(String[] args) throws InvalidPaymentModeException {
		BigBangApp object = new BigBangApp();
		BigBangStoreOperations obj = new BigBangStoreOperations();
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("****MENU****");
			System.out.println(
					"1.store the customer\n2.count the no of online customers\n3.count the no of local customers\n4.make payment");
			System.out.println("0.exit");
			System.out.println("enter your choice:");
			int ch = Integer.parseInt(sc.nextLine());
			switch (ch) {
			case 1:
				object.addCustomers();
				break;
			case 2:
				System.out.println("number of online customers are:");
				obj.countCustomers("online");
				break;
			case 3:
				System.out.println("number of local customers are:");
				obj.countCustomers("local");
				break;
			case 4:
				object.makePayment();
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("invalid choice.....Please re-enter");
			}// end of switch
		} // end of while
	}// end of main

	public void addCustomers() {
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the id of the customer:");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("enter customer name:");
		String name = sc.nextLine();
		System.out.println("enter the type of customer u want to add-----");
		System.out.println("1.local customers\n2.online customers");
		int ch1 = Integer.parseInt(sc.nextLine());
		while (flag == 0) {
			switch (ch1) {
			case 1:
				addOnlineCustomers(id, name);
				break;
			case 2:
				addLocalCustomers(id, name);
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("cannot add customer.....");
			}// end switch
		} // end while
	}// end method

	public void addOnlineCustomers(int id, String name) {
		Scanner sc = new Scanner(System.in);
		String customerType = "online";
		System.out.println("enter the discount coupon");
		String discountCoupon = sc.nextLine();
		OnlineCustomer oc = new OnlineCustomer(name, customerType, id, discountCoupon);
		BigBangStoreOperations obj = new BigBangStoreOperations();
		obj.addCustomer(oc);
	}

	public void addLocalCustomers(int id, String name) {
		Scanner sc = new Scanner(System.in);
		String customerType = "local";
		System.out.println("enter the max credit limit");
		String maxCreditLimit = sc.nextLine();
		LocalStepInCustomer lc = new LocalStepInCustomer(name, customerType, id, maxCreditLimit);
		BigBangStoreOperations obj = new BigBangStoreOperations();
		obj.addCustomer(lc);
	}

	public void makePayment() throws InvalidPaymentModeException {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		BigBangStoreOperations obj = new BigBangStoreOperations();
		int id = obj.checkCustomer(name);
		if (id != 0) {
			obj.doPayment(id);
		} else
			System.out.println("user does not exists");
	}

}// end of class
