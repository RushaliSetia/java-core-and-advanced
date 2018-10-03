package Question5;

public class EmployeeException extends Exception
{
     public EmployeeException(String string) {
		System.out.println("Employee Object with "+string+" can't ne created");
	}
}
