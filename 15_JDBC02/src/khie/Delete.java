package khie;


import java.sql.*;
import java.util.Scanner;

public class Delete {

	public static void main(String[] args) {
		Connection con = null;// DB와 연결하는 객체

		PreparedStatement pstmt = null; //SQL문을 DB에 전송하는 객체
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("삭제할 사번 입력 : ");
		int empno = sc.nextInt();
		
		try {
			con = DBConnection.getConnection();
			
			String sql = "delete from emp where empno = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, empno);
			
			int result = pstmt.executeUpdate();
			
			if(result >0 ) System.out.println("사원정보 삭제 성공");
			else System.out.println("사원정보 삭제 실패");
			
			pstmt.close(); con.close(); sc.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
