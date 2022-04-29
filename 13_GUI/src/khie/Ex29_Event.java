package khie;

import java.awt.event.*;


import javax.swing.*;
//4. 무명클래스를 이용하는 방법
public class Ex29_Event extends JFrame{
public Ex29_Event() {
	JPanel container1 = new JPanel();
	
	JButton exit = new JButton("종료");
	
	container1.add(exit);
	add(container1);
	
	setBounds(200,200,300,300);

	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	setVisible(true);
	

	exit.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(exit,"종 료"); //exit를 부모로 사용할 수 있다. 이유는 해당 메서드의 메인 메서드에서 실행되었기 때문?
			System.exit(0);
		}
	});

}
	public static void main(String[] args) {
		new Ex29_Event();
	}

}
