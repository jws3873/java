package khie;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class Ex03_Button extends Frame{
public Ex03_Button() {
	
//	setTitle("Buttoen 예제");
	super("Buttoen 예제");
	
	//컨테이너를 만들어 보자.
	Panel panel = new Panel(); // 패널은 무게가 가벼운 컨데이터이며 컨데이너 위에 컴포넌트를 올려준다. 패널이라는 객체를 생성하면 컨테이너가 생성된다.
	
	//1. 컴포넌트를 만들어보자.
	Button button = new Button("Button1");
	
	//2. 컴포넌트를 컨테이너에 올려야 한다.
	panel.add(button);
	
	
	//3. 컨테이너를 프레임에 올려야 한다.
	add(panel);
	
	setBounds(100, 100, 300, 300);
	
	setVisible(true);
}
	public static void main(String[] args) {
		new Ex03_Button();
	}

}
