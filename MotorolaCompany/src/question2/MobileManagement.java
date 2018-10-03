package question2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.utility.ConnectionProvider;

public class MobileManagement {

	static Scanner sc = new Scanner(System.in);
	public static ArrayList<Mobile> mobileList = new ArrayList<Mobile>();
	static {
		int id = 0;
		String model = null;
		String brand = null;
		float price = 0;
		String date = null;
		try {
			Connection con = ConnectionProvider.getCon();
			PreparedStatement ps = con.prepareStatement("select * from mobiletable");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				id=rs.getInt(1);
				model=rs.getString(2);
				brand=rs.getString(3);
				price=rs.getFloat(4);
				date=rs.getString(5);
			} // end of while
			Mobile mobileObject = new Mobile(id,model,brand,price,date);
			mobileList.add(mobileObject);
		} // end of try
		catch (Exception e) {
			e.printStackTrace();
		} // end of catch
	}// end of static block

	public static void main(String[] args) throws IOException, SQLException {
		MobileManagement mobileManagementObject = new MobileManagement();
		while (true) {
			System.out.println("****menu****");
			System.out.println("press 1 to display all the mobiles");
			System.out.println("press 2 to enter the mobileId to purchase");
			System.out.println("press 3 to exit");
			System.out.println("enter choice:");
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1:
				mobileManagementObject.displayAllMobiles();
				break;
			case 2:
				mobileManagementObject.mobileIdToPurchase(mobileList);
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("wrong choice;please enter again!!!!");

			}//end of switch
		}//end of while
	}//end of main
	
	public void displayAllMobiles()
	{
		try {
			Connection con = ConnectionProvider.getCon();
			PreparedStatement ps = con.prepareStatement("select * from mobiletable");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("mobile id :" + rs.getInt(1));
				System.out.println("model:" + rs.getString(2));
				System.out.println("brand:" + rs.getString(3));
				System.out.println("price:" + rs.getDouble(4));
				System.out.println("manufacturing date:" + rs.getString(5));
			} // end of while
		}
		catch (Exception e) {
			e.printStackTrace();
		} // end of catch
		
	}
	
	public void mobileIdToPurchase(List list) throws IOException, SQLException
	{
		System.out.println("enter the mobileId:");
		int mobileId=Integer.parseInt(sc.nextLine());
		int size = list.size();
//        for(int i=0;i<size;i++)
//        {
//            System.out.println(list.get(i));
//        }//end of for
		Connection con = ConnectionProvider.getCon();
		PreparedStatement ps = con.prepareStatement("select * from mobiletable");
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			System.out.println("------------->1");
			File file=new File("bill.txt");
			FileWriter fw=new FileWriter(file);
			fw.write("mobile id:"+rs.getInt(1));
			fw.write("model:" + rs.getString(2));
			fw.write("brand:" + rs.getString(3));
			fw.write("price:" + rs.getDouble(4));
			fw.write("manufacturing date:" + rs.getString(5));
			System.out.println("------------->2");
			fw.close();
			System.out.println("file created.....");
		}//end of while
		
	}//end of mobileIdPurchase
	
	
}// end of class
