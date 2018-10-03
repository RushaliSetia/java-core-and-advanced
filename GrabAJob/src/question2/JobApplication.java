package question2;

public class JobApplication {

	String userName;
	int yearsOfExperience, currentSalary, expectedSalary;

	public JobApplication() {
		super();
	}

	public JobApplication(String userName, int yearsOfExperience, int currentSalary, int expectedSalary) {
		super();
		this.userName = userName;
		this.yearsOfExperience = yearsOfExperience;
		this.currentSalary = currentSalary;
		this.expectedSalary = expectedSalary;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
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
		return "JobApplication [userName=" + userName + ", yearsOfExperience=" + yearsOfExperience + ", currentSalary="
				+ currentSalary + ", expectedSalary=" + expectedSalary + "]";
	}
	
}
