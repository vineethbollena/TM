package myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {

	public static void main(String[] args) {
		Connection conn=null;
		try {
			
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","0369");
				if(conn!=null) {
					System.out.println("Connected");
					java.sql.Statement stmt = conn.createStatement();
					ResultSet rs =stmt.executeQuery("SELECT * FROM contractor");
					System.out.println("ID\t\t\tName\t\\tage");
					while(rs.next()) {
						System.out.println(" "+rs.getInt(1));
						System.out.println("\t\t\t"+rs.getString(2));
						System.out.println("\t\t\t"+rs.getString(3));
						}
			}

				else {
			System.out.println("Notconnected");
				}
		} catch (ClassNotFoundException e) {
			System.out.println("Driver class is not found! Exception occured!!");
		}catch (SQLException se) {
			System.out.println("Exception occured while creating a connection!!");
			System.out.println(se);
		}finally {
			try {
		        conn.close();
			}
		        catch (SQLException sqlE) {
		        	System.out.println("Exception occured while closing the connection!!");
		        }
     }

}}
