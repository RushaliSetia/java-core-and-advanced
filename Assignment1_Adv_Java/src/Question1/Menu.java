package Question1;

import java.util.ArrayList;

public class Menu 
{
    static ArrayList<Dish> dishes=new ArrayList<>();
    
    static
    {
    	dishes.add(new Dish(101,"Momos","10:45 AM"));
    	dishes.add(new Dish(102,"Daal Baati","06:45 PM"));
    	dishes.add(new Dish(101,"Aalo Pyazz-Tikkad","05:45 PM"));
    }
    
    
}
