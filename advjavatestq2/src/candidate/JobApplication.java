package candidate;

public class JobApplication implements Comparable<JobApplication>{
	
	private String userName;
	private int yearsOfExp;
	private int currentSalary;
	private int expectedSalary;
	public JobApplication() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JobApplication(String userName, int yearsOfExp, int currentSalary, int expectedSalary) {
		super();
		this.userName = userName;
		this.yearsOfExp = yearsOfExp;
		this.currentSalary = currentSalary;
		this.expectedSalary = expectedSalary;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getYearsOfExp() {
		return yearsOfExp;
	}
	public void setYearsOfExp(int yearsOfExp) {
		this.yearsOfExp = yearsOfExp;
	}
	public int getCurrentSalary() {
		return currentSalary;
	}
	public void setCurrentSalary(int currentSalary) {
		this.currentSalary = currentSalary;
	}
	public int getExpectedSalary() {
		return expectedSalary;
	}
	public void setExpectedSalary(int expectedSalary) {
		this.expectedSalary = expectedSalary;
	}
	@Override
	public String toString() {
		return "JobApplication [userName=" + userName + ", yearsOfExp=" + yearsOfExp + ", currentSalary="
				+ currentSalary + ", expectedSalary=" + expectedSalary + "]";
	}
	@Override
	public int compareTo(JobApplication o) {
		if(this.yearsOfExp>o.yearsOfExp)
			return 1;
		else if(this.yearsOfExp==o.yearsOfExp)
			return 0;
		else 
			return -1;
		
	}
	
	

}
