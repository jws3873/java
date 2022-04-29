package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {
		
		Connection con = null;
		
		PreparedStatement pstmt = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		String user = "web";
		
		String password = "1234";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("메모 제목 : ");
		String title = sc.nextLine();
		
		System.out.print("메모 작성자 : ");
		String writer = sc.nextLine();
		
		System.out.print("메모 내용 : ");
		String content = sc.nextLine();
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "insert into memo values(memo_seq.nextval,?,?,?,sysdate)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, title);
			pstmt.setString(2, writer);
			pstmt.setString(3, content);
			
			int result = pstmt.executeUpdate();
			if(result ==1) System.out.println("성공");
			else System.out.println("실패");
			
			pstmt.close(); con.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
