package Question5;

public class Employee {

	int eId;
	String empName;

	public Employee(int eId, String empName) {
		super();
		this.eId = eId;
		this.empName = empName;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", empName=" + empName + "]";
	}
	
	

}
