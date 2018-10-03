package Question5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PrintEmployeeInfo {

	public static void main(String[] args) {
		
		System.out.println("Output using lambda expression");
		System.out.println();
		List<Employee> emp=Arrays.asList(new Employee(101,"Deepak Sharma"),new Employee(102,"Deepak Kakra"),new Employee(103,"Sharma Ji"));
		
		Consumer<Employee> c=(Employee e)->{
			System.out.println(e);
		};
	        emp.forEach(c);
	        
	    System.out.println("------------------------------------------------------------------------------------------------");
	    System.out.println("Output using annonymous function");
	    System.out.println();
	    Consumer<Employee> c1=new Consumer<Employee>() {
			
			@Override
			public void accept(Employee t) {
		          System.out.println(t);		
			}
		};
		
		emp.forEach(c1);
	}
}
