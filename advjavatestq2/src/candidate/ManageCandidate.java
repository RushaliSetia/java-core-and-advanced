package candidate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.TreeSet;

import com.jdbcconnector.Connector;

public class ManageCandidate {
	static Scanner sc = new Scanner(System.in);
	PreparedStatement ps;
	ResultSet rs;

	public static void main(String[] args) {

		ManageCandidate obj = new ManageCandidate();
		Connection con = Connector.getCon();

		while (true) {
			System.out.println("Select option \n1.Search candidate on primary skills\n"
					+ "2.Search candidate on primary skills and difference between exp vs curr salary in more then 30%\n"
					+ "3.Exit");
			System.out.println("Enter your choice : ");
			int ch = Integer.parseInt(sc.nextLine());

			switch (ch) {

			case 1:
				obj.searchBySkills(con);
				break;
			case 2:
				obj.serchBySkillsAndCondition(con);
				break;
			case 3:
				System.exit(0);
			default:
				System.out.println("Wrong Choice ");

			}

		}

	}

	private void serchBySkillsAndCondition(Connection con) {
		System.out.println("Enter the Skills ");
		String skill = sc.nextLine();
		String query = "select * from job_application where abs((expectedSalary-currentSalary))>(((30*expectedsalary)/100)) "
				+ "and username in(select username from skills where skill='" + skill + "')";

		try {
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			//System.out.println(rs);
			if (rs == null) {

				System.out.println("No record found ");

			}
			while (rs.next()) {

				System.out.println("\n User name : " + rs.getString(1));
				System.out.println("\n Year of Exp : " + rs.getInt(2));
				System.out.println("\n Current salary : " + rs.getInt(3));
				System.out.println("\n Expected salary : " + rs.getInt(4));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void searchBySkills(Connection con) {

		String name;
		int exp, cursal, expsal;
		TreeSet<JobApplication> jobs = new TreeSet<JobApplication>();
		System.out.println("Enter the skills : ");
		String skill = sc.nextLine();
		String query = "select * from job_application where username in (select username from skills where skill='"
				+ skill + "')";

		try {
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			if (rs == null) {

				System.out.println("No record found ");

			}
			while (rs.next()) {
				name = rs.getString(1);
				exp = rs.getInt(2);
				cursal = rs.getInt(3);
				expsal = rs.getInt(4);
				jobs.add(new JobApplication(name, exp, cursal, expsal));

			}
			while (true) {
				System.out
						.println("Select option sort on 1.Years of Experience \t 2.Sort on current salary \t 3.Exit ");
				int choice = Integer.parseInt(sc.nextLine());
				switch (choice) {
				case 1:
					for (JobApplication jobApplication : jobs) {
						System.out.println(jobApplication);
					}

					break;
					
				case 2: 
					TreeSet<JobApplication> job1=new TreeSet<JobApplication>(new SortOnCurSalary());
					job1.addAll(jobs);
					
					//use if add instead of addAll
			/*		for (JobApplication jobApplication : job1) {
						System.out.println(job1);
					}  */
					
					//use for addAll
					System.out.println(job1);
					break;
				case 3:System.exit(0);
					break;

				default:System.out.println("wrong choice");
					break;
				}

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
