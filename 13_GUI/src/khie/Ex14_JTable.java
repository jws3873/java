package khie;

import javax.swing.*;


public class Ex14_JTable extends JFrame{
	public Ex14_JTable() {

		//JTable 컴포넌트는 컨테이너에 올리지 않고
		// 바로 JFrame에 올리면 됨

		//1. 컴포넌트를 만들어 보자
		String[] header = {"학생이름","국어점수","영어점수","수학점수","자바점수"};
		
		String[][] contents = {
				{"홍길동","94","88","90","90"},
				{"이순신","93","88","90","90"},
				{"유관순","91","88","90","90"},
				{"김유신","95","88","90","90"},
				{"김연아","97","88","90","90"},
				{"김강찬","98","88","90","90"},
				{"세종대왕","94","88","90","90"},
				{"백종원","74","88","90","90"},
				{"유재석","84","88","90","90"},
				{"강호동","80","88","90","90"},
		};
		JTable jtable = new JTable(contents, header);
		
		//1-1. 스크롤바를 만들어 보자.
		JScrollPane jsp = new JScrollPane(
				jtable, // 스크롤바가 보여질 컴포넌트 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, // 수직으로 스크롤바를 보여 줄지 여부 확인
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);//수평으로 스크롤바를 보여 줄지 여부 확인


		//3. 컴포넌트를 프레임에 올려야 한다.
		add(jsp);

		setBounds(200,200,300,150);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex14_JTable();
	}

}
