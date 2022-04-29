package khie;

import java.awt.event.*;
import javax.swing.*;


public class Ex28_Event extends JFrame implements MouseListener{
	public Ex28_Event() {
		
		JPanel container1 = new JPanel();
		
		JButton exit = new JButton("종료");
		
		container1.add(exit);
		add(container1);
		
		setBounds(200,200,300,300);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
		//메서드와 메서드를 실행시켜 줄 클래스 객체를 생성
		//이벤트 리스너와 컴포넌트가 연결
//		B b = new B(); 객체를 생성 할 필요가 없다.
		exit.addMouseListener(this); //컴포넌트와 리스너를 연결시키는 메서드 : addxxxxListener ===> xxx는 리스너 이름.
		//해당 클래스를 구현하였기 때문에 메인 객체를 넣는다.
		//내부클래스를 용하는 방법도 있다.
	}
	
	public static void main(String[] args) {
		new Ex28_Event();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.exit(0);
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}// 인터페이스를 구현하였기 때문에 명시적으로 오버라이딩을 해야한다.
