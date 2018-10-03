package Question1;

public class ClientCode 
{  /**
     ceo is object of ChiefExecutiveOfficerClass
     manager is the object of Manager class
    */
	
	ChiefExecutiveOfficer ceo=new ChiefExecutiveOfficer();
	Manager manager=new Manager();   

	public static void main(String[] args) {
		ClientCode c=new ClientCode();
		c.display();
		
	}
    
    public void display()
    {
    	System.out.println(ceo.getRoleName()+" "+ceo.getResponsibility()+" of the company");
    	System.out.println(manager.getRoleName()+" "+manager.getResponsibility());
    }

}
