package question3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Contacts {

	Scanner sc=new Scanner(System.in);
	Map<String, String> phonebook=new HashMap<>();
	
	public static void main(String[] args) {
		Contacts c=new Contacts();
		c.enterData();
	}
	
	public void enterData()
	{
		while(true)
		{
			System.out.println("Select choice");
			System.out.println("\n1.Add Contacts \n2.Search a Phone Number \n3.Quit");
			int choice=Integer.parseInt(sc.nextLine());
			
			switch(choice)
			{
			case 1:
				addContacts();
				break;
			case 2:
				searchContacts();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Sorry Wrong choice, Please try again");
			}
		}
	}
	
	public void addContacts()
	{
		System.out.println("Enter name of the person");
		String name=sc.nextLine();
		
		System.out.println("Enter phone number of the person");
		String phoneNumber=sc.nextLine();
		
		phonebook.put(name, phoneNumber);  
	}
	
	public void searchContacts()
	{
		System.out.println("Enter name of the person");
		String name=sc.nextLine();
		int count=0;
		for (String str : phonebook.keySet()) {
			
			if(str.equalsIgnoreCase(name))
			{
				System.out.println("Name :"+name);
				System.out.println("Phone Number :"+phonebook.get(str));
				System.out.println("---------------------------------------------");
				count=1;
			}
			
		}
		
		if(count==0)
		{	
				System.out.println("Person with name :"+name+" doesn't exist");
			
		}
	}
}
