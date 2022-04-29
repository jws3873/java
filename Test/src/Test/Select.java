package Test;

import java.sql.*;


public class Select {

	public static void main(String[] args) {
		
		Connection con = null;
		
		PreparedStatement pstmt = null;
		
		ResultSet rs = null;
		
		
		
		try {

		con = DBConnection.getConnection();
		if(con != null) System.out.println("오라클 데이터베이스와 연결 성공!");
		
		String sql ="select *from memo order by bunho desc";
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			int bunho = rs.getInt("bunho");
			String title = rs.getString("title");
			String writer = rs.getString("writer");
			String cont = rs.getString("cont");
			String date = rs.getString("regdate").substring(0, 10);
			System.out.println(bunho+"\t"+title+"\t"+writer+"\t"+cont+"\t"+date);
		}
		rs.close(); pstmt.close(); con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
