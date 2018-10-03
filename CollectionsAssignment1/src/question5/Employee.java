package question5;

import java.util.Vector;

public class Employee implements EmployeeMethods{

	static Vector<Employee> emp=new Vector<>();
	private int employeeNo;
	private String employeeName;
	private String address;
	public Employee() {
		super();
	}
	public Employee(int employeeNo, String employeeName, String address) {
		super();
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.address = address;
	}
	public int getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [employeeNo=" + employeeNo + ", employeeName=" + employeeName + ", address=" + address + "]";
	}
	@Override
	public void addInput(Employee e) {
		emp.add(e);
	}
	
	
}
