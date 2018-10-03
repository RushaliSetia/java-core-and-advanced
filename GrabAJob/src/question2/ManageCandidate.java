package question2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.util.TreeSet;

public class ManageCandidate {
	PreparedStatement ps;
	ResultSet rs;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ManageCandidate object = new ManageCandidate();
		Connection con=ConnectionProvider.getCon();
		while (true) {
			System.out.println("options");
			System.out.println("1.search candidate on the entered primary skill");
			System.out.println(
					"2.search candidate on the primary skill and the difference between the current salary and the expected salary");
			System.out.println("3.exit");
			System.out.println("enter your choice");
			int ch = Integer.parseInt(sc.nextLine());
			switch (ch) {
			case 1:
				object.searchOnSkill(con);
				break;
			case 2:
				object.searchOnSkillAndCondition(con);
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("invalid choice!!!!!");
			}// end of switch
		} // end of while
	}// end of main

	public void searchOnSkill(Connection con) {
		TreeSet<JobApplication> jobs = new TreeSet<JobApplication>();
		String skill;
		System.out.println("enter the primary skill of the candidate:");
		skill = sc.nextLine();
		String query = "select * from job_application where username in(select username from skills where skill ='"
				+ skill + "')";
		try {
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			if (rs == null) {
				System.out.println("there are no records present");
			}
			while (rs.next()) {
				String name = rs.getString(1);
				int yearsOfExperience = rs.getInt(2);
				int currentSalary = rs.getInt(3);
				int expectedSalary = rs.getInt(4);
				jobs.add(new JobApplication(name, yearsOfExperience, currentSalary, expectedSalary));
			} // end of while
			while (true) {
				System.out.println("1.sorting on years of experience\n2.sorting based on current salary\n3.exit");
				System.out.println("enter choice:");
				int choice = Integer.parseInt(sc.nextLine());
				switch (choice) {
				case 1:
					for (JobApplication jobApplication : jobs) {
						System.out.println(jobs);
					}
					break;
				case 2:
					TreeSet<JobApplication> job1 = new TreeSet<JobApplication>();
					job1.addAll(jobs);
					System.out.println(job1);
					break;
				case 3:
					System.exit(0);
					break;
				default:
					System.out.println("wrong choice");
				}// end of switch
			} // end while
		} // end of try
		catch (Exception e) {
			e.printStackTrace();
		} // end catch
	}//end method
	
	public void searchOnSkillAndCondition(Connection con)
	{
		String skill;
		System.out.println("enter the primary skill of the candidate:");
		skill=sc.nextLine();
		String query="select * from job_application where abs((expectedSalary-currentSalary)) >"
		+ "(((30*expectedsalary)/100))"+"and username in (select username from skills where skill='"+skill+"')";
		try {
			ps=con.prepareStatement(query);
			rs=ps.executeQuery();
			if(rs==null)
				System.out.println("found no records");
			while(rs.next())
			{
				System.out.println("name is:"+rs.getString(1));
				System.out.println("years of experience:"+rs.getInt(2));
				System.out.println("current salary:"+rs.getInt(3));
				System.out.println("expected salary:"+rs.getInt(4));
			}//end of while
		}//end of try
		catch(Exception e)
		{
			e.printStackTrace();
		}//end catch
	}//end method
}// end of class
