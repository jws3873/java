package khie;

import java.sql.*;


public class DBConnection {
	private static Connection con = null; //DB와 연결하는 객체.
	
	public static Connection getConnection() throws Exception {
		if(con == null) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		String user = "web";
		
		String password = "1234";
		// 1단계 : 오라클 드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// 2단계 : 오라클 데이터베이스와 연결 시도
		con = DriverManager.getConnection(url, user, password);
		
		return con;
		}
		else return con;
	}
	

}
