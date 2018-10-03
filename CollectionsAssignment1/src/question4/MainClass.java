package question4;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class MainClass {

	Hashtable<String, String> table = new Hashtable<String, String>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		MainClass object = new MainClass();
		while (true) {
			System.out.println("1.add\n2.search\n3.remove\n4.display\n5.exit");
			System.out.println("enter choice:");
			int ch = Integer.parseInt(sc.nextLine());
			switch (ch) {
			case 1:
				object.add();
				break;
			case 2:
				object.search();
				break;
			case 3:
				object.remove();
				break;
			case 4:
				object.display();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("error");

			}// end of switch
		} // end of while
	}// end of main

	public void add() {
		table.put("P001", "Maruti800");
		table.put("P002", "MarutiZen");
		table.put("P003", "MarutiEsteem");
		System.out.println("record inserted!!!!!");
	}

	public void search() {
		String id;
		System.out.println("enter the id you want to search for:");
		id = sc.nextLine();
		Set<String> set = table.keySet();
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			if (str.equalsIgnoreCase(id)) {
				System.out.println(str + "::" + table.get(str));
				System.out.println("------------------------------------------------");
				break;
			} // end of if
		} // end while
	}// end search

	public void remove() {
		String id;
		System.out.println("enter the id you want to delete:");
		id = sc.nextLine();
		Set<String> set = table.keySet();
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			if (str.equalsIgnoreCase(id)) {
				table.remove(str);
				System.out.println("product deleted");
				System.out.println("now the list is :" + table);
				break;
			} // end of if
		} // end of while
	}// end of remove

	public void display() {
		Set<String> set = table.keySet();
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str + "::" + table.get(str));
		} // end of while
	}// end of display

}// end of class
