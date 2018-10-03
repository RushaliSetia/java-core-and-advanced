package question2;

import java.util.Comparator;

public class SortInAscendingOrder implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.getEmpDOB().compareTo(o1.getEmpDOB());

	}

}
