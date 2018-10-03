package p1;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass {

	public static void main(String[] args) {

		ArrayList<Employee> alist = new ArrayList<Employee>();
		alist.add(new Employee(105, 56));
		alist.add(new Employee(102, 23));
		System.out.println("before sorting--------------");
		System.out.println(alist);
		System.out.println("-----------------------------");
		System.out.println();
		System.out.println("list after sorting-----------");
		Collections.sort(alist);
		System.out.println(alist);
		System.out.println("-------------------------------");
	}
}
