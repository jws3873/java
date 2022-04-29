package khie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Select {

	public static void main(String[] args) {
		Connection con = null;// DB와 연결하는 객체
		
		PreparedStatement pstmt = null; //SQL문을 DB에 전송하는 객체
		
		ResultSet rs = null; // SQL문을 실행한 후의 결과값을 가지고 있는 객체
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		String user = "web";
		
		String password = "1234";
		
		try {
			// 1단계 : 오라클 드라이버를 로딩. 드라이버를 찾지 못할 수 있는 예외가 발생할 수 있다.
			// ==> 동적으로 로딩 : 프로그램 실행 시에 오라클 드라이버를 로딩한다는 의미.
//			Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공!!!!");
			
			// 2단계 : 오라클 데이터베이스와 연결 시도.
			con = DriverManager.getConnection(url, user, password);
			//getConnection()커넥션 인터페이스로 반환됨
			if(con != null) {
				System.out.println("오라클 데이터베이스와 연결 성공");
			}
			
			// 3단계 : 데이터베이스에 SQL문을 전송하기 위한 쿼리문 작성.
			String sql = "select *from memo order by bunho desc";
			pstmt = con.prepareStatement(sql); //PreparedStatement인터페이스로 반환
			
			// 4단계 : 데이터 베이스에 SQL문을 전송.
			rs = pstmt.executeQuery(); // 실제로 DB에서 SQL문을 실행하는 메서드.
			//executeQuery() 반환타입이 result set
			
			// 5단계 : 데이터를 가져와서 출력
			//result set은 커서라는 개념이 있다 정보가 있으면 true를 반환한다.
			while(rs.next()) {//레코드의 갯수를 알 수 없으므로 while반복문을 사용
				//next()는 다음행의 데이터가 있으면 true를 반환한다.
				int bunho = rs.getInt("bunho");//int타입의 데이터를 가져온다. 자료형을 number로 지정한것
				String title = rs.getString("title");
				String writer = rs.getString("writer");
				String cont = rs.getString("cont");
				//날자는 문자열로 가져오자
				String date = rs.getString("regdate").substring(0,10);
				
				System.out.println(bunho+"\t"+title+"\t"+
				writer+"\t"+cont+"\t"+date);
			}
			// 6단계 : 연결되어 있던 객체들은 종료 해 주는 것이 좋다.
			rs.close(); pstmt.close(); con.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
