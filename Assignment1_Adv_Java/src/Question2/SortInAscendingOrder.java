package Question2;

import java.util.Comparator;

public class SortInAscendingOrder extends ManageEmployee implements Comparator<Employee>{

	public SortInAscendingOrder() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.getEmpDob().compareTo(o1.getEmpDob());
	}

}
