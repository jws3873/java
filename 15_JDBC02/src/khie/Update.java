package khie;

import java.sql.*;

import java.util.Scanner;

public class Update {

	public static void main(String[] args) {
		Connection con = null;// DB와 연결하는 객체

		PreparedStatement pstmt = null; //SQL문을 DB에 전송하는 객체
		
//		ResultSet rs = null; // SQL문을 실행한 후의 결과값을 가지고 있는 객체
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사번 입력 : ");
		String empno = sc.nextLine();
		
		System.out.print("수정될 담당업무 입력 : ");
		String job = sc.nextLine();
		
		System.out.print("수정될 관리자(사번) 입력 : ");
		String mgr = sc.nextLine();
		
		System.out.print("수정될 급여 입력 : ");
		String sal = sc.nextLine();
		
		System.out.print("수정될 보너스 입력 : ");
		String comm = sc.nextLine();
		
		System.out.print("수정될 부서번호 입력 : ");
		String deptno = sc.nextLine();

		try {
			con = DBConnection.getConnection();
			String sql = "update emp set job = ?,mgr = ?, sal = ?, comm = ?, deptno = ? where empno = ? ";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, job);
			pstmt.setInt(2, Integer.parseInt(mgr));
			pstmt.setInt(3, Integer.parseInt(sal));
			pstmt.setInt(4, Integer.parseInt(comm));
			pstmt.setInt(5, Integer.parseInt(deptno));
			pstmt.setInt(6, Integer.parseInt(empno));
			
			// 4단계 : 오라클 데이터베이스에 SQL문 전공 및 SQL문 실행
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("사원 데이터 수정 성공!");
			}else {
				System.out.println("사원 데이터 수정 실패!");
			}
			
			// 5단계 : 오라클 데이터베이스와 연결되어 있던 자원 종료
			pstmt.close(); con.close(); sc.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
