package Question7;

public class ClientCode {
    
	  public static void main(String[] args) {
		ClientCode c=new ClientCode();
		c.enterData();
	}
	  
	  public void enterData()
	  {
		  try{
		  System.out.println(new WordCount().countData());
		  }
		  catch(Exception e)
		  {
			  
		  }
	  }
}
