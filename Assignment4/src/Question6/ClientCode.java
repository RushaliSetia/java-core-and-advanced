package Question6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ClientCode {

	Scanner sc=new Scanner(System.in);
	ArrayList<RationalNumbers> list=new ArrayList<RationalNumbers>();
	
	static final File FILE_INPUT=new File("input.txt");
	static final File FILE_RESULT=new File("result.txt");
	public static void main(String[] args)throws Exception {
		ClientCode c=new ClientCode();
		c.takingInputFromFile();
		c.functionality();
	}
	
	public void takingInputFromFile() throws Exception
	{
		FileReader fr=new FileReader(FILE_INPUT);
		BufferedReader br=new BufferedReader(fr);
		
	    String string="";
	    while((string=br.readLine())!=null)
	    {
	    	String str[]=string.split("and");
	    	for(int i=0;i<str.length;i++)
	    	{
	    		String str1[]=str[i].trim().split("/");
	    		list.add(new RationalNumbers(Integer.parseInt(str1[0]), Integer.parseInt(str1[1])));
	    	}//end for
	    }//end while
	}//end takingInputFromFile
	
	public void functionality() throws Exception
	{
		for(int i=0;i<list.size();i++)
		   {
			    list.get(i).arr[RationalNumbers.count++]=list.get(i).computeRational();
		   }
		while(true){
		System.out.println("\n0.Exit \n1.addition \n2.substraction \n3.multiply \n4.divide");
		System.out.println("Select choice");
		int choice=Integer.parseInt(sc.nextLine());
		
		switch(choice)
		{
		case 0:
			System.exit(0);
			break;
		case 1:
			   System.out.println("Addition is "+list.get(0).addNumbers());
			   writeIntoFile(list.get(0).addNumbers());
			break;
		case 2:
			  System.out.println("substraction of first two rational numbers is "+list.get(0).subNumber());
			  writeIntoFile(list.get(0).subNumber());
			break;
		case 3:
			System.out.println("Multiplication is "+list.get(0).mulNumber());
            writeIntoFile(list.get(0).mulNumber());
			break;
		case 4:
			System.out.println("division of two numers is "+list.get(0).divideNumber());
			writeIntoFile(list.get(0).divideNumber());
			break;
		default:
			System.out.println("Sorry wrong choice, Please select a correct one");
		}//end switch
		}//end while	
	}//end functionality
	
	public void printArray()
	{
		for(int i=0;i<RationalNumbers.count;i++)
		{
			System.out.println(RationalNumbers.arr[i]);
		}
	}//end printArray
	
	public void writeIntoFile(double value) throws Exception
	{
		FileOutputStream fos=new FileOutputStream(FILE_RESULT);
		PrintWriter pw=new PrintWriter(fos);
		
		pw.write(value+" ");
		pw.close();
	}
	
}//end class