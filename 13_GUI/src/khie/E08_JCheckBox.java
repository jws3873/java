package khie;

import javax.swing.*;

public class E08_JCheckBox extends JFrame{
public E08_JCheckBox() {
	setTitle("과일 체크박스 예제");
	
	//컨테이너를 만들자
	JPanel container = new JPanel();
	//1.1이미지 아이콘을 만들어 보자.
	ImageIcon Kiwi = new ImageIcon("images/Kiwi.jpg");
	ImageIcon mango = new ImageIcon("images/mango.jpg");
	ImageIcon apple = new ImageIcon("images/apple.jpg");
	ImageIcon freinds = new ImageIcon("images/freinds.jpg");
	
	//1-2. 컴포넌트를 만들어 보자.
	JCheckBoxMenuItem jcheckbox1 = new JCheckBoxMenuItem("키위",Kiwi);
	JCheckBoxMenuItem jcheckbox2 = new JCheckBoxMenuItem("망고",mango);
	JCheckBoxMenuItem jcheckbox3 = new JCheckBoxMenuItem("애플",apple);
	JCheckBoxMenuItem jcheckbox4 = new JCheckBoxMenuItem("freinds",freinds);
	
	container.add(jcheckbox1);
	container.add(jcheckbox2);
	container.add(jcheckbox3);
	container.add(jcheckbox4);
	
	add(container);
	
	setBounds(200, 200, 300, 600);
	
	//프레임의 크기를 고정시키는 메서드
	setResizable(false);
	
	//프레임의 x버튼 클릭시 종료시키는 메서드
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	setVisible(true);
	
}
	public static void main(String[] args) {
		new E08_JCheckBox();
	}

}
