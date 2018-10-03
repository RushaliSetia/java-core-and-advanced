package question1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BigBangStoreOperations {

	private static Map<Integer, Customer> customerList = new HashMap<>();

	public void addCustomer(Customer c) {
		int custid = c.getCustomerid();
		customerList.put(custid, c);
		System.out.println("customer id added to the list is :" + custid);
		System.out.println(customerList);
	}

	public int countCustomers(String customerType) {
		int count = 0;
		Set<Integer> id = customerList.keySet();
		for (Integer key : id) {
			if (customerType.equalsIgnoreCase(customerList.get(key).getCustomertype())) {
				count++;
			}
		}
		return count;
	}

	public void doPayment(int id) throws InvalidPaymentModeException {
		Scanner sc = new Scanner(System.in);
		int amount;
		String paymode = " ";
		//int remBal=0;
		if (customerList.get(id).getCustomertype().equalsIgnoreCase("online")) {
			System.out.println("payment mode allowed are:\n1.internet banking\t2.paytm");
			System.out.println("enter choice:");
			int choice = Integer.parseInt(sc.nextLine());
			if (choice == 1)
				paymode = "Internet Banking";
			if (choice == 2)
				paymode = "Paytm";
			if (choice == 1 || choice == 2) {
				System.out.println("enter amount:");
				amount = Integer.parseInt(sc.nextLine());
				System.out.println("Name" + customerList.get(id).getCustomername());
				System.out.println("Customer Type" + customerList.get(id).getCustomertype());
				System.out.println("amount paid" + amount);
				System.out.println("Payment mode" + paymode);
				OnlineCustomer oc1 = (OnlineCustomer) customerList.get(id);
				System.out.println("Discount Coupon " + oc1.getDiscountCoupon());
				//remBal = amount - Integer.parseInt(oc1.getDiscountCoupon());
				//System.out.println("Amount after discount : " + remBal);

				fileWrite(customerList.get(id).getCustomername(), customerList.get(id).getCustomertype(), amount,
						paymode);
			} //end of nested if
			else
			{
				throw new InvalidPaymentModeException("error");
			}
		} // end if
		else {
			System.out.println("Payment Mode : \n 1.Internet Banking \n 2.PayTm \n 3.Cash \n 4.Credit");
			System.out.println("enter choice:");
			int ch2 = Integer.parseInt(sc.nextLine());
			if (ch2 == 1)
				paymode = "Internet Banking";
			if (ch2 == 2)
				paymode = "Paytm";
			if (ch2 == 3)
				paymode = "Cash";
			if (ch2 == 4)
				paymode = "Credit";
			if (ch2 == 1 || ch2 == 2 || ch2 == 3 || ch2 == 4) {

				System.out.println("Enter amount paid ");
				amount = Integer.parseInt(sc.nextLine());

				System.out.println("records");
				System.out.println("Name"+customerList.get(id).getCustomername());
				System.out.println("Customer Type"+customerList.get(id).getCustomertype());
				System.out.println("amount paid" + amount);
				System.out.println("Payment mode" + paymode);
				LocalStepInCustomer lc1 = (LocalStepInCustomer) customerList.get(id);
				// lc1.getMaxCreditLimit();
				System.out.println("max cr limit" + lc1.getMaxCreditLimit());
				/*remBal = lc1.getMaxCreditLimit() - amount;
				System.out.println("Reamining Balance" + remBal);
*/				fileWrite(customerList.get(id).getCustomername(), customerList.get(id).getCustomertype(), amount, paymode);
			} else {
				throw new InvalidPaymentModeException("error");
			}

		}
	}// end method

	public int checkCustomer(String name) {
		int id = 0;
		Set<Integer> id1 = customerList.keySet();
		for (Integer key : id1) {
			if (name.equalsIgnoreCase(customerList.get(key).getCustomertype())) {
				id = key;
			}
		}
		return id;
	}

	private void fileWrite(String customerName, String customerType, int amount, String paymode) {

		Date d = new Date();
		SimpleDateFormat fd = new SimpleDateFormat("dd-MM-yyyy");
		String date = fd.format(d);
		String record = "";

		try {
			FileWriter fw = new FileWriter(new File(customerName));
			BufferedWriter bw = new BufferedWriter(fw);
			record = "File Name : " + customerName + "\n Date of bill : " + date + "\n Amount : " + amount
					+ "\n Payment mode : " + customerType + "Payment mode : " + paymode;
			bw.write(record);
			System.out.println("Payment done");
			bw.close();
			fw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
