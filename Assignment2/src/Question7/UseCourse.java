package Question7;

import java.util.Scanner;

public class UseCourse {
  
	Scanner sc=new Scanner(System.in);
	  public static void main(String[] args) {
		   UseCourse uc=new UseCourse();
		   uc.performOperations();
	}
	  
	  public void performOperations()
	  {
		  System.out.println("Enter department Name");
		  String department=sc.nextLine();
		  
		  System.out.println("Enter Course Number");
		  int courseNumber=Integer.parseInt(sc.nextLine());
		  
		  System.out.println("Enter credits");
		  int credits=Integer.parseInt(sc.nextLine());
		  
		  System.out.println("Enter hours of tution");
		  int hours=Integer.parseInt(sc.nextLine());
	
		  if(department.equalsIgnoreCase("BIO")||department.equalsIgnoreCase("CHM")||department.equalsIgnoreCase("CIS")||department.equalsIgnoreCase("PHY"))
		  {
			   System.out.println("Enter fees");
			   LabCourse lc=new LabCourse();
			   lc.setFee(Integer.parseInt(sc.nextLine())*hours);
			   
			   System.out.println("The details of departments having Lab Class is as follows");
			   lc.display();
		  }
		  else
		  {
			  System.out.println("Enter fees");
			   CollegeCourse cc=new CollegeCourse(department,courseNumber,credits);
			   cc.setFee(Integer.parseInt(sc.nextLine())*hours);
			   
			   System.out.println("The details of departments didn't have Lab class is as follows");
			   cc.display();
		  }
		  
	  }
}
