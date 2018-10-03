package Question4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ClientCode {
	
	ArrayList<Dish> list=new ArrayList<Dish>();
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		ClientCode c=new ClientCode();
   		c.selectChoice();
	}
	
	public void selectChoice() throws Exception
	{
		while(true)
		{
			System.out.println("\n0.Exit \n1.Add Dishes \n2.Update dish \n3.Show all Dishes");
			System.out.println("Enter your choice");
			int choice=Integer.parseInt(sc.nextLine());
			
			switch(choice)
			{
			case 0:
				System.exit(0);
				break;
			case 1:
				defaultAdd();
				enterData();
				break;
			case 2:
				updateData();
				break;
			case 3:
				displayData();
				break;
			default:
				System.out.println("Sorry, wrong choice please select again");
			}
		}
	}
	
	
	public void defaultAdd()
	{
		list.add(new Dish(101, "Momos", 120.0, "10:45 AM"));
		list.add(new Dish(102, "Daal Batti", 100.0, "06:45 PM"));
		list.add(new Dish(103, "Aalo pyaz-tikkad", 100.0, "05:45 PM"));
	}//end defaultAdd
	
	
	public void enterData()
	{
		System.out.println("Enter total number of dishes you want to add");
		int count=Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<count;i++)
		{
			System.out.println("Enter dish id");
			int dishId=Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter dish name");
			String dishName=sc.nextLine();
			
			System.out.println("Enter dish price");
			double dishPrice=Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter creation time in format(hh:mm AM/PM)");
			String creationTime=sc.nextLine();
			
			list.add(new Dish(dishId, dishName, dishPrice, creationTime));
		}
		
		
		try {
			
			storingDataIntoFile();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}//end enterData
	
	public void updateData() throws Exception
	{
		System.out.println("Enter Dish ID to search the Dish");
		int dishId=Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getDishId()==dishId)
			{
				System.out.println("Enter what you want to update");
				System.out.println("\n0.Exit \n1.dish Name \n2.dish cost \n3.creation time of dish");
				int choice=Integer.parseInt(sc.nextLine());
				
				switch(choice)
				{
				case 0:
					System.exit(0);
					break;
				case 1:
					System.out.println("Enter Dish Name");
					list.get(i).setDishName(sc.nextLine());
					break;
				case 2:
					System.out.println("Enter Dish Cost");
					list.get(i).setDishPrice(Double.parseDouble(sc.nextLine()));
					break;
				case 3:
					System.out.println("Enter creation date in format (hh:mm AM/PM)");
					list.get(i).setCreationTime(sc.nextLine());
					break;
				default:
					System.out.println("sorry wrong choice");
				}//end switch
			}//end else
		}//end for
		
		storingDataIntoFile();
	}//end updateData
	
	public void displayData() throws Exception
	{
	  File file=new File("Dishes.txt");
	  FileInputStream fis=new FileInputStream(file);
	  ObjectInputStream ois=new ObjectInputStream(fis);
	  
	  Object obj;
	  int c=0;
	  while((obj=ois.readObject())!=null)
	  {
		  Dish dish=(Dish)obj;
		  System.out.println(dish);
		  c++;
		  if(c==list.size())
		  {
			  break;
		  }
	  }
	  System.out.println("--------------------------------------------------------------------------------------------");
	  
	}
	
	public void storingDataIntoFile() throws Exception
	{
		File file=new File("Dishes.txt");
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		for(int i=0;i<list.size();i++)
		{
			oos.writeObject(list.get(i));
		}
	}
	
	

}
