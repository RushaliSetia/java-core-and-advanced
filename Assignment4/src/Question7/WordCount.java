package Question7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;

public class WordCount {

	private int wordCount;
	private int charCount;
	private int linesCount;
	
	static final File F_1=new File("lear.txt");
	
	public String countData() throws Exception
	{
		FileReader fr=new FileReader(F_1);
		BufferedReader br=new BufferedReader(fr);
		
		String str="";
		while((str=br.readLine())!=null)
		{
			String strArr[]=str.split("\n");
			linesCount++;
			
			for (String string : strArr) {
				 char arr2[]=string.toCharArray();
				 for (char c : arr2) {
					 if((c>='a' && c<='z')|| (c<='A' && c>='Z'))
					 {
						 charCount++;
						 wordCount++;
					 }
					 else
					 {
						 wordCount++;
					 }
				}//end for each
			}//end outer foreach
		}//end while
		
		return "total no. of line :"+linesCount+" \ntotal no. of words :"+wordCount+" \ntotal no. of characters :"+charCount;
	}//end countData
}
