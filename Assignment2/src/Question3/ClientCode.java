package Question3;

import java.io.IOException;
import java.util.Scanner;

public class ClientCode {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		ClientCode c = new ClientCode();
		c.employeeData();
	}

	public void employeeData() throws IOException {
		System.out.println("Enter name of the Employee");
		String name = sc.nextLine();

		System.out.println("Enter gender of The Employee (M/F)");
		char gender = (char) System.in.read();
		

		System.out.println("Enter years of experience");
		double yearsOfExperience =sc.nextDouble();

		String designation = "";
		double salary = 0.0;
		if (yearsOfExperience == 0.0) {
			designation = "ASE";
			salary = 10000.0;

		} else if (yearsOfExperience >= 3.0) {
			designation = "ITA";
			salary = 15000.0;
		}

		Employee e = new Employee(name, gender);
		e.setBasicSalary(salary);
		e.setDesignation(designation);
		e.setStatus("ACTIVE");
		e.setYearsOfExp(yearsOfExperience);

		System.out.println("The details of the Employee are as follows");
		displayDetails(e);

		chooseSelection(e);
         System.out.println("You want to upgrade designation of employee");
         String choice1=sc.nextLine();
         
                  
         if(choice1=="y" || choice1=="Y")
		     upgradeDesignation(e);
         else
         {
        	 System.out.println("Thanks for your support");
         }
	}

	public void displayDetails(Employee e) {
		System.out.println("Name :" + e.getName());
		System.out.println("Gender :" + e.getGender());
		System.out.println("year of Exp. :" + e.getYearsOfExp());
		System.out.println("Designation :" + e.getDesignation());
		System.out.println("Basic Salary :" + e.getBasicSalary());
		System.out.println("Status :" + e.getStatus());

	}

	public void chooseSelection(Employee e) throws IOException {
		System.out.println("Did Employee quited the compnay?(y/n)");
		char decision = (char) System.in.read();

		if (decision == 'y' || decision == 'Y') {
			e.applyForLWP();
			System.out.println("The worker who quited the company have following details");
			displayDetails(e);
		} else {
			System.out.println("Thanks for your support");
		}
	}

	public void upgradeDesignation(Employee e) {
		System.out.println("Enter the designation of the Employee");
		System.out.println("1.ITA\n 2.AST\n 3.ASC");
		int choice1 = Integer.parseInt(sc.nextLine());

		switch (choice1) {
		case 1:
			e.promteEmp("ITA");
			break;
		case 2:
			e.promteEmp("AST");
			break;
		case 3:
			e.promteEmp("ASC");
			break;
		default:
			System.out.println("Sorry wrong choice");
			break;
		}
	}

}
