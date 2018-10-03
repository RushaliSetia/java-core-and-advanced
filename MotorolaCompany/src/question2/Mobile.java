package question2;

import java.util.Date;

public class Mobile {

	private int mobileId;
	private String model;
	private String brand;
	private float price;
	private String manufacturerDate;

	public Mobile() {
		super();
	}

	public Mobile(int mobileId, String model, String brand, float price, String manufacturerDate) {
		super();
		this.mobileId = mobileId;
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.manufacturerDate = manufacturerDate;
	}

	public int getMobileId() {
		return mobileId;
	}

	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getManufacturerDate() {
		return manufacturerDate;
	}

	public void setManufacturerDate(String manufacturerDate) {
		this.manufacturerDate = manufacturerDate;
	}

	@Override
	public String toString() {
		return "Mobile [mobileId=" + mobileId + ", model=" + model + ", brand=" + brand + ", price=" + price
				+ ", manufacturerDate=" + manufacturerDate + "]";
	}

}
