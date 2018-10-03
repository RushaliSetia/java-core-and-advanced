package Question7;

public class CollegeCourse {
	private String department;
	private int courseNumber;
	private int credits;
	private int fee;

	public CollegeCourse() {
		// TODO Auto-generated constructor stub
	}

	public CollegeCourse(String department, int courseNumber, int credits) {
		super();
		this.department = department;
		this.courseNumber = courseNumber;
		this.credits = credits;
	}

	public String getDepartment() {
		return department;
	}

	public int getCourseNumber() {
		return courseNumber;
	}

	public int getCredits() {
		return credits;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public  void display()
	{
		System.out.println("Departmetn name "+getDepartment());
		System.out.println("Course Number "+getCourseNumber());
		System.out.println("Credits "+getCredits());
		System.out.println("Fees "+getFee());
	}
}
