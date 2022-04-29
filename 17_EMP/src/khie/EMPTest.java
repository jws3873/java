package khie;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


//03-02 : 마우스 리스너 시작할것 
public class EMPTest extends JFrame{
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql;
	DefaultTableModel model;
	JComboBox<String> jcb1,jcb2,jcb3;
	
	public EMPTest() {
		setTitle("사원 관리 화면");
		
		JPanel container1 = new JPanel();
		JPanel container2 = new JPanel();
		JPanel container3 = new JPanel();
		
		JLabel jlb1 = new JLabel("사 번 : ");
		JTextField jtf1 = new JTextField(4);
		
		JLabel jlb2 = new JLabel("이 름 : ");
		JTextField jtf2 = new JTextField(10);
		
		JLabel jlb3 = new JLabel("담당업무 : ");
		jcb1 = new JComboBox<String>();
		
		JLabel jlb4 = new JLabel("관리자 No : ");
		jcb2 = new JComboBox<String>();
		
		JLabel jlb5 = new JLabel("급 여 : ");
		JTextField jtf3 = new JTextField(5);
		
		JLabel jlb6 = new JLabel("보너스 : ");
		JTextField jtf4 = new JTextField(5);
		
		JLabel jlb7 = new JLabel("부서번호 : ");
		jcb3 = new JComboBox<String>();
		
		jcb1.addItem("선택"); jcb2.addItem("선택"); jcb3.addItem("선택");
		
		Object[] header = {"사번","이름","담당업무","관리자No","입사일","급여","보너스","부서번호"};
		
		model = new DefaultTableModel(header, 0);
		
		JTable table = new JTable(model);
		
		JScrollPane jsp = new JScrollPane(
				table,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JButton jb1 = new JButton("사원 목록");
		JButton jb2 = new JButton("사원 등록");
		JButton jb3 = new JButton("사원 수정");
		JButton jb4 = new JButton("사원 삭제");
		
		container1.add(jlb1); container1.add(jtf1);
		container1.add(jlb2); container1.add(jtf2);
		container1.add(jlb3); container1.add(jcb1);
		
		container2.add(jlb4); container2.add(jcb2);
		container2.add(jlb5); container2.add(jtf3);
		container2.add(jlb6); container2.add(jtf4);
		container2.add(jlb7); container2.add(jcb3);
		
		container3.add(jb1); container3.add(jb2);
		container3.add(jb3); container3.add(jb4);
		
		JPanel group = new JPanel(new BorderLayout());
		group.add(container2,BorderLayout.NORTH);
		group.add(jsp,BorderLayout.CENTER);
		group.add(container3,BorderLayout.SOUTH);
		
		add(container1,BorderLayout.NORTH);
		add(group,BorderLayout.CENTER);
		
		
		setBounds(1300, 500, 650, 350);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
		connect();
		combojob();
		comboMgr();
		comboDept();
		
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
				
				int row  = table.getSelectedRow();
				jtf1.setText(table.getValueAt(row, 0).toString());
				jtf2.setText(table.getValueAt(row, 1).toString());
				jcb1.setSelectedItem(table.getValueAt(row, 2).toString());
				int empno = (int)table.getValueAt(row, 3);
				
				if(empno==0) {
					jcb2.setSelectedIndex(0);
				}else {
					connect();
					String findEname = findEname(empno);
					jcb2.setSelectedItem(empno+"["+findEname+"]");
				}
				
				jtf3.setText(table.getValueAt(row, 5).toString());
				jtf4.setText(table.getValueAt(row, 6).toString());
				int deptno = (int)table.getValueAt(row, 7);
				String findDname = findDname(deptno);
				jcb3.setSelectedItem(deptno+"["+findDname+"]");
				
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
			e.printStackTrace();
		}
	}
	
	void combojob() {
		
		try {
			sql = "select distinct job from emp order by job";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String job = rs.getString("job");
				jcb1.addItem(job);
			}
			rs.close(); pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void comboMgr() {
		try {
			sql = "select empno,ename from emp where empno in(select distinct(mgr) from emp)";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				jcb2.addItem(empno+"["+ename+"]");
			}
			rs.close(); pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void comboDept() {
		
		try {
			sql = "select deptno,dname from dept order by deptno";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				jcb3.addItem(deptno+"["+dname+"]");
			}
			rs.close(); pstmt.close(); 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	String findEname(int num) {
		
		String findName = "";
		try {
			sql = "select ename from emp where empno= ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
			findName = rs.getString("ename");
			}
			rs.close(); pstmt.close(); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return findName;
		
	}
	
	String findDname(int deptno) {
			String Dname = "";
		try {
			sql = "select dname from dept where deptno = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Dname = rs.getString("dname");
			}
			rs.close(); pstmt.close(); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Dname;
	}
	

	void select() {
		try {
			sql = "select *from emp order by hiredate desc";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				String hiredate = rs.getString("hiredate");
				int sal = rs.getInt("sal");
				int comm = rs.getInt("comm");
				int deptno = rs.getInt("deptno");
				
				Object[] data = {empno,ename,job,mgr,hiredate,sal,comm,deptno};
				model.addRow(data);
			}
			rs.close(); pstmt.close(); con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	public static void main(String[] args) {
		new EMPTest();
	}

}
