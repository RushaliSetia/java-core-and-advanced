package question2;

import java.util.Comparator;

public class SortInDescendingOrder implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmpDOB().compareTo(o2.getEmpDOB());
	}

}
