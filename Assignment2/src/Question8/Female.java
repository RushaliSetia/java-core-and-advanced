package Question8;

import java.util.Scanner;

public class Female extends Child 
{

	 Scanner sc=new Scanner(System.in);
	
	public Female(String name) {
		super(name,'F');
		
		setAge();
	}
	
	
	
	@Override
	public void setAge() {
		System.out.println("Enter age of the female child");
		setAge(Integer.parseInt(sc.nextLine()));
	}

	@Override
	public void display() {
		System.out.println("Name :"+getName());
		System.out.println("Gender :"+getGender());
		System.out.println("Age :"+getAge());
	}

}
