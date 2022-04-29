package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Delete {

	public static void main(String[] args) {
		
		Connection con = null;
		
		PreparedStatement pstmt = null;

		String driver = "oracle.jdbc.driver.OracleDriver";
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		String user = "web";
		
		String password = "1234";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 메모번호 : ");
		int bunho = sc.nextInt(); 
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			String sql = "delete from memo where bunho  = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bunho);
			
			int result = pstmt.executeUpdate();
			
			if(result == 1) System.out.println("삭제 성공");
			else System.out.println("삭제 실패");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
