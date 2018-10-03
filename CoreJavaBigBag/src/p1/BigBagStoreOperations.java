package p1;

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

public class BigBagStoreOperations {
	static Scanner sc = new Scanner(System.in);
	private static Map<Integer, Customer> custmap = new HashMap<>();

	public void addCustToMap(Customer c) {
		int custId = c.getCustomerId();
		custmap.put(custId, c);
		System.out.println("customer added" + custId);
		System.out.println(custmap);

	}

	public int countCust(String customerType) {

		int count = 0;
		Set<Integer> id = custmap.keySet();
		for (Integer key : id) {

			if (customerType.equalsIgnoreCase(custmap.get(key).getCustomerType())) {

				count++;
			}

		}

		return count;
	}

	public int checkCust(String name) {
		int id = 0;
		Set<Integer> id1 = custmap.keySet();
		for (Integer key : id1) {
			if (name.equalsIgnoreCase(custmap.get(key).getCustomerName()))
				id = key;
		}

		return id;
	}

	public void payment(int id) throws InvalidPaymentModeException {
		int amount;
		String paymode = "";
		int remBal = 0;

		if (custmap.get(id).getCustomerType().equalsIgnoreCase("online")) {
			System.out.println("Payement Mode : \n 1.Internet Banking \n 2. Paytm");
			int ch2 = Integer.parseInt(sc.nextLine());
			if (ch2 == 1)
				paymode = "Internet Banking";
			if (ch2 == 2)
				paymode = "Paytm";
			if (ch2 == 1 || ch2 == 2) {
				System.out.println("Enter amount paid ");
				amount = Integer.parseInt(sc.nextLine());
				System.out.println("records");
				System.out.println("Name"+custmap.get(id).getCustomerName());
				System.out.println("Customer Type"+custmap.get(id).getCustomerType());
				System.out.println("amount paid" + amount);
				System.out.println("Payment mode" + paymode);
				OnlineCustomer oc1=(OnlineCustomer) custmap.get(id);
				System.out.println("Discount Coupon "+oc1.getDiscountCoupon());
				remBal= amount-Integer.parseInt(oc1.getDiscountCoupon());
				System.out.println("Amount after discount : "+remBal);

				fileWrite(custmap.get(id).getCustomerName(), custmap.get(id).getCustomerType(), amount, paymode,
						remBal);
			} else {
				throw new InvalidPaymentModeException();
			}

		}

		else {
			System.out.println("Payment Mode : \n 1.Internet Banking \n 2.PayTm \n 3.Cash \n 4.Credit");
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
				System.out.println("Name"+custmap.get(id).getCustomerName());
				System.out.println("Customer Type"+custmap.get(id).getCustomerType());
				System.out.println("amount paid" + amount);
				System.out.println("Payment mode" + paymode);
				LocalStepInCustomer lc1 = (LocalStepInCustomer) custmap.get(id);
				// lc1.getMaxCreditLimit();
				System.out.println("max cr limit" + lc1.getMaxCreditLimit());
				remBal = lc1.getMaxCreditLimit() - amount;
				System.out.println("Reamining Balance" + remBal);
				fileWrite(custmap.get(id).getCustomerName(), custmap.get(id).getCustomerType(), amount, paymode,
						remBal);
			} else {
				throw new InvalidPaymentModeException();
			}

		}

	}

	private void fileWrite(String customerName, String customerType, int amount, String paymode, int remBal) {

		Date d = new Date();
		SimpleDateFormat fd = new SimpleDateFormat("dd-MM-yyyy");
		String date = fd.format(d);
		String record = "";

		try {
			FileWriter fw = new FileWriter(new File(customerName));
			BufferedWriter bw = new BufferedWriter(fw);
			record = "File Name : " + customerName + "\n Date of bill : " + date + "\n Amount : " + amount
					+ "\n Payment mode : " + customerType + "Payment mode : " + paymode + "\n Reamaining Balance"
					+ remBal;
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
