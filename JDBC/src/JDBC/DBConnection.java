package JDBC;


import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
 Connection connection  = null;

	public static Connection getConnection() {
		
		 Connection connection  = null;
 try {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 
	connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/boot_cam_db","root","preethi8147");
		
 }catch(Exception e) {
	 e.printStackTrace();
 }
 
return connection;
}
}
