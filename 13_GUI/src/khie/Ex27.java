package khie;

import java.awt.event.*;
import java.security.Key;

import javax.swing.*;
//구형하려는 인터페이스의 메서드가 너무 많아 불편할 경우 adapter 클래스를 이용
// 이때 adapter는 클래스이기 때문에 상속을 받는다. 클래스이기 때문에 
// 오버라이딩 해서 사용하면 된다. adapter클래스도 추상클래스이다.
class B extends MouseAdapter{
	@Override
	public void mouseClicked(MouseEvent e) {
		JOptionPane.showMessageDialog(null, "시스템 종료");
		System.exit(0); // 시스템을 종료시키는 메서드.
	}		
}
public class Ex27 extends JFrame{
public Ex27() {
	JPanel container1 = new JPanel();
	
	JButton exit = new JButton("종료");
	
	container1.add(exit);
	add(container1);
	
	setBounds(200,200,300,300);

	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	setVisible(true);
	
	//메서드와 메서드를 실행시켜 줄 클래스 객체를 생성
	//이벤트 리스너와 컴포넌트가 연결
	B b = new B();
	exit.addMouseListener(b); // 컴포넌트와 리스너를 연결시키는 메서드 : addxxxxListener ===> xxx는 리스너 이름.

}
	public static void main(String[] args) {
		new Ex27();
	}

}
