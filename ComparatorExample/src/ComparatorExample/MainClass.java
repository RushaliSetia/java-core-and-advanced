package ComparatorExample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainClass {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(23,"rushali"));
		list.add(new Employee(24,"ketan"));
		System.out.println("-----------------list before sorting-------------");
		System.out.println(list);
		System.out.println("--------------------------------------------------");
		System.out.println("-------------------list after sorting----------------");
		Collections.sort(list, new AgeComparator());
		System.out.println(list);
		Collections.sort(list, new NameComparator());
		System.out.println(list);
		System.out.println("------------------------------------------------------");
	}

}
