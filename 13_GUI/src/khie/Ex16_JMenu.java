package khie;

import javax.swing.*;

public class Ex16_JMenu extends JFrame{// 파일	글자		도움말
	
public Ex16_JMenu() {
	setTitle("메뉴 예제");
	
	//	JPanel container = new JPanel(); 컨테이거가 없다 bar에 메뉴와객체가 들어간다.
	//메뉴안에 들어가는 객체를 매뉴 아이템 ,메뉴바는 컨데이터 개념과 같다.
	
	JMenuBar bar = new JMenuBar();
	
	//1. 메뉴를 만들어 보자.
	JMenu jmenu1 = new JMenu("파일");
	JMenu jmenu2 = new JMenu("글자");
	JMenu jmenu3 = new JMenu("도움말");
	JMenu jmenu4 = new JMenu("글자체");
	JMenu jmenu5 = new JMenu("바탕색");
	
	//2. 메뉴아이템을 만들어 보자.
	//2-1. "파일" 이라는 메뉴에 들어갈 메뉴 아이템을 만들자.
	JMenuItem jmi1 = new JMenuItem("새파일");
	JMenuItem jmi2 = new JMenuItem("열 기");
	JMenuItem jmi3 = new JMenuItem("저 장");
	JMenuItem jmi4 = new JMenuItem("종 료");
	
	//2-2-1. "글자" -> 글자체 메뉴에 들어갈 메뉴 아이템을 만들자
	JMenuItem jmi5 = new JMenuItem("굴림,기본,10");
	JMenuItem jmi6 = new JMenuItem("궁서,굵게,20");
	JMenuItem jmi7 = new JMenuItem("돋움,기울기,30");
	
	//2-2-3. "글자" -> 바탕색 메뉴에 들어갈 메뉴 아이템을 만들자
	JMenuItem jmi8 = new JMenuItem("노란색");
	JMenuItem jmi9 = new JMenuItem("회 색");
	JMenuItem jmi10 = new JMenuItem("초록색");
	
	//2-3. "도움말" -> 이라는 메뉴에 들어갈 메뉴 아이템을 만들자.
	JMenuItem jmi11 = new JMenuItem("도움말");
	JMenuItem jmi12 = new JMenuItem("메모장 정보");
	
	//3. 메뉴아이템(JMenuItem)을 메뉴(JMenu)에 올려주어야 한다.
	
	//3-1. "파일" 이라는 메뉴에 들어갈 메뉴아이템을 올리자.
	jmenu1.add(jmi1); jmenu1.add(jmi2);
	jmenu1.add(jmi3); 
	jmenu1.addSeparator();
	jmenu1.add(jmi4);
	
	//3-2. "글자체" 이라는 메뉴에 들어갈 메뉴아이템을 올리자.
	jmenu4.add(jmi5); jmenu4.add(jmi6);
	jmenu4.add(jmi7);
	
	jmenu2.add(jmenu4);
	jmenu2.addSeparator();
	
	jmenu5.add(jmi8); jmenu5.add(jmi9);
	jmenu5.add(jmi10);
	
	jmenu2.add(jmenu5);
	
	//3-3. "도움말" 이라는 메뉴에 들어갈 메뉴아이템을 올리자.
	jmenu3.add(jmi11); 
	jmenu3.addSeparator();
	jmenu3.add(jmi12);
	
	//4. 메뉴(jmenu)들을 메뉴바(jMenuBar)에 올려야 한다.
	bar.add(jmenu1); bar.add(jmenu2);
	bar.add(jmenu3); 
	
	setJMenuBar(bar); // 메뉴바는 프레임에 올리는것이 아니다.
	
	setBounds(200, 200, 300, 300);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	
}
	public static void main(String[] args) {
		new Ex16_JMenu();
	}

}
