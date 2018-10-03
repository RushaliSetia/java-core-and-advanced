package Question1;

public class Manager implements Role
{

	@Override
	public String getRoleName() {
		return "Manager";
	}

	@Override
	public String getResponsibility() {
		return "manager's the company";
	}

}
