package question1;

public abstract class Customer implements Payment {

	private String customername;
	private String customertype;
	private int customerid;

	public Customer() {
		super();
	}

	public Customer(String customername, String customertype, int customerid) {
		super();
		this.customername = customername;
		this.customertype = customertype;
		this.customerid = customerid;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getCustomertype() {
		return customertype;
	}

	public void setCustomertype(String customertype) {
		this.customertype = customertype;
	}

	@Override
	public String toString() {
		return "Customer [customername=" + customername + ", customertype=" + customertype + ", customerid="
				+ customerid + "]";
	}

}
