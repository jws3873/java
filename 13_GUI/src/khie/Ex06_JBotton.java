package khie;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex06_JBotton extends JFrame{
	public Ex06_JBotton() {
		super("Buttoen 예제");
		//setTitle("Buttoen 예제");
		
		//컨테이너를 만들어야 한다
		JPanel container = new JPanel();
		
		//2. 컴포넌트를 만들어야 한다.
		
		JButton button1 = new JButton("버튼1");
		JButton button2 = new JButton("버튼2");
		JButton button3 = new JButton("버튼3");
		
		//2. 컴포넌트를 컨테이너에 올려야 한다,.
		container.add(button1);
		container.add(button2);
		container.add(button3);
		
		//3. 컨테이너를 프레임에 올려야 한다.
		add(container);
		
		setBounds(100, 100, 300, 300);
		
		setVisible(true);
	}
	

	public static void main(String[] args) {
		new Ex06_JBotton();
	}

}
