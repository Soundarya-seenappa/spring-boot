package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo {

	public static void main(String[] args) throws Exception {
		int id =93;
		String name ="nithya";
		String password = "684";
		
		Class.forName("com.mysql.cj.jdbc.Driver");

     Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/boot_cam_db","root","preethi8147");
	
		 String sql = "INSERT INTO emp VALUES(?,?,?)";
		 PreparedStatement ps = connection.prepareStatement(sql);
		  
		  
		  ps.setInt(1,id);
		  ps.setString(2,name);
		  ps.setString(3,password);
		  
		  ps.executeUpdate();
		  ps.close();
		  connection.close();
		  System.out.println("record inserted");
	}

}
