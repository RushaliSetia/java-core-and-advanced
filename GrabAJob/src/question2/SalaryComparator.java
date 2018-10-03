package question2;

import java.util.Comparator;

public class SalaryComparator implements Comparator<JobApplication> {

	@Override
	public int compare(JobApplication o1, JobApplication o2) {
		int val1 = o1.getCurrentSalary();
		int val2 = o2.getCurrentSalary();
		if (val1 == val2) {
			return 0;
		} else if (val1 > val2)
			return 1;
		else
			return -1;

	}

}
