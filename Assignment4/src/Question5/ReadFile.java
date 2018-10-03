package Question5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ReadFile {
   
	Scanner sc=new Scanner(System.in);
	static final File F_1=new File("Player.txt");
	
	public static void main(String[] args) {
	    ReadFile rf=new ReadFile();
	    
	    try
	    {
	    	rf.enterData();
	    }
	    catch(Exception e)
	    {
	    	
	    }
	}//end main
	
	public void enterData() throws Exception
	{
		FileReader fr=new FileReader(F_1);
		BufferedReader br=new BufferedReader(fr);
		
		String string="";
		int count=0;
		while((string=br.readLine())!=null)
		{
			System.out.println(string);
			char  arr[]=string.toCharArray();
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]=='.')
				{
					count++;
				}
			}//end for
		}//end while
		System.out.println("-------------------------------------------------");
		System.out.println("total number of lines :"+count);
		System.out.println("File Path(Absolute) :"+F_1.getAbsolutePath());
		System.out.println("File Path(Relative) :"+F_1.getPath());
		System.out.println("Total size of the file :"+F_1.getTotalSpace());
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		System.out.println("Last Modified date : " + sdf.format(F_1.lastModified()));

	}//end enterData
}
