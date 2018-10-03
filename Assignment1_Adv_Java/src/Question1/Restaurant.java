package Question1;

import java.util.Scanner;

public class Restaurant {

	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Restaurant res=new Restaurant();
		res.enterData();
	}
	
	public void enterData()
	{
		
		while(true){
	   System.out.println("Select an option");
	   System.out.println("0.Exit \n1.Display All Dishes \n2.Search Dishes");
	   int choice=Integer.parseInt(sc.nextLine());
	   
	   switch (choice) {
	case 0:
		  System.exit(0);
		break;
	case 1:
		displayData();
		break;
	case 2:
		searchData();
		break;
	default:
		System.out.println("choose valid option");
	}//end switch
		}//end while
	   
	}//end enterData
	
	public void displayData()
	{
		for (Dish dish : Menu.dishes) {
		     displayDetails(dish);	
		}
	}
	
	public void searchData()
	{
		System.out.println("Enter dish Id");
		int dishId=Integer.parseInt(sc.nextLine());
		
		for (Dish dish : Menu.dishes) {
			if(dish.getDishId()==dishId)
			{
				displayDetails(dish);
			}
		}
	}//end searchData
	
	public void displayDetails(Dish dish)
	{
		System.out.println("Dish Id :"+dish.getDishId());
		System.out.println("Dish name :"+dish.getDishName());
		System.out.println("Dish creation time :"+dish.getCreationTime());
		System.out.println("---------------------------------------------------------------------");
	}
}//end class
