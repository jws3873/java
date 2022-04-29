package khie;

import javax.swing.*; //임포스시에 각각의 클래스를 추가해주어야 한다 임포트 문이 많을시 패키지.*을 통해 한번에 추가한다.


public class Ex07_JCheckBox extends JFrame{
	public Ex07_JCheckBox() {
		setTitle("JCheckBox예제");
		
		//컨테이너를 만들자.
		JPanel container = new JPanel();
		
		//컴포넌트를 만들자.
		JCheckBox jcheckbox1 = new JCheckBox("게임");
		JCheckBox jcheckbox2 = new JCheckBox("여행",true); //true를 기입하면 체크가 되어 있는 상태로 나온다
		JCheckBox jcheckbox3 = new JCheckBox("영화감상");
		JCheckBox jcheckbox4 = new JCheckBox("운동");
		JCheckBox jcheckbox5 = new JCheckBox("잠자기");
		
		//컨테이너에 컴포넌트를 추가
		container.add(jcheckbox1);
		container.add(jcheckbox2);
		container.add(jcheckbox3);
		container.add(jcheckbox4);
		container.add(jcheckbox5);
		
		//프레임에 컨테이너를 추가
		add(container);
		
		setBounds(100, 100, 400, 300);
		
		setVisible(true);
	
	}

	public static void main(String[] args) {
		new Ex07_JCheckBox();
//		JFrame jframe = new JFrame();
//		
//		JCheckBox jcheckbox = new JCheckBox("jfame객체");
//		
//		JPanel container = new JPanel();
//		
//		container.add(jcheckbox);
//		jframe.add(container);
//		jframe.setBounds(300, 300, 300, 300);
//		
//		jframe.setVisible(true);
	}

}
