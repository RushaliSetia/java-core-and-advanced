package Question1;

public class Employee implements Addressable{

	String city;
	String state;
	
	
	public Employee(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}

	@Override
	public String getState() {
		return state;
	}
	
	@Override
	public String getCity() {
		return city;
	}
	
	public String getFullAddress()
	{
		return "I live in "+getCity()+" city and "+getState()+" state";	
	}
	
}
