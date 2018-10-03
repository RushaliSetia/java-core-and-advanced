package Question3;

public class Employee 
{
    String name;
    char gender;
    double yearsOfExp;
    String designation;
    double basicSalary;
    String status;
    
    public Employee(String name,char gender) 
    {
		this.name=name;
		this.gender=gender;
	}
    
    public double getYearsOfExp() {
		return yearsOfExp;
	}

	public void setYearsOfExp(double yearsOfExp) {
		this.yearsOfExp = yearsOfExp;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double promteEmp(String designation)
    {
		this.designation=designation;
		
		if(designation.equalsIgnoreCase("ITA")){
		     this.basicSalary=this.basicSalary+this.basicSalary*0.05;
		     return this.basicSalary;
		}
		else if(designation.equalsIgnoreCase("AST")){
			 this.basicSalary=this.basicSalary+this.basicSalary*0.08;
			 return this.basicSalary;
		}
		else if(designation.equalsIgnoreCase("ASC")){
			 this.basicSalary=this.basicSalary+this.basicSalary*0.10;
			 return this.basicSalary;
		}
		
		return 0.0;
    }//end prompteEmp
    
    public void applyForLWP()
    {
    	if(this.status.equalsIgnoreCase("ACTIVE"))
    	{
    	    this.status="INACTIVE";
    	    this.basicSalary=0.0;
    	}
    }//end applyForLWP

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}
}//end class
