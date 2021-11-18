package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDemo {

	public static void main(String[] args) throws Exception {
		int id =99;
		
		
		//Class.forName("com.mysql.cj.jdbc.Driver");

		 
     //Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/boot_cam_db","root","preethi8147");
		Connection connection= DBConnection.getConnection();
		 String sql = "DELETE FROM emp WHERE ID=?";
		 PreparedStatement ps = connection.prepareStatement(sql);
		  
		  
		  ps.setInt(1,id);
		  		  
		  ps.executeUpdate();
		  ps.close();
		  connection.close();
		  System.out.println("deleted record");
	}

}
