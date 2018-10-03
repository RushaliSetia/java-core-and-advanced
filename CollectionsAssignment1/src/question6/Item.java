package question6;

public class Item {

	private int ItemId;
	private double ItemPrice;
	private String ItemDesc;
	public Item(int itemId, double itemPrice, String itemDesc) {
		super();
		ItemId = itemId;
		ItemPrice = itemPrice;
		ItemDesc = itemDesc;
	}
	public Item() {
		super();
	}
	public int getItemId() {
		return ItemId;
	}
	public void setItemId(int itemId) {
		ItemId = itemId;
	}
	public double getItemPrice() {
		return ItemPrice;
	}
	public void setItemPrice(double itemPrice) {
		ItemPrice = itemPrice;
	}
	public String getItemDesc() {
		return ItemDesc;
	}
	public void setItemDesc(String itemDesc) {
		ItemDesc = itemDesc;
	}
	@Override
	public String toString() {
		return "Item [ItemId=" + ItemId + ", ItemPrice=" + ItemPrice + ", ItemDesc=" + ItemDesc + "]";
	}
	
	
}
