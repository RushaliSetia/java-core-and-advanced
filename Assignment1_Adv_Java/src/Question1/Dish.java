package Question1;

public class Dish {

	int dishId;
	String dishName;
	String creationTime;
	
	public Dish() {
		
	}
	
	public Dish(int dishId, String dishName, String creationTime) {
		super();
		this.dishId = dishId;
		this.dishName = dishName;
		this.creationTime = creationTime;
	}
	
	

	public int getDishId() {
		return dishId;
	}

	public String getDishName() {
		return dishName;
	}

	public String getCreationTime() {
		return creationTime;
	}

	@Override
	public String toString() {
		return "Dish [dishId=" + dishId + ", dishName=" + dishName + ", creationTime=" + creationTime + "]";
	}
	
	
	
	
}
