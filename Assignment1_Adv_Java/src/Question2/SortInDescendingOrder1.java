package Question2;

import java.util.Comparator;

public class SortInDescendingOrder1 extends ManageEmployee implements Comparator<Employee>{

	public SortInDescendingOrder1() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmpDob().compareTo(o2.getEmpDob());
	}

	//hello
	
}
