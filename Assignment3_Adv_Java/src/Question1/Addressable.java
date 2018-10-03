package Question1;

public interface Addressable {

	String getState();
	String getCity();
	
	default String getFullAddress()
	{
		return null;	
	}
}
