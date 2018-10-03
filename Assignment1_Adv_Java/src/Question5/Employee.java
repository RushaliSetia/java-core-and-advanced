package Question5;

import java.util.Vector;

public class Employee implements MethodsOfEmployeeClass {
     int empNo;
     String empName;
     String address;
     static Vector<Employee> emp=new Vector<>();
     
     public Employee() {
	
	}

	public Employee(int empNo, String empName, String address) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.address = address;
	}
    
	
	
	public int getEmpNo() {
		return empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public String getAddress() {
		return address;
	}

	public static Vector<Employee> getEmp() {
		return emp;
	}

	@Override
	public void addInput(Employee e) {
		emp.add(e);
	}
     
}
