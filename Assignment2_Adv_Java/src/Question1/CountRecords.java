package Question1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import ConnectionPackage.ConnectionProvider;

public class CountRecords {

public static void main(String[] args) {
		int count=0;
		try{
		Connection con=ConnectionProvider.getCon();
		Statement stmt=con.createStatement();
		ResultSet res=stmt.executeQuery("SELECT * FROM EMP");
		
		while(res.next())
		{
			count++;
		}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("There are "+(count)+" records in Emp Table");
	}
}
