package Question2;

public class Student {

	private int stdId;
	private String firstName;
	private String lastName;
	private double creditHours;
	
	public Student(int stdId, String firstName, String lastName, double creditHours) {
		super();
		this.stdId = stdId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.creditHours = creditHours;
	}
	
	public Student displayDetails()
	{
		return this;
	}
}
