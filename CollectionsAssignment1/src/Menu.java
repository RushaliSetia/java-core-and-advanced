import java.util.ArrayList;

public class Menu {

	static ArrayList<Dish> menuList=new ArrayList<Dish>();
	
	static
	{
		menuList.add(new Dish(101,"spring role",5));
		menuList.add(new Dish(102,"burger",15));
	}
}
