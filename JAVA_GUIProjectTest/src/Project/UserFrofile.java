package Project;

import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class UserFrofile extends JFrame{
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql;
	public UserFrofile() {
		setTitle("유저정보");
		
		setBounds(200, 200, 300, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	
	}
	

	public static void main(String[] args) {
	new UserFrofile();
		
		
	}
	void connect() {
		try {
			con = DBConnection.getConnect();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
