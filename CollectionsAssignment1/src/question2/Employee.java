package question2;

import java.util.Date;

public class Employee {

	private int empId;
	private String empName;
	private Date empDOB;
	public Employee() {
		super();
	}
	public Employee(int empId, String empName, Date empDOB) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDOB = empDOB;
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
	public Date getEmpDOB() {
		return empDOB;
	}
	public void setEmpDOB(Date empDOB) {
		this.empDOB = empDOB;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDOB=" + empDOB + "]";
	}
	
	
}
