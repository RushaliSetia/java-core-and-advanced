package Question3;

public class MainApp {

	public static void main(String[] args) {
		
		MyInterface inface=new MyInterface() {
			
			@Override
			public void myTest() {
				System.out.println("Annonymous class of MyInterface Interface");
			}
		};
		
		inface.myTest();
		
		MyInterface interface1=()->System.out.println("Lambda Expression of MyInterface Interface");
		interface1.myTest();
	}
}
