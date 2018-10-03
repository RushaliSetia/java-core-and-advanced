package ConnectionPackage;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

	static Connection con;
	
	public static Connection getCon()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return con;
	}
}
