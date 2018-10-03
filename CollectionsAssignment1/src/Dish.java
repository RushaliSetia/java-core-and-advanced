
public class Dish {

	private int dishId;
	private String dishName;
	private int creationTime;
	public Dish() {
		super();
	}
	public Dish(int dishId, String dishName, int creationTime) {
		super();
		this.dishId = dishId;
		this.dishName = dishName;
		this.creationTime = creationTime;
	}
	public int getDishId() {
		return dishId;
	}
	public void setDishId(int dishId) {
		this.dishId = dishId;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public int getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(int creationTime) {
		this.creationTime = creationTime;
	}
	@Override
	public String toString() {
		return "Dish [dishId=" + dishId + ", dishName=" + dishName + ", creationTime=" + creationTime + "]";
	}
	
	
	
}
