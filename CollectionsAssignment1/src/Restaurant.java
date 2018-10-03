import java.util.Scanner;

public class Restaurant {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Restaurant object = new Restaurant();
		while (true) {
			System.out.println("menu");
			System.out.println("1.display dishes");
			System.out.println("2.search dishes");
			System.out.println("3.exit");
			System.out.println("enter your choice:");
			int ch = Integer.parseInt(sc.nextLine());
			switch (ch) {
			case 1:
				object.display();
				break;
			case 2:
				object.search();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("invalid choice");
			}// end switch
		} // end while

	}// end main

	public void display() {
		for (Dish d : Menu.menuList) {
			System.out.println("-------------the list of dishes is as follows------------------------");
			System.out.println("dish id:" + d.getDishId());
			System.out.println("dish name:" + d.getDishName());
			System.out.println("creation time :" + d.getCreationTime());
			System.out.println("------------------------------------------------------------------------");
		}

	}

	public void search() {

		int id;
		System.out.println("enter the dish id u want to search for:");
		id = Integer.parseInt(sc.nextLine());
		for (Dish d : Menu.menuList) {
			if (id == d.getDishId()) {
				display();
			} else {
				System.out.println("dish does not exists");
			}
		}
	}
}
