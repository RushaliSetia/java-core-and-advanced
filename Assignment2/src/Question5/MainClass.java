package Question5;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter DishID:");
		int id = sc.nextInt();
		Restaurant s = new Restaurant();
		Dish d = s.getDish(id);
		System.out.println(d);
	}

}
