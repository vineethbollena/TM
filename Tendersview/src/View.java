
import java.sql.*;
public class View {
	
	public static void main(String[] args)  {
		Connection conn=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","TENDERMANAGEMENT","1234");
			
			Statement st = conn.createStatement();
			st.executeUpdate("CREATE VIEW [female_contractors] AS SELECT username ,gender FROM CONTRACTORS WHERE gender = 'female'");

			conn.close();
		}
		catch (Exception e)
		{
			System.err.println("Got an exception! ");
		}

	}
	
	 }



