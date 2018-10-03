package p1;

import java.util.Scanner;

public class BigBagStoreApp {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws InvalidPaymentModeException {
		BigBagStoreOperations bbo = new BigBagStoreOperations();
		BigBagStoreApp obj = new BigBagStoreApp();
		while (true) {
			System.out.println("Select Option \n1.Store Customer \t\t 2.Count No of Online Customers \n"
					+ "3.Count No of Local Customers \t 4.Make Payment \t 5.Exit");
			System.out.println("Enter your choice : ");
			int ch = Integer.parseInt(sc.nextLine());
			switch (ch) {
			case 1:
				obj.addCustomers();
				break;
			case 2:System.out.println("No of Local Customers are "+bbo.countCust("Local") );
				break;
			case 3:System.out.println("No of Online Customers are "+bbo.countCust("Online"));
					break;
			case 4: obj.makePayment();
				break;
				
			default:System.out.println("Wrong choice");
				break;
			}

		}

	}

	private void makePayment() throws InvalidPaymentModeException {
		
		System.out.println("Enter user name ");
		String name=sc.nextLine();
		BigBagStoreOperations bbo=new BigBagStoreOperations();
		int id=bbo.checkCust(name);
		if(id!=0){
			bbo.payment(id);
			
		}else{
			System.out.println("user doesnt exist!!!");
		}
		
		
		
	}

	private void addCustomers() {
		
		int flag=0;
		System.out.println("Enter Customer Id");
		int custId=Integer.parseInt(sc.nextLine());
		System.out.println("Enter the Customer name");
		String name = sc.nextLine();
		System.out.println("Type of customer : ");
		System.out.println("1.Local Customer \n 2.Online Customer ");
		int ch1 = Integer.parseInt(sc.nextLine());
		while (flag==0) {
			switch (ch1) {
			case 1:
				addLocal(custId,name);
				flag=1;
				break;
			case 2:
				addOnline(custId,name);
				flag=1;
				break;
			case 3:
				System.exit(0);
			default:
				break;
			}

		}

	}

	private void addOnline(int customerId,String name) {
		String customerType = "Online";
		System.out.println("Enter Discount Coupon : ");
		String discountCoupon = sc.nextLine();
		OnlineCustomer oc = new OnlineCustomer(customerId, name, customerType, discountCoupon);
		BigBagStoreOperations bbo = new BigBagStoreOperations();
		bbo.addCustToMap(oc);

	}

	private void addLocal(int customerId,String name) {

		String customerType = "Local";
		System.out.println("Enter Maximum credit limit ");
		int maxCrLimit = Integer.parseInt(sc.nextLine());
		LocalStepInCustomer lsc = new LocalStepInCustomer(customerId,name, customerType, maxCrLimit);
		BigBagStoreOperations bbo = new BigBagStoreOperations();
		bbo.addCustToMap(lsc);

	}

}
