package Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	private static Connection con = null;
	
	private DBConnection() {
		// TODO Auto-generated constructor stub
	}

		public static Connection getConnection() throws Exception {
			
			if(con == null) {
			String driver = "oracle.jdbc.driver.OracleDriver";
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			
			String user = "web";
			
			String password = "1234";
			
			Class.forName(driver);
			
			con = DriverManager.getConnection(url, user, password);
			return con;
			}
			else {
			return con;
			}
		}
	

}
