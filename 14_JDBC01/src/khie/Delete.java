package khie;

import java.sql.*;
import java.util.Scanner;


public class Delete {

	public static void main(String[] args) {
		
		Connection con = null;// DB와 연결하는 객체
		
		PreparedStatement pstmt = null; //SQL문을 DB에 전송하는 객체
		
//		ResultSet rs = null; // SQL문을 실행한 후의 결과값을 가지고 있는 객체, insert,update,delete등은 사용하지 않는다.
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		String user = "web";
		
		String password = "1234";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("삭제할 메모 번호 : ");
		int no = sc.nextInt();
		
		try {
			// 1단계 : 오라클 드라이버 로딩
			Class.forName(driver);
			
			// 2단계 : 오라클 데이터베이스와 연결 시도.
			con = DriverManager.getConnection(url, user, password);
			
			// 3단계 : 데이터베이스에 전공하기 위한 SQL문 작성
			String sql = "delete from memo where bunho = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			// 4단계 : 오라클 데이터베이스에  SQL문을 전공 및 실행
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("메모 데이터 삭제 성공");
			}else {
				System.out.println("메모 데이터 삭제 실패");
			}
			pstmt.close(); con.close(); sc.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
