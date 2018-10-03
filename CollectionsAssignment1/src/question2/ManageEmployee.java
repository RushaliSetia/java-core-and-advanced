package question2;

import java.util.Date;
import java.util.LinkedList;

public class ManageEmployee {

	static LinkedList<Employee> employeeList = new LinkedList<Employee>();
	static {
		employeeList.add(new Employee(101, "rushali", new Date(1996, 04, 17)));
		employeeList.add(new Employee(102, "tushar", new Date(2000, 11, 24)));

	}
}
