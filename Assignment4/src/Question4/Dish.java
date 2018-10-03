package Question4;

import java.io.Serializable;

public class Dish implements Serializable{

	private int dishId;
	private String dishName;
	private double dishPrice;
	private String creationTime;

	public Dish(int dishId, String dishName, double dishPrice, String creationTime) {
		super();
		this.dishId = dishId;
		this.dishName = dishName;
		this.dishPrice = dishPrice;
		this.creationTime = creationTime;
	}

	
	public void setDishId(int dishId) {
		this.dishId = dishId;
	}


	public void setDishName(String dishName) {
		this.dishName = dishName;
	}


	public void setDishPrice(double dishPrice) {
		this.dishPrice = dishPrice;
	}


	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}


	public int getDishId() {
		return dishId;
	}

	public String getDishName() {
		return dishName;
	}

	public double getDishPrice() {
		return dishPrice;
	}

	public String getCreationTime() {
		return creationTime;
	}

	@Override
	public String toString() {
		return "Dish [dishId=" + dishId + ", dishName=" + dishName + ", dishPrice=" + dishPrice + ", creationTime="
				+ creationTime + "]";
	}

}
