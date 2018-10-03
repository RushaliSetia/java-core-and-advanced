package Question2;

public class HourlyWorker extends Worker
{
	int overTime;
	
	public HourlyWorker() {
		// TODO Auto-generated constructor stub
	}
	
	public HourlyWorker(String name,int salary,int hours) {
		this.salaryRate=salary;
		this.name=name;
		
		if(hours>40)
		{
			overTime=hours-40;
			System.out.println("The total weekly salary of the Hourly worker is "+computePay(hours,overTime));
		}
		else
		{
			System.out.println("The total weekly salary of the Hourly worker is "+computePay(hours));
		}
	}
	@Override
	public int computePay(int hours) 
	{
	   return (hours*salaryRate);
	}
	
	public double computePay(int hours,int overTime)
	{
		return ((hours*salaryRate)+(overTime*salaryRate*1.5));
	}

}
