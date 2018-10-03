package Question6;

public class Item {

	private int itemId;
	private double itemPrice;
	private String itemDesc;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(int itemId, double itemPrice, String itemDesc) {
		super();
		this.itemId = itemId;
		this.itemPrice = itemPrice;
		this.itemDesc = itemDesc;
	}

	public int getItemId() {
		return itemId;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public String getItemDesc() {
		return itemDesc;
	}
	
}
