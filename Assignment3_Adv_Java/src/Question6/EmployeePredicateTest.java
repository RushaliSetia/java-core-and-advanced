package Question6;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class EmployeePredicateTest {

	public static void main(String[] args) {
		
		List<Employee> empList=Arrays.asList(new Employee(101,"Deepak Sharma",23),new Employee(102,"Deepak Kakra",22),new Employee(103,"Sharma Ji",60),new Employee(104,"Kakra Shabh",55));
		EmployeePredicateTest ept=new EmployeePredicateTest();
		
		ept.filter(empList, emp->emp.getEmpName().length() > 5);
		ept.filter(empList, emp->emp.getEmpName().charAt(0)=='A');
		ept.filter(empList, emp->emp.getAge() >=50);
		ept.filter(empList, emp->emp.getAge() <40);
		ept.filter(empList, emp->emp.getAge() < 30 && emp.getAge()==50);
	}
	
	public void filter(List<Employee> emp,Predicate<Employee> condition)
	{
		int count=0;
		for (Employee employee : emp) {
			if(condition.test(employee))
			{
				System.out.println(employee);
			}
		}
		System.out.println("----------------------------------------------------------");
	}
}
