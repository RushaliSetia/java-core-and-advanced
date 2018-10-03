package Question8;

public abstract class Child {
    private String name;
    private char gender;
    private int age;
    
    public Child() {
		// TODO Auto-generated constructor stub
	}
    
    
    public Child(String name, char gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
    
    

	public String getName() {
		return name;
	}


	public char getGender() {
		return gender;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public abstract void setAge();
    public abstract void display();
    
    
}
