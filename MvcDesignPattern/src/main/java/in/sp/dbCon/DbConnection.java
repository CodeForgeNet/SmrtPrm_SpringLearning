package in.sp.dbCon;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	public Connection getConnection() {
		
		Connection con=null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc_db","root","karan123");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
}
