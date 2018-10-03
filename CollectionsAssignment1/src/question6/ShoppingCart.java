package question6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ShoppingCart {

	Scanner sc=new Scanner(System.in);
	static ArrayList<Item> systemCart=new ArrayList<>();
	ArrayList<Item> userCart=new ArrayList<>();
	
	static
	{
		systemCart.add(new Item(101, 20.0, "ToothBrush"));
		systemCart.add(new Item(102, 2500.0, "Wrogn Jeans"));
		systemCart.add(new Item(103, 999.0, "Jhon Player Trouser"));
		systemCart.add(new Item(104, 1500.0, "Seven Tshirts"));
		systemCart.add(new Item(105, 5000.0, "Silk Saries"));
	}
	
	public static void main(String[] args) {
	   ShoppingCart s=new ShoppingCart();
	   s.enterData();	   
	}
	
	public void enterData()
	{
		while(true)
		{
			System.out.println("Select Choice");
			System.out.println("\n0.Exit \n1.Display Items \n2.Add Items To List \n3.Delete Item From List \n4.Display Items Purchased \n5.Generate Bill");
			int choice=Integer.parseInt(sc.nextLine());
			
			switch(choice)
			{
			case 0:
				generateBill();
				System.exit(0);
				break;
			case 1:
				 displayItems();
				 break;
			case 2:
				addItemToList();
				break;
			case 3:
				deleteItemFromList();
				break;
			case 4:
				displayUsersItems();
				break;
			case 5:
				generateBill();
				break;
			default:
				System.out.println("Sorry Wrong choice, Choose again");
			}
		}
	}
	
	public void addItemToList()
	{
		System.out.println("Enter Item ID to add in your list");
		int itemId=Integer.parseInt(sc.nextLine());
		Iterator<Item> itr=ShoppingCart.systemCart.iterator();
		int index=0;
		while(itr.hasNext())
		{
			if(itr.next().getItemId()==itemId)
			{
				userCart.add(systemCart.get(index));
				System.out.println("Item added");
			}
			
		  index++;
		}
		
	}
	
	public void deleteItemFromList()
	{
		System.out.println("Enter Item Id to delete from List");
		int itemId=Integer.parseInt(sc.nextLine());
		Iterator<Item> itr=userCart.iterator();
		int index=0;
		try{
		while(itr.hasNext())
		{
			if(itr.next().getItemId()==itemId)
			{
				userCart.remove(index);
				System.out.println("Item deleted");
			}
		  index++;
		}
		}
		catch(Exception e)
		{
			
		}
	}
	
	public void generateBill()
	{
		Iterator<Item> itr=userCart.iterator();
		double totalSum=0.0;
		while(itr.hasNext())
		{
			totalSum+=itr.next().getItemPrice();
		}
		
		System.out.println("Total Bill "+totalSum);
		System.out.println("Thanks for visiting us");
		System.out.println("---------------------------------------------------");
	}
	
	public void displayUsersItems()
	{
		Iterator<Item> itr=userCart.iterator();
		
		while(itr.hasNext())
		{
			displayData(itr.next());
		}
				
	}
	
	public void displayItems()
	{
		Iterator<Item> itr=ShoppingCart.systemCart.iterator();
		while(itr.hasNext())
		{
			displayData(itr.next());
		}
	}
	
	public void displayData(Item i)
	{
		System.out.println("Item Id :"+i.getItemId());
		System.out.println("Item Price :"+i.getItemPrice());
		System.out.println("Item Desc :"+i.getItemDesc());
		System.out.println("-----------------------------------------------");
	}
}
