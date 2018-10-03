package Question4;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ClientCode {

	Scanner sc=new Scanner(System.in);
	Hashtable<String, String> htable=new Hashtable<>();
	public static void main(String[] args) {
		ClientCode c=new ClientCode();
		c.enterData();
	}
	
	public void enterData()
	{
		while(true)
		{
			System.out.println("Select an option");
			System.out.println("\n0.Exit \n1.Add Product \n2.Search Product \n3.Remove Product \n4.Display All Products");
			int choice=Integer.parseInt(sc.nextLine());
			
			switch(choice)
			{
			case 0:
				System.exit(0);
				break;
			case 1:
				add();
				break;
			case 2:
				search();
				break;
			case 3:
				remove();
			    break;
			case 4:
				display();
				break;
			default:
				System.out.println("Sorry Wrong Input please try again");
			}
		}//emd while
	}
	
	public void add()
	{
		htable.put("P001", "Maruti800");
		htable.put("P002", "MarutiZen");
		htable.put("P003", "MarutiAlto");
		htable.put("P004", "MarutiEsteem");
		htable.put("P005", "MarutiSwift");
		htable.put("P006", "MarutiSwiftDezire");
		htable.put("P007", "MarutiBalano");
		htable.put("P008", "ToyotaFortuner");
		htable.put("P009", "MahendraScorpio");
		htable.put("P010", "BMW");
	}
	
	public void remove()
	{
		System.out.println("Enter Product Id to remove");
		String id=sc.nextLine();
		Set<String> set=htable.keySet();
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			String str=itr.next();
			if(str.equalsIgnoreCase(id))
			{
				htable.remove(str);
				break;
			}
		}
	}
	
	public void search()
	{
		System.out.println("Enter Product Id to search");
		String id=sc.nextLine();
		Set<String> set=htable.keySet();
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			String str=itr.next();
			if(str.equalsIgnoreCase(id))
			{
				System.out.println(str+" :: "+htable.get(str));
				System.out.println("----------------------------------------------");
				break;
			}
		}
	}
	public void display()
	{
		Set<String> set=htable.keySet();
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			String str=itr.next();
			System.out.println(str+"  "+htable.get(str));
			System.out.println("-----------------------------------------------------------------------");
		}
	}
}
