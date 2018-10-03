package Question6;

public class Employee {

	int eId;
	String empName;
	int age;

	public Employee(int eId, String empName,int age) {
		super();
		this.eId = eId;
		this.empName = empName;
		this.age=age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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
		return "Employee [eId=" + eId + ", empName=" + empName + ", age=" + age + "]";
	}

	
	

}
