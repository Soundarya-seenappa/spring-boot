package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdatetDemo {

	public static void main(String[] args) throws Exception {
		int id =91;
		String name ="nithya";
		String password = "786";
		
		//Class.forName("com.mysql.cj.jdbc.Driver");

		 
     //Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/boot_cam_db","root","preethi8147");
		Connection connection= DBConnection.getConnection();
		 String sql = "UPDATE emp SET name=?,password=? WHERE ID=?";
		 PreparedStatement ps = connection.prepareStatement(sql);
		  
		  
		  ps.setInt(3,id);
		  ps.setString(1,name);
		  ps.setString(2,password);
		  
		  ps.executeUpdate();
		  ps.close();
		  connection.close();
		  System.out.println("record UPDATED");
	}

}
