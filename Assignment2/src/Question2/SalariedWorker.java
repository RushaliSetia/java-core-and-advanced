package Question2;

public class SalariedWorker extends Worker
{
	int overTime;
	
	public SalariedWorker() {
		// TODO Auto-generated constructor stub
	}
	
	public SalariedWorker(String name,int salary,int hours) {
		this.salaryRate=salary;
		this.name=name;
		
		if(hours>40)
		{
			overTime=hours-40;
			System.out.println("The total weekly salary of the Salaried worker is "+computePay(hours,overTime));
		}
		else
		{
			System.out.println("The total weekly salary of the Salaried worker is "+computePay(hours));
		}
	}
	@Override
	public int computePay(int hours) 
	{
	   return (hours*salaryRate);
	}
	
	public double computePay(int hours,int overTime)
	{
		return ((hours*salaryRate)+(overTime*salaryRate));
	}

}
