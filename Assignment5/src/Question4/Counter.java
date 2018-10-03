package Question4;

public class Counter implements Runnable 
{

	@Override
	public void run() {
		
		for(int i=0;i<10;i++)
		{
			new Storage(i);
		}
		
	}
  
}
