package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectDemo {

	public static void main(String[] args) throws Exception {
		
		
		//Class.forName("com.mysql.cj.jdbc.Driver");

		 
    // Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/boot_cam_db","root","preethi8147");
	Connection connection= DBConnection.getConnection();
		 String sql = "SELECT * FROM emp";
		 PreparedStatement ps = connection.prepareStatement(sql);
		
         
		  ResultSet rs = ps.executeQuery();
		  while(rs.next()) {
			int id =  rs.getInt("id");
			 String name =rs.getString("name");
			 String password= rs.getString("password");
			 
			 System.out.println(id +" ," + name +", "+ password);
		  }
		  		  
		 
		  ps.close();
		  connection.close();
		  System.out.println("deleted record");
	}

}
