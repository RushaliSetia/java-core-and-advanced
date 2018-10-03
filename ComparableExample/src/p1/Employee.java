package p1;

public class Employee implements Comparable<Employee> {

	private int id, age;

	public Employee(int id, int age) {
		super();
		this.id = id;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Employee o) {
		if (age == o.age) {
			return 0;
		} else if (age > o.age) {
			return 1;
		} else
			return -1;
	}

}
