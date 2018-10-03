package Question6;

import java.util.Scanner;

public class ClientCode 
{
   Student arrStud[];
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws ScoreException {
		ClientCode c=new ClientCode();
		c.enterData();
	}
	
	public void  enterData() throws ScoreException {
		arrStud=new Student[]{new Student(101,50),new Student(102,90),new Student(103,-102),new Student(104,105),new Student(105,63)};
	   
		
	     for(Student s:arrStud)
	     {
	    	 try{
	    	 if(s.getMarks()>=0 && s.getMarks()<=100)
	    	 {
	    		 System.out.println("Student ID "+s.getStdID()+" having marks "+s.getMarks());
	    	 }
	    	 else
	    	 {
	    		 throw new ScoreException(s.getStdID()+" having "+s.getMarks()+" are not valid marks");
	    	 }
	    	 }
	    	 catch (Exception e) {
				// TODO: handle exception
			}
	     }
		
		
	}
}
