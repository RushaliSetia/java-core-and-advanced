package Question8;

import java.util.Scanner;

public class Male extends Child 
{

	 Scanner sc=new Scanner(System.in);
	
	public Male(String name) {
		super(name,'M');
		setAge();
	}
	
	
	
	@Override
	public void setAge() {
		System.out.println("Enter age of the male child");
		setAge(Integer.parseInt(sc.nextLine()));
	}

	@Override
	public void display() {
		System.out.println("Name :"+getName());
		System.out.println("Gender :"+getGender());
		System.out.println("Age :"+getAge());
	}

}
