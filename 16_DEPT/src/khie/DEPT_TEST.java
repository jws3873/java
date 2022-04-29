package khie;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class DEPT_TEST extends JFrame{
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql;
	DefaultTableModel model = null;
	JTextField jtf1,jtf2,jtf3;
	JTable table;
	
	public DEPT_TEST() {
		setTitle("부서 테이블");
		
		JPanel container1 = new JPanel();
		JPanel container2 = new JPanel();
		
		JLabel jl1 = new JLabel("부서번호 : ");
		jtf1 = new JTextField(2);
		
		JLabel jl2 = new JLabel("부서명 : ");
		jtf2 = new JTextField(10);
		
		JLabel jl3 = new JLabel("부서위치 : ");
		jtf3 = new JTextField(10);
		
		String[] header = {"부서번호","부서명","근무지"};
		
		model = new DefaultTableModel(header, 0);
		
		table = new JTable(model);
		
		JScrollPane jsp = new JScrollPane(
				table,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JButton jb1 = new JButton("전체 목록");
		JButton jb2 = new JButton("부서 추가");
		JButton jb3 = new JButton("부서 수정");
		JButton jb4 = new JButton("부서 삭제");
		
		container1.add(jl1); container1.add(jtf1);
		container1.add(jl2); container1.add(jtf2);
		container1.add(jl3); container1.add(jtf3);
		
		container2.add(jb1); container2.add(jb2);
		container2.add(jb3); container2.add(jb4);
		
		setLayout(new BorderLayout());
		
		add(container1,BorderLayout.NORTH);
		add(jsp,BorderLayout.CENTER);
		add(container2,BorderLayout.SOUTH);
		
		setBounds(200, 200, 500, 250);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
		table.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table.getSelectedRow();
				jtf1.setText(String.valueOf(table.getValueAt(row, 0)));
				jtf2.setText(String.valueOf(table.getValueAt(row, 1)));
				jtf3.setText(String.valueOf(table.getValueAt(row, 2)));
			}
		});
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				connect();
				model.setRowCount(0);
				select();
			}
		});
		
		jb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				connect();
				insert();
				jtf1.setText(""); jtf2.setText("");
				jtf3.setText(""); model.setRowCount(0);
				jtf1.requestFocus();
				select();
				
			}
		});
		
		jb3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				connect();
				update();
				jtf1.setText(""); jtf2.setText("");
				jtf3.setText(""); model.setRowCount(0);
				jtf1.requestFocus();
				select();
			}
		});
		
		jb4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				connect();
				int result = JOptionPane.showConfirmDialog(null, "정말로 삭제하시겠습니까?", "확인",JOptionPane.YES_NO_OPTION);
				
				if(result == JOptionPane.CLOSED_OPTION) {
					JOptionPane.showMessageDialog(null, "취소하셨습니다.");
				}else if(result == JOptionPane.YES_OPTION) {
					delete();
					jtf1.setText(""); jtf2.setText("");
					jtf3.setText(""); jtf1.requestFocus();
				}
			}
		});
		
	
	}
	public static void main(String[] args) {
		new DEPT_TEST();
	}
	
	void connect() {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		String user = "web";
		
		String password = "1234";
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void select() {
		
		
		try {
			sql = "select *from dept order by deptno";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				Object[] data = {deptno,dname,loc};
				model.addRow(data);
			}
			rs.close(); pstmt.close(); con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void insert() {
		
		
		try {
			sql = "insert into dept values(?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(jtf1.getText()));
			pstmt.setString(2, jtf2.getText());
			pstmt.setString(3, jtf3.getText());
			
			int res = pstmt.executeUpdate();
			if(res>0) {
				JOptionPane.showMessageDialog(null, "부서추가 성공");
			}else {
				JOptionPane.showMessageDialog(null, "부서추가 실패");
			}
			pstmt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	void update() {
		try {
			sql = "update dept set dname = ?,loc = ? where deptno = ?";
			pstmt = con.prepareCall(sql);
			pstmt.setString(1, jtf2.getText());
			pstmt.setString(2, jtf3.getText());
			pstmt.setInt(3, Integer.parseInt(jtf1.getText()));
			
			int res = pstmt.executeUpdate();
			
			if(res>0) {
				JOptionPane.showMessageDialog(null, "부서수정 성공");
			}else {
				JOptionPane.showMessageDialog(null, "부서수정 실패");
			}
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void delete() {
		
		
		try {
			sql = "delete from dept where deptno = ?";
			pstmt = con.prepareStatement(sql);
			int row = table.getSelectedRow();
			pstmt.setInt(1, (int)table.getValueAt(row, 0));
			int res = pstmt.executeUpdate();
			
			if(res>0) {
				JOptionPane.showMessageDialog(null, "삭제 성공");
				model.removeRow(row);
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
