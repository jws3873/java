package khie;

import java.sql.*;
import java.util.Scanner;


public class insert {

	public static void main(String[] args) {
		Connection con = null;// DB와 연결하는 객체
		
		PreparedStatement pstmt = null; //SQL문을 DB에 전송하는 객체
		
//		ResultSet rs = null; // SQL문을 실행한 후의 결과값을 가지고 있는 객체, insert,update,delete등은 사용하지 않는다.
		
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
			// 1단계 : 오라클 드라이버 로딩
			Class.forName(driver);
			
			// 2단계 : 오라클 데이터베이스와 연결 진행 시도.
			con = DriverManager.getConnection(url, user, password);
			
			// 3단계 : 데이터베이스에 SQL문을 전송하기 위한 쿼리문 작성.
			String sql = "insert into memo values(memo_seq.nextval,?,?,?,sysdate)";//?는 키보드로 입력받아서 변수에 저장한다. place holder
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, title); //물음표에 들어가는 타입을 지정가능 pstmt.setInt(parameterIndex, x);도 있다. 들어가는 자료형에 따라 변경해야 한다.!
			pstmt.setString(2, writer);
			pstmt.setString(3, content);
			
			// 4단계 : 데이터베이스에 SQL문을 전송
			/*
			 * - SQL 문이 select SQL문인 경우 executeQuery() 메서드를 이용하면 됨.
			 * ==> 반환형이 ResultSet 형
			 * - SQL 문이 select가 아닌 insert,update,delete SQL문인 경우
			 * ==> executeUpdate() 메서드를 이용하면 됨.	==> 반환형은 int 형으로 반환이 된다.
			 * ==> 반환형이 int인 이유 : 행 삽입, 행 수정, 행 삭제 갯수를 표현한 것.
			 * ==> SQL문이 성공적으로 실행이 되면 반환되는 값은 1이라는 값이 반환이 됨.
			 */
			int result = pstmt.executeUpdate(); // 반환타입이 int
			
			if(result >0){
				System.out.println("데이터 추가 성공!!!");
			}else {
				System.out.println("데이터 추가 실패~~~");
			}
			
			// 5 단계 : 연결되어 있던 객체들은 종료해 주는 것이 좋다.
			pstmt.close(); con.close(); sc.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
