package khie;

import javax.swing.*;

public class Ex09_JRadioButton extends JFrame{
	public Ex09_JRadioButton() {
		setTitle("JRadioButton예제");
		
		JPanel container = new JPanel();
		
		//1. 컨포넌트를 만들자.
		JRadioButton jradiobutton1 = new JRadioButton("게임");
		JRadioButton jradiobutton2 = new JRadioButton("여행",true);
		JRadioButton jradiobutton3 = new JRadioButton("운동");
		JRadioButton jradiobutton4 = new JRadioButton("잠자기");
		
		//라디오 버튼은 반드시 ButtonGroup에 올려져야 한다.
		ButtonGroup group = new ButtonGroup();
		group.add(jradiobutton1);
		group.add(jradiobutton2);
		group.add(jradiobutton3);
		group.add(jradiobutton4);
		
		//2. 컴포넌트를 컨테이너에 올려야 한다.
		container.add(jradiobutton1);
		container.add(jradiobutton2);
		container.add(jradiobutton3);
		container.add(jradiobutton4);
		
		//3. 컨테이너를 프레임에 올려야 한다.
		add(container);
		
		setBounds(200, 200, 300, 300);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
	
	}

	public static void main(String[] args) {
		new Ex09_JRadioButton();
	}

}
