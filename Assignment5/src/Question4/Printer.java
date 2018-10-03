package Question4;

public class Printer {

	public static void main(String[] args) {
		Printer p=new Printer();
	    p.enterData();
	}
	
    public void enterData()
    {
    	Counter c=new Counter();
    	Thread t=new Thread(c);
    	t.start();
    	
    }
    
    public void readData()
    {
    	Storage s=new Storage();
    	Thread t=new Thread(s);
    }
}
