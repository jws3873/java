package khie;

import java.sql.*;


public class Select {
	//싱글턴 방식으로 해보기,싱글턴 방식으로 해보기,싱글턴 방식으로 해보기,싱글턴 방식으로 해보기
	public static void main(String[] args) {

		Connection con = null;// DB와 연결하는 객체

		PreparedStatement pstmt = null; //SQL문을 DB에 전송하는 객체

		ResultSet rs = null; // SQL문을 실행한 후의 결과값을 가지고 있는 객체

		try {
			// 1단계 + 2단계 : 오라클 드라이버 로딩 및 오라클 데이터 베이스 연결 시도
			con = DBConnection.getConnection();

			// 3단계 : 데이터 베이스에 전공할 sql문 작성

			String sql = "select *from emp order by empno desc";

			pstmt = con.prepareStatement(sql);

			//4단계 : 데이터베이스에 SQL문 전공 및 SQL문 실행
			rs = pstmt.executeQuery();

			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				String hiredate = rs.getString("hiredate").substring(0, 10);
				int sal = rs.getInt("sal");//원래는 컬럼상에 소수점으로 받아와야함!!!
				int comm = rs.getInt("comm");//원래는 컬럼상에 소수점으로 받아와야함!!!
				int deptno = rs.getInt("deptno");

				System.out.println(empno+"\t"+ename+"\t"+job+"\t"+
						mgr+"\t"+hiredate+"\t"+sal+"\t"+comm+"\t"+deptno);
				System.out.println("-------------------------------------------------------");
			}
			// 6단계 : 오라클 데이터베이스와 연결되어 있는 객체 닫기
			rs.close(); pstmt.close(); con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
