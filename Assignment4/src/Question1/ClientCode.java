package Question1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.Scanner;

public class ClientCode {

	    Scanner sc=new Scanner(System.in);
	    public static void main(String[] args) throws Exception {
		    ClientCode c=new ClientCode();
		    c.enterData();
		}
	
	    public void enterData() throws IOException
	    {
	    	File f=new File("Employee.txt");
	    	FileWriter fw=new FileWriter(f);
	    	PrintWriter pw=new PrintWriter(fw);
	    	
	    	System.out.println("Enter emplID for an Employee");
	    	int empID=Integer.parseInt(sc.nextLine());
	    	
	    	System.out.println("Enter name of the Employee");
	    	String name=sc.nextLine();
	    	
	    	System.out.println("Enter age of Employee");
	    	int empAge=Integer.parseInt(sc.nextLine());
	    	
	    	pw.write(empID+","+name+","+empAge);
	    	pw.close();
	    	
	    	System.out.println("Record Inserted");
	    	
	    	FileInputStream io=new FileInputStream(f);
	    	int c=0;
	    	System.out.println("Data inside file is-----------------");
	    	
	    	while((c=io.read())!=-1)
	    	{
	    		if((char)c==',')
	    		{
	    			System.out.println(" ");
	    		}
	    		else
	    		{
	    		System.out.print((char)c);
	    		}
	    	}
	    	
	    	io.close();	    	 
	    }
	    
}
