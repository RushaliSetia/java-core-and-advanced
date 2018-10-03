package ComparatorExample;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		int val1 = o1.getAge();
		int val2 = o2.getAge();
		if (val1 == val2) {
			return 0;
		} else if (val1 > val2) {
			return 1;
		} else {
			return -1;
		}
	}

}
