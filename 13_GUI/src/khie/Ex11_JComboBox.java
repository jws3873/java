package khie;

import javax.swing.*;

public class Ex11_JComboBox extends JFrame{
	// 메인에서 하지 않고 상속을 통하여 하는 이유
	// 여러개의 컴포넌트를 실행하는 경우 메인에서 밖에 실행이 되지 않는다
	// 이때 다른 메서드 호출시 다른 메서드에서 객체를 다시생성해야한다? 화면을 넘길때 객체를 생성하는게 가장 좋은 방법이다.
	public Ex11_JComboBox() {

	setTitle("JComboBox예제");
	
	//컨테이너를 만들자
	JPanel container = new JPanel();
	
	//1. 컴포넌트를 만들어 보자.
	String[] jop = {"회사원","공무원","학생","주부","무직","기타"};
	JComboBox<String> jComboBox = new JComboBox<String>(jop);
	//JComboBox에서 초기값을 설정하는 방법
//	jComboBox.setSelectedIndex(2);
	jComboBox.setSelectedItem("공무원");
	
	//2. 컴포넌트를 컨테이너에 올려야 한다.
	container.add(jComboBox);
	
	//3. 컨테이너를 프레임에 올려야 한다.
	add(container);
	
	setBounds(200,200,300,300);
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	setVisible(true);
	
	
	}

	public static void main(String[] args) {
		new Ex11_JComboBox();

	}

}
