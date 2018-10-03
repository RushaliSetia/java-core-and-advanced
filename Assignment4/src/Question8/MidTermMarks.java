package Question8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class MidTermMarks {

	static final File F_1=new File("MidTermMarks.txt");
	int arr[]=new int[11];
	
	public static void main(String[] args) throws Exception {
		MidTermMarks mtm=new MidTermMarks();
		mtm.enterData();
	}
	
	public void enterData() throws Exception
	{
		FileReader fr=new FileReader(F_1);
		BufferedReader br=new BufferedReader(fr);
		
		String str="";
		while((str=br.readLine())!=null)
		{
			int n=Integer.parseInt(str);
			n=n/10;
			int a=0;
			a=arr[n];
			arr[n]=++a;
			//System.out.println("arr["+n+"]"+"="+arr[n]);
		}
		
		makeHistogram();
	}//end enterData
	
	public void makeHistogram()
	{
		for(int i=0;i<11;i++)
		{
			switch(i)
			{
			case 0:
				  String str="";
				  for(int j=0;j<arr[i];j++)
				  {
					  str+="*";
				  }
				System.out.println("00-09:"+str);
				break;
			case 1:
				str="";
				  for(int j=0;j<arr[i];j++)
				  {
					  str+="*";
				  }
				System.out.println("10-19:"+str);
				break;
			case 2:
				str="";
				  for(int j=0;j<arr[i];j++)
				  {
					  str+="*";
				  }
				System.out.println("20-29:"+str);
				break;
			case 3:
				  str="";
				  for(int j=0;j<arr[i];j++)
				  {
					  str+="*";
				  }
				System.out.println("30-39:"+str);
				break;
			case 4:
				str="";
				  for(int j=0;j<arr[i];j++)
				  {
					  str+="*";
				  }
				System.out.println("40-49:"+str);
				break;
			case 5:
				str="";
				  for(int j=0;j<arr[i];j++)
				  {
					  str+="*";
				  }
				System.out.println("50-59:"+str);
				break;
			case 6:
				str="";
				  for(int j=0;j<arr[i];j++)
				  {
					  str+="*";
				  }
				System.out.println("60-69:"+str);
				break;
			case 7:
				str="";
				  for(int j=0;j<arr[i];j++)
				  {
					  str+="*";
				  }
				System.out.println("70-79:"+str);
				break;
			case 8:
				str="";
				  for(int j=0;j<arr[i];j++)
				  {
					  str+="*";
				  }
				System.out.println("80-89:"+str);
				break;
			case 9:
				str="";
				  for(int j=0;j<arr[i];j++)
				  {
					  str+="*";
				  }
				System.out.println("90-99:"+str);
				break;
			case 10:
				str="";
				  for(int j=0;j<arr[i];j++)
				  {
					  str+="*";
				  }
				System.out.println("  100:"+str);
				break;
			}
		}
	}
}
