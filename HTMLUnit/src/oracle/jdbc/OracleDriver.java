package oracle.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleDriver {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) throws  ClassNotFoundException, SQLException{
			// TODO Auto-generated method stub
			String dbUrl = "jdbc:mysql://localhost:3036/emp";
			
			//Database Username		
			String username = "root";	
	        
			//Database Password		
			String password = "password";				

			//Query to Execute		
			String query = "select *  from employee;";
			
			//Load mysql jdbc driver		
	   	    Class.forName("com.oracle.jdbc.Driver");			
	   
	   		//Create Connection to DB		
	    	Connection con = DriverManager.getConnection(dbUrl,username,password);
	    	
	    	Statement stmt = con.createStatement();	
	    	ResultSet rs= stmt.executeQuery(query);
	    	
	    	// While Loop to iterate through all data and print results		
			while (rs.next()){
		        		String myName = rs.getString(1);								        
	                    String myAge = rs.getString(2);					                               
	                    System. out.println(myName+"  "+myAge);		
	            }		
				 // closing DB Connection		
				con.close();	


	}

}
