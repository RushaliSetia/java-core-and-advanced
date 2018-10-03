package Question5;

import java.util.Scanner;

public class Restaurant extends Dish implements IRestaurant {
	
	@Override
	public String toString() {
		return "Restaurant [getDishId()=" + getDishId() + ", getDishName()=" + getDishName() + ", getDishPrice()="
				+ getDishPrice() + ", getDishMakeTime()=" + getDishMakeTime() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	static Dish[] menu;
	static {
		menu = new Dish[5];
		menu[0] = new Dish(101, "paneer", 200, 30);
		menu[1] = new Dish(102, "daal", 250, 20);
		menu[2] = new Dish(103, "rice", 100, 10);
		menu[3] = new Dish(104, "noodles", 150, 35);
		menu[4] = new Dish(105, "pasta", 200, 15);
	}

	@Override
	public Dish getDish(int dishId) {
		
		Restaurant r = new Restaurant();

		for (int i = 0; i < 5; i++) {
			if(dishId==r.menu[i].getDishId()){
				return menu[i];
			}
			
		}
		return null;
	}

	public static Dish dish(int dishId) {
		Restaurant r = new Restaurant();
		for (int i = 0; i < 5; i++) {
			if (dishId == r.menu[i].getDishId()) {
				return r;
				
			}
		}
		return null;
	}
}
