package khie;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class EMP extends JFrame{
	Connection con =null;	//DB와 연결하는 객체
	PreparedStatement pstmt = null;	//SQL문을 데이터베이스에 전송하는 객체
	ResultSet rs = null; //SQL문 실행 결과를 가지고 있는 객체
	String sql = null;	//SQL문을 저장하는 문자열 변수
	DefaultTableModel model;
	JTable table;
	JTextField jtf1,jtf2,jtf3,jtf4;
	JComboBox<String> jcb1,jcb2,jcb3;
	
	public EMP() {
		
		setTitle("사원 관리 화면");
		
		JPanel container1 = new JPanel();	// 상단-1 컨테이너
		JPanel container2 = new JPanel();	// 상단-2 컨테이
		JPanel container3 = new JPanel();	// 하단 컨테이너
		
		//1. 컴포넌트들을 만들어 보자.
		//1-1. 상단-1 컨테이너에 들어갈 컴포넌트들을 만들어 보자.
		JLabel jl1 = new JLabel("사 번 : ");
		jtf1 = new JTextField(4);
		
		JLabel jl2 = new JLabel("이 름 : ");
		jtf2 = new JTextField(10);
		
		JLabel jl3 = new JLabel("담당업무 : ");
		jcb1 = new JComboBox<String>();
		
		// 1-2. 상단-2컨테이너에 들어갈 컴포넌트 들을 만들어 보자.
		JLabel jl4 = new JLabel("관리자 No : ");
		jcb2 = new JComboBox<String>();
		
		JLabel jl5 = new JLabel("급 여: ");
		jtf3= new JTextField(5);
		
		JLabel jl6 = new JLabel("보너스 : ");
		jtf4= new JTextField(5);
		
		JLabel jl7 = new JLabel("부서번호 : ");
		jcb3 = new JComboBox<String>();
		
		jcb1.addItem("선택"); jcb2.addItem("선택"); jcb3.addItem("선택");
		
		// 1-3. 중앙에 위치할 컴포넌트들을 만들어 보자.
		
		String[] header = 
			{"사번","이름","담당업무","관리자 No","입사일","급여","보너스","부서번호"};
		
		model = new DefaultTableModel(header, 0);
		
		table = new JTable(model);
		
		JScrollPane jsp = new JScrollPane(
				table,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		// 1-4. 하단 컨테이너에 올려질 컴포넌트들을 만들어 보자.
		JButton jb1 = new JButton("사원 목록");
		JButton jb2 = new JButton("사원 등록");
		JButton jb3 = new JButton("사원 수정");
		JButton jb4 = new JButton("사원 삭제");
		
		// 2. 컴포넌트들을 컨테이너에 올려주어야 한다.
		// 2-1. 상단-1컨테이너에 1-1컴포넌트들을 올려야 한다.
		container1.add(jl1); container1.add(jtf1);
		container1.add(jl2); container1.add(jtf2);
		container1.add(jl3); container1.add(jcb1);
		
		// 2-2. 상단-2컨테이너에 1-2컴포넌트들을 올려야 한다.
		
		container2.add(jl4); container2.add(jcb2);
		container2.add(jl5); container2.add(jtf3);
		container2.add(jl6); container2.add(jtf4);
		container2.add(jl7); container2.add(jcb3);
		
		// 2-3 하단컨테이너에 1-4컴포넌트들을 올려야 한다.
		
		container3.add(jb1); container3.add(jb2);
		container3.add(jb3); container3.add(jb4);
		
		// 새로운 컨테이너를 하나를 만들어 서 기존의 컨테이너들을 올려주자
		JPanel group = new JPanel(new BorderLayout());
		group.add(container2,BorderLayout.NORTH);
		group.add(jsp,BorderLayout.CENTER);
		group.add(container3,BorderLayout.SOUTH);
		
		
		// 3.컨테이너를 프레임에 올려주어야 한다.
		setLayout(new BorderLayout());
		add(container1,BorderLayout.NORTH);
		add(group,BorderLayout.CENTER);
		
		setBounds(200, 200, 650, 350);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
		// 4. 부서번호를 화면에 띄어보도록 하자.
		connect();
		comboJob();
		comboMgr();
		comboDept(); //생성자에서 실행하기 때문에 실행시 곧바로 데이터가 추가
		
		table.addMouseListener(new MouseListener() {// new MouseAdpapter()
			
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
				jtf1.setText(table.getValueAt(row, 0).toString());
				jtf2.setText(table.getValueAt(row, 1).toString());
				jcb1.setSelectedItem(table.getValueAt(row, 2).toString());
				int empno = (int)model.getValueAt(row, 3);
				if(empno == 0) {
					jcb2.setSelectedIndex(0);
				}else {
					connect();
					//사원번호에 해당하는 사원명을 검색하는 메서드 호출
					String findName = findEname(empno);
					jcb2.setSelectedItem(empno+"["+findName+"]");
				}
				jtf3.setText(table.getValueAt(row, 5).toString());
				jtf4.setText(table.getValueAt(row, 6).toString());
				
				int deptno = (int)model.getValueAt(row, 7);
				// 부서번호에 해당하는 부서명을 찾는 메서드 호출
				String FindDname = findDname(deptno);
				jcb3.setSelectedItem(deptno+"["+FindDname+"]");
			}
		});
		
		
		
		// 5. 이벤트 처리
		// 사원 목록(jb1) 버튼을 클릭시 EMP 테이블에 있는 전체 사원의
		// 목록을 JTable 화면에 보여주면 됨.
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				connect();	//데이터베이스와 연결하는 메서드 호출.
				model.setRowCount(0); // 전체 테이블 화면을 지원주는 메서드.
				select(); // EMP 테이블의 전체 사원 목록을 조회하는 메서드.
			}
		});
		
		// 사원 등록(jb2) 버튼을 클릭시 각각의 텍스트 필드에 입력된 데이터를 
		// EMP테이블에 추가해 주고 , JTable에는 등록된 사원까지 목록이 나타나면 됨
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				connect();	//데이터베이스와 연결하는 메서드 호출.
				insert();
				//입력하는 텍스트 필드 영역 초기화 작업
				jtf1.setText(""); jtf2.setText("");
				jtf3.setText(""); jtf4.setText("");
				jcb1.setSelectedIndex(0);
				jcb2.setSelectedIndex(0);
				jcb3.setSelectedItem("선택");
				jtf1.requestFocus();
				model.setRowCount(0); // 전체 테이블 화면을 지원주는 메서드.
				
				//DB에 사원 등록 후 반영된 전체 리스트 메서드 호출
				select(); // EMP 테이블의 전체 사원 목록을 조회하는 메서드.
				
			}
		});
		
		// 사원수정(jb3) 버튼 클릭시 각각의 텍스트 필드에 수정하여 입력된 
		// 데이터를 EMP 테이블에서 수정을 하고, JTable에 수정된 정보가 나타나게 됨.
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				connect();	//데이터베이스와 연결하는 메서드 호출.
				update();
				//입력하는 텍스트 필드 영역 초기화 작업
				jtf1.setText(""); jtf2.setText("");
				jtf3.setText(""); jtf4.setText("");
				jcb1.setSelectedIndex(0);
				jcb2.setSelectedIndex(0);
				jcb3.setSelectedItem("선택");
				jtf1.requestFocus();
				model.setRowCount(0); // 전체 테이블 화면을 지원주는 메서드.
				//DB에 사원 등록 후 반영된 전체 리스트 메서드 호출
				select(); // EMP 테이블의 전체 사원 목록을 조회하는 메서드.
			}
		});
		
		//사원 삭제(jd4) 버튼 클릭시 JRable에서 특정 행을
		// EMP 테이블에서 삭제하는 작업을 진행.
		
		jb4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				connect();	//데이터베이스와 연결하는 메서드 호출.
				
				int result = JOptionPane.showConfirmDialog(null, "정말로 삭제하시겠습니까?","확인",JOptionPane.YES_NO_OPTION);
				if(result ==JOptionPane.CLOSED_OPTION) {
					JOptionPane.showMessageDialog(null, "취소를 클릭하셨습니다.");
				}else if(result == JOptionPane.YES_OPTION) {
					connect();
					delete();
					
					jtf1.setText(""); jtf2.setText("");
					jtf3.setText(""); jtf4.setText("");
					jcb1.setSelectedIndex(0);
					jcb2.setSelectedIndex(0);
					jcb3.setSelectedItem("선택");
					jtf1.requestFocus();
				}
				
				
			}
		});
	} // 생성자 end

	//DB를 연동하는 메서드
	void connect() {
		String driver = "oracle.jdbc.driver.OracleDriver";

		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		String user = "web";

		String password = "1234";

		// 1. 접속할 오라클 데이터베이스 드라이버를 메모리에 올리자. - 동적작업
		try {
			Class.forName(driver);

			// 2. 오라클 데이터베이스와 연결을 시도
			con = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} // connect() 메서드 end
	
	//emp 테이블에서 담당업무를 조회하는 메서드
	void comboJob() {
		
		try {
			// 1. 오라클 데이터베이스에 전송할 SQL문 작성.
			sql = "select distinct job from emp order by job";
			pstmt = con.prepareStatement(sql);
			
			// 2. 오라클 데이터베이스에 SQL문 전송 및 SQL문 실행
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String job = rs.getNString("job");
				jcb1.addItem(job);
			}
			// 3.오라클 데이터베이스에 연결되어 있던 자원 종료
			rs.close(); pstmt.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
				
	} //comboJob() 메서드  end
	
	// emp 테이블의 관리자 사원들을 조회하는 메서드
	void comboMgr() {
		
		try {
			// 1. 오라클 데이터베이스에 전송할 SQL문 작성.
			sql = "select empno,ename from emp"
					+" where empno in(select distinct(mgr) from emp)";
//			sql = "select empno,ename from emp where empno in(select distinct(mgr) from emp)";
			pstmt = con.prepareStatement(sql);
			
			// 2. 오라클 데이터베이스에 SQL문 전송 및 SQL문 실행
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				
				jcb2.addItem(empno+"["+ename+"]");
			}
			// 3.오라클 데이터베이스에 연결되어 있던 자원 종료
			rs.close(); pstmt.close(); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} //comboMgr() 메서드 end
	
	//dept 테이블의 부서번호를 조회하는 메서드
	void comboDept() {
		try {
			// 1. 오라클 데이터베이스로 전송할 SQL문 작성
			sql = "select *from dept order by deptno";
			pstmt = con.prepareStatement(sql);
			// 2. 오라클 데이터베이스로 SQL문 전송 및 SQL문 실행
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				jcb3.addItem(deptno+"["+dname+"]");
			}
			// 3. 오라클 데이터베이스에 연결되어 있던 자원을 종료
			rs.close(); pstmt.close(); con.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}// comboDept end
	
	//인자로 넘어온 사원번호로 사원명을 찾는 메서드.
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
	
	//인자로 넘어온 부서번호에 해당하는 부서명을 찾는 메서드.
	String findDname(int no) {
		String findDname = "";
		try {
			sql = "select dname from dept where deptno = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				findDname = rs.getString("dname");
			}
			
			rs.close(); pstmt.close(); //con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return findDname;
	}
	
	
	// EMP 테이블의 전체 사원 목록을 조회하는 메서드.
	void select() {
		//1. 오라클 데이터베이스로 전송할 SQL문 작성.
		try {
			//1. 오라클 데이터베이스로 전송할 SQL문 작성.
			sql = "select *from emp order by hiredate desc";
			pstmt = con.prepareStatement(sql);
			
			//2. 오라클 데이터베이스에 SQL문 전공 및 SQL문 실행
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				String hiredate = rs.getString("hiredate").substring(0, 10);
				int sal = rs.getInt("sal");
				int comm = rs.getInt("comm");
				int deptno = rs.getInt("deptno");
				
				Object[] data = {empno,ename,job,mgr,hiredate,sal,comm,deptno};
				
				model.addRow(data);
			}
			rs.close();pstmt.close();con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//	select() 메서드 end
	
	
	// EMP 테이블에 사원을 등록하는 메서드
	void insert() {
		try {
			sql = "insert into emp values(?,?,?,?,sysdate,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(jtf1.getText()));
			pstmt.setString(2, jtf2.getText());
			pstmt.setString(3, jcb1.getSelectedItem().toString());
			pstmt.setInt
				(4, Integer.parseInt(jcb2.getSelectedItem().toString().substring(0,4)));
			pstmt.setInt(5, Integer.parseInt(jtf3.getText()));
			pstmt.setInt(6, Integer.parseInt(jtf4.getText()));
			pstmt.setInt
				(7, Integer.parseInt(jcb3.getSelectedItem().toString().substring(0,2)));
			
			
			// 2. 오라클 데이터베이스에 SQL문 전송 및 SQL문 실행
			int res = pstmt.executeUpdate();
			
			if(res>0) {
				JOptionPane.showMessageDialog(null, "사원등록 성공");
			}else {
				JOptionPane.showMessageDialog(null, "사원등록 실패");
			}
			
			//3. 오라클 데이터베이스에 연결되어 있던 자원 종료
			pstmt.close(); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} // insert() 메서드 end
	
	
	// EMP 테이블에 사원의 정보를 수정하는 메서드.
	void update() {
		try {
			// 1. 오라클 데이터베이스로 전송할 SQL문을 작성
			sql = "update emp set job = ?, mgr = ?, sal = ?, comm = ?, deptno = ? where empno = ?";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, jcb1.getSelectedItem().toString());
			pstmt.setInt
				(2, Integer.parseInt(jcb2.getSelectedItem().toString().substring(0,4)));
			
			pstmt.setInt(3, Integer.parseInt(jtf3.getText()));
			pstmt.setInt(4, Integer.parseInt(jtf4.getText()));
			pstmt.setInt
				(5, Integer.parseInt(jcb3.getSelectedItem().toString().substring(0,2)));
			pstmt.setInt(6, Integer.parseInt(jtf1.getText()));
			
			
			// 2. 오라클 데이터 베이스에 SQL문 전송 및 실행
			int res = pstmt.executeUpdate();
			if(res>0) {
				JOptionPane.showMessageDialog(null, "사원 수정 성공");
			}else {
				JOptionPane.showMessageDialog(null, "사원 수정 실패");
			}
			pstmt.close(); //con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} // update() 메서드 end
	
	
	//JTable에서 특정 행을 클릭 시 EMP 테이블에서 삭제하는 메서드
	void delete() {
		
		
		try {
			//1. 오라클 데이터베이스로 전송할 SQL문을 작성.
			sql = "delete from dept where deptno = ?";
			pstmt = con.prepareStatement(sql);
			//테이블의 특정 행을 클릭했을 때 해당 테이블의 값을 가져오는 메서드
			int row = table.getSelectedRow();
			//해당 행의 값을 가져올 때 해당 행의 0번째 열의 값을 가져오는 방법
			pstmt.setInt(1, (int)table.getValueAt(row, 0));
			
			// 2. 오라클 데이터에이스에 SQL전송 및 SQL문 실행.
			int res = pstmt.executeUpdate();
			
			if(res>0) {
				JOptionPane.showMessageDialog(null, "사원삭제 성공");
			}else {
				JOptionPane.showMessageDialog(null, "사원삭제 실패");
			}
			
			// 실제로 테이블상의 클릭한 한 레코드를 삭제.
			model.removeRow(row);
			
			// 3. 오라클 데이터베이스에 연결되어 있던 자원 종료
			pstmt.close(); con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

	public static void main(String[] args) {
		new EMP();

	}

}
