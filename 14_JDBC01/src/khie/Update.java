package khie;

import java.sql.*;
import java.util.Scanner;

public class Update {

	public static void main(String[] args) {
		
		Connection con = null;// DB와 연결하는 객체
		
		PreparedStatement pstmt = null; //SQL문을 DB에 전송하는 객체
		
//		ResultSet rs = null; // SQL문을 실행한 후의 결과값을 가지고 있는 객체, insert,update,delete등은 사용하지 않는다.
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		String user = "web";
		
		String password = "1234";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수정할 메모 글 번호 : ");
		String no = sc.nextLine();
		
		System.out.print("메모 수정 제목: ");
		String reTitle = sc.nextLine();
		
		System.out.print("메모 수정 내용: ");
		String reCont = sc.nextLine();
		
		try {
			// 1단계 : 오라클 드라이버 로딩
			Class.forName(driver);
			
			// 2단계 : 오라클 데이터 베이스와 연결 시도
			con = DriverManager.getConnection(url, user, password);
			
			// 3단계 : 데이터베이스에 SQL문을 전송하기 위한 SQL문 작성
			String sql = "update memo set title = ?, cont = ? where bunho = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, reTitle);
			pstmt.setString(2, reCont);
			pstmt.setInt(3, Integer.parseInt(no)); // 번호는 자료형이 넘버타입니다.
			
			// 4단계 : 데이터베이스에 SQL 문을 전송
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("메모 업데이트 성공");
			}else {
				System.out.println("메모 업데이트 실패");
			}
			// 5단계 : 데이터 베이스 연결 객체 종료
			pstmt.close(); con.close(); sc.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
