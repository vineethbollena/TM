
import java.sql.*;
public class update {
	
	public static void main(String[] args)  {
		Connection conn=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","TM","123");
			
			Statement st = conn.createStatement();
			st.executeUpdate("UPDATE ADMINS1 SET mailid = 'vineeth369@gmail.com' WHERE username ='Vineeth'");
			st.executeUpdate("UPDATE CONTRACTORS  SET mobileno = '9989657432'  WHERE username = 'Bhagu'");
			st.executeUpdate("UPDATE OFFICIALS SET department = 'transport'   WHERE name = 'Surya' ");
			st.executeUpdate("UPDATE OFFICIALS SET department = 'irrigation' WHERE name = 'Venkatesh'");

			conn.close();
		}
		catch (Exception e)
		{
			System.err.println("Got an exception! ");
		}

	}
	
	 }



