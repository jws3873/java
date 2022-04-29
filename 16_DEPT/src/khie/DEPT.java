package khie;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;



public class DEPT extends JFrame {
	Connection con = null; //DB와 연결하는 객체
	
	PreparedStatement pstmt = null; //DB에 SQL문을 전송하는 객체
	
	ResultSet rs = null;
	
	String sql = null;	//SQL문 저장 문자열 변수
	
	DefaultTableModel model =null;
	
	JTextField jtf1,jtf2,jtf3;
	
	JTable table;
	

	
	public DEPT() {
		setTitle("부서 테이블");
		
		JPanel container1 = new JPanel(); // 상단 컨테이너
		JPanel container2 = new JPanel(); // 하단 컨테이너
		
		// 1. 컴포넌트를 만들어 보자.
		//1-1. 상단 컨테이너에 올려질 컴포넌트를 만들자.
		JLabel jl1 = new JLabel("부서번호 : ");
		jtf1 = new JTextField(2);
		
		JLabel jl2 = new JLabel("부서명 : ");
		jtf2 = new JTextField(10);
		
		JLabel jl3 = new JLabel("부서위치 : ");
		jtf3 = new JTextField(10);
		
		//1-2. 중앙에 들어갈 컴포넌트를 만들자
		String[] header = {"부서번호", "부서명", "근무지"};
		
		/*
		 *  -DefaultTableModel : 테이블을 만들고 난 후 데이터를 넣고
		 *  					추가,수정,삭제 시에도 변경이 가능함.
		 *  -Jtable : 일단은 테이블을 만들고 난 후 데이터를 넣으면 한 번 만든
		 *  			테이블의 데이터를 변경이 불가능하다.
		 *  			추가, 수정, 삭제 불가능
		 *  			추가, 수정, 삭제 시에는 다시 새로운 객체를 만들어야 함.
		 */
		
		model =  new DefaultTableModel(header, 0);
		table = new JTable(model);
		
		JScrollPane jsp = new JScrollPane(
				table,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		//1-3. 하단 컨테이너에 들어갈 컴포넌트를 만들자.
		JButton jb1 = new JButton("전체 목록");
		JButton jb2 = new JButton("부서 추가");
		JButton jb3 = new JButton("부서 수정");
		JButton jb4 = new JButton("부서 삭제");
		
		// 2. 컴포넌트를 컨테이너에 올려주어야 한다.
		
		// 상단 컨테이너에 1-1 컴포넌트들을 올려 주자.
		container1.add(jl1); container1.add(jtf1);
		container1.add(jl2); container1.add(jtf2);
		container1.add(jl3); container1.add(jtf3);
		
		// 하단 컨테이너에 1-3 컴포넌트들을 올려 주자.
		container2.add(jb1); container2.add(jb2);
		container2.add(jb3); container2.add(jb4);
		
		// 3. 컨테이너를 프레임에 올려주어야 한다.
		
		setLayout(new BorderLayout());
		
		add(container1,BorderLayout.NORTH);
		add(jsp,BorderLayout.CENTER);
		add(container2,BorderLayout.SOUTH);
		
		setBounds(200, 200, 500, 250);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
		//4. 이벤트 처리.
		// 전체목록(jb1)버튼 클릭했을 때 DEPT테이블의
		// 전체 리스트를 JTable에 출력을 해주면 됨
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				connect(); //데이터베이스 로딩 및 데이터 베이스 연결 시도
				model.setRowCount(0); // 전체 테이블의 화면을 지워주는 메서드
				select(); //DB에서 전체 내역을 조회하는 메서드 호출
				
			}
		});
		
		//부서추가(jb2) 버튼을 클릭했을 때 각각의 텍스트 필드에 입력된 정보를
		//DB에 추가한 후 추가된 전체 리스트를 JTable에 다시 보여주면 됨.
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				connect(); //이전메서드에서 커넥트 연결을 끊었기에 다시 연결해 준다.
				insert();
				
				// 입력 텍스트 필드 영역 초기화
				jtf1.setText(""); jtf2.setText("");
				jtf3.setText(""); 
				model.setRowCount(0); // 전체 테이블의 화면을 지워주는 메서드
				select(); // insert를 통해 부서가 추가되면 확인할 수 있도록 화면을 다시 보여준다. // 사용전 connect가 꺼져있으면 호출이 안된다.
			}
		});
		
		// 부서수정(jb3) 버튼을 눌렀을때 각각의 텍스트 필드에 입력된 정보를
		// 바탕으로 DB에서 수정한 후, DEPT 테이블전체 리스트를 JRable에 보여주면 됨.
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				connect(); // 데이터베이스에 연결하는 메서드 호출
				update(); //데이터베이스에서 수정하는 메서드 호출
				// 입력 텍스트 필드 영역 초기화
				jtf1.setText(""); jtf2.setText("");
				jtf3.setText(""); jtf1.requestFocus();
				model.setRowCount(0); // 전체 테이블의 화면을 지워주는 메서드
				select(); // insert를 통해 부서가 추가되면 확인할 수 있도록 화면을 다시 보여준다. // 사용전 connect가 꺼져있으면 호출이 안된다.
				
			}
		});
		
		// JTable의 특정 행을 클릭한 상태로 부서삭제(jb4) 버튼을 눌렀을때
		// 클릭된 행을 DB에서 삭제시키는 작업 진행 후, DEPT 테이블의 전체 리스트를 
		// JTable에 다시 보여주면 된다.
		jb4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int result = JOptionPane.showConfirmDialog(null, "정말로 삭제하시겠습니까?","확인",JOptionPane.YES_NO_OPTION);
				if(result ==JOptionPane.CLOSED_OPTION) {
					JOptionPane.showMessageDialog(null, "취소를 클릭하셨습니다.");
				}else if(result == JOptionPane.YES_OPTION) {
					connect();
					delete();
					
					jtf1.setText(""); jtf2.setText("");
					jtf3.setText(""); jtf1.requestFocus();
				}
				
				
			}
		});
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
				jtf1.setText(model.getValueAt(row, 0).toString());
				jtf2.setText(model.getValueAt(row, 1).toString());
				jtf3.setText(model.getValueAt(row, 2).toString());		
			}
		});
	
	}

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
	
	// DEPT 테이블의 전체 내역을 조회 하는 메서드
	void select() {
		
		//1. 데이터베이스에 전송할 SQL문 작성.
		
		try {
			// 1. 데이터 베이스에 전송할 SQL문 작성.
			sql = "select *from dept order by deptno";

			pstmt = con.prepareStatement(sql);
			// 2. 데이터베이스에 SQL문을 전송 및 실행 
			rs = pstmt.executeQuery();
			
			// 3. 레코드 수 만큼 반복하여 데이터를 추출 
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				
				Object[] data = {deptno,dname,loc};
				
				// 저장한 한개의 레코드(data) 를 model에 추가해 주면 됨.
				model.addRow(data);
			}
			
			//4. 데이터 베이스에 연결되어 있던 자원을 종료
			
			rs.close();pstmt.close();con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}// select() 메서드 end
	
	void insert() {
		// 1. 데이터 베이스에 전송할 SQL문 작성.
		
		try {
			sql = "insert into dept values(?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(jtf1.getText()));
			pstmt.setString(2, jtf2.getText());
			pstmt.setString(3, jtf3.getText());
			
			//2. 오라클 데이터베이스에 SQL문 전송 및 SQL문 실행
			int res = pstmt.executeUpdate();
			
			if(res>0) {
				JOptionPane.showMessageDialog(null, "부서 추가 성공");
			}else {
				JOptionPane.showMessageDialog(null, "부서 추가 실패");
			}
			pstmt.close(); //con.close(); 이후에 실행할 select 문을 위해서 종료하지 않는다.
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}	//insert() 메서드 end
	
	void update() {
		//1. 데이터베이스에서 전송할 SQL문 작성
		
		try {
			sql = "update dept set dname = ?, loc = ? where deptno = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, jtf2.getText());
			pstmt.setString(2, jtf3.getText());
			pstmt.setInt(3, Integer.parseInt(jtf1.getText()));
			
			//2. 오라클 데이터베이스에 SQL문 전송 및 SQL문 실행
			
			int res = pstmt.executeUpdate();
			if(res>0) {
				JOptionPane.showMessageDialog(null, "부서 수정 성공");
			}else {
				JOptionPane.showMessageDialog(null, "부서 수정 실패");
			}
			
			//3. 오라큰 데이터베이스에 연결되어 있던 자원 종료
			pstmt.close(); //con.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}// update() 메서드 end
	
	//DEPT 테이블에서 특정 행을 삭제시키는 메서드
	
	void delete() {
		//1. 오라클 데이터 베이스에서 전송할 SQL문을 작성
		try {
			sql = "delete from dept where deptno = ?";
			pstmt = con.prepareStatement(sql);
			
			//JTable에서 선택된 셀의 row값을 int 형으로 반환해 주는 메서드
			int row = table.getSelectedRow();
			
			//getValueAt(세로인덱스(행), 가로인덱스(열))
//			int deptno = (int)model.getValueAt(row, 0);
			pstmt.setInt(1, (int)model.getValueAt(row, 0));
			
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				JOptionPane.showMessageDialog(null, "부서 삭제 성공");
			}else {
				JOptionPane.showMessageDialog(null, "부서 삭제 실패");
			}
			model.removeRow(row); // 테이블상의 한 줄 삭제
			//3. 오라큰 데이터베이스에 연결되어 있던 자원 종료
			pstmt.close(); con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		new DEPT();
	}

}
