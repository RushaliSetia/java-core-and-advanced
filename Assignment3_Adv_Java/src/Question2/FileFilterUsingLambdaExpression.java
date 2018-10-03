package Question2;

import java.io.File;
import java.io.FileFilter;

public class FileFilterUsingLambdaExpression {

	public static void main(String[] args) {
		FileFilterUsingLambdaExpression fle=new FileFilterUsingLambdaExpression();
	    
		FileFilter filter=(File file)->file.getName().endsWith(".java");
		File pathname=new File("D:\\Deepak3.Sharma\\Java\\Assignment1_Adv_Java\\src\\Question5");
		File [] getFileName=pathname.listFiles(filter);
		
		for (File file2 : getFileName) {
			System.out.println(file2.getName());
		}
	}
	
}
