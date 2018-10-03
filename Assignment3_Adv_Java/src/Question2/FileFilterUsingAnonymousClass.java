package Question2;

import java.io.File;
import java.io.FileFilter;

public class FileFilterUsingAnonymousClass{
   
	public static void main(String[] args) {
		FileFilter filter=new FileFilter() {
			
			@Override
			public boolean accept(File file) {
				
				return file.getName().endsWith(".java");
			}
		};
		
		File pathname=new File("D:\\Deepak3.Sharma\\Java\\Assignment1_Adv_Java\\src\\Question5");
		File[] getFileNames=pathname.listFiles(filter);
		
		for (File file : getFileNames) {
			System.out.println(file.getName());
		}
	}
}
