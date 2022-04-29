package khie;

import javax.swing.JFrame;

/*
 * awt와 Swing 컴포넌트 비교방법은 앞에 j가 들어가면 Swing계열 컴포넌트
 *창 x를 누르면 꺼지지만 콘솔창에서 켜져있기 때문에 콘솔에서 반드시 종료를 해야 한다.
 */

public class Ex03_JFrame extends JFrame{ //운영체제에 도움을 받지 않음
public Ex03_JFrame() {

	setTitle("세번째 예제");
	setBounds(100,100,300,300);
	setVisible(true);
}

	public static void main(String[] args) {
		new Ex03_JFrame();
	}

}
