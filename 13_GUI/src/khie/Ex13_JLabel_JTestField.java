package khie;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex13_JLabel_JTestField extends JFrame{
	public Ex13_JLabel_JTestField() {
		setTitle("JLabel_JTestField 예제");
		
		//컨데이너를 만들자
		JPanel container = new JPanel();
		
		//1. 컴포넌트를 만들어 보자
		JLabel jlabel = new JLabel("이 름 : ");
		JTextField name = new JTextField(15);

		JLabel jlabe2 = new JLabel("학 번 : ");
		JTextField hakbun = new JTextField(15);

		JLabel jlabe3 = new JLabel("주 소 : ");
		JTextField address = new JTextField(15);
		
		//2. 컴포넌트를 컨테이너에 올려야 한다.
		
		container.add(jlabel); container.add(name);
		container.add(jlabe2); container.add(hakbun);
		container.add(jlabe3); container.add(address);
		
		//3. 컨테이너를 프레임에 올려야 한다.
		add(container);
		
		setBounds(200,200,250,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	
	}

	public static void main(String[] args) {
		new Ex13_JLabel_JTestField();
	}

}
