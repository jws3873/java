package Project;
import java.sql.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class FriendsDAO {
	Connection con = null;
	PreparedStatement pstmt= null;
	ResultSet rs = null;
	String sql;
	static final String  driver = "oracle.jdbc.driver.OracleDriver";
	static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	static final String user = "web";
	static final String password = "1234";
	static FriendsDAO friendsDAO =null;
	
	private FriendsDAO() {}
	
	public static FriendsDAO getInstance() {
		if(friendsDAO==null) {
			return new FriendsDAO();
		}else {
			return friendsDAO;
		}
	}
	
	public void connect() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			System.out.println("연결 실패");
		}
	}
	
	public ArrayList select() {
		connect();
		ArrayList<FriendsVO> list = new ArrayList<FriendsVO>();
		try {
			sql = "select *from kkakkao_friends order by F_id";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String F_id = rs.getString("F_id");
				String F_name = rs.getString("F_name");
				String F_gender = rs.getString("F_gender");
				String F_phone = rs.getString("F_phone");
				String F_email = rs.getString("F_email");
				String F_edate = rs.getString("F_edate");
				String F_photo = rs.getString("F_photo");
				FriendsVO vo = new FriendsVO(F_id, F_name, F_gender, F_phone, F_email, F_edate, F_photo);
				list.add(vo);
			}
			rs.close(); pstmt.close(); con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public void insert(String F_id,String F_name,String F_gender,String F_phone,String F_email,
			String F_photo) {
		connect();
		try {
			sql = "insert into kkakkao_friends values(?,?,?,?,?,sysdate,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, F_id);
			pstmt.setString(2, F_name);
			pstmt.setString(3, F_gender);
			pstmt.setString(4, F_phone);
			pstmt.setString(5, F_email);
			pstmt.setString(6, F_photo);
			int res = pstmt.executeUpdate();
			if(res>0) {
				JOptionPane.showMessageDialog(null, "친구등록 완료");
			}else {
				JOptionPane.showMessageDialog(null, "친구등록 실패");
			}
			pstmt.close(); con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void update(String F_id,String F_name,String F_gender,String F_phone,String F_email,
			String F_photo) {
		connect();
		try {
			sql = "update kkakkao_friends set F_id=?,F_name=?,F_gender=?,F_phone=?,F_email=?,F_photo=? where F_id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, F_id);
			pstmt.setString(2, F_name);
			pstmt.setString(3, F_gender);
			pstmt.setString(4, F_phone);
			pstmt.setString(5, F_email);
			pstmt.setString(6, F_photo);
			pstmt.setString(7, F_id);
			int res = pstmt.executeUpdate();
			if(res>0) {
				JOptionPane.showMessageDialog(null, "수정 완료");
			}else {
				JOptionPane.showMessageDialog(null, "수정 실패");
			}
			pstmt.close(); con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		public void delete(String F_id) {
			connect();
			try {
				sql = "delete from kkakkao_friends where F_id = ?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, F_id);
				int res = pstmt.executeUpdate();
				if(res>0) {
					JOptionPane.showMessageDialog(null, "삭제 성공");
				}else {
					JOptionPane.showMessageDialog(null, "삭제 실패");
				}
				pstmt.close(); con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		


	
}
