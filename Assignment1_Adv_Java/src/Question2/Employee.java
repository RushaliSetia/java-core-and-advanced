package Question2;

import java.util.Date;

public class Employee {

	int empId;
	String empName;
	Date empDob;

	public Employee() {

	}

	public Employee(int empId, String empName, Date empDob) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDob = empDob;
	}
	
	

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Date getEmpDob() {
		return empDob;
	}

	public void setEmpDob(Date empDob) {
		this.empDob = empDob;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDob=" + empDob + "]";
	}

}
