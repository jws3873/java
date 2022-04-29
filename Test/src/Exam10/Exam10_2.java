package Exam10;

import java.awt.BorderLayout;

import javax.swing.*;
import javax.swing.border.Border;

public class Exam10_2 extends JFrame{
	public Exam10_2() {
		setTitle("성적 처리");
		JPanel container1 = new JPanel();
		JPanel container2 = new JPanel();
		JPanel container3 = new JPanel();
		
		//상단컨테이너
		JLabel jlb1 = new JLabel("이름");
		JTextField name = new JTextField(10);
		
		// group South
		JLabel jlb2 = new JLabel("국어 : ");
		JTextField kor = new JTextField(3);
		JLabel jlb3 = new JLabel("영어 : ");
		JTextField eng = new JTextField(3);	
		JLabel jlb4 = new JLabel("수학 : ");
		JTextField math = new JTextField(3);
		
		//group Center
		JTextArea jta = new JTextArea(5,20);
		JScrollPane jsp = new JScrollPane(
				jta, 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, 
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		
		//group South
		JButton button1 = new JButton("계산");
		JButton button2 = new JButton("종료");
		JButton button3 = new JButton("취소");
		
		container1.add(jlb1); container1.add(name);
		
		container2.add(jlb2); container2.add(kor);
		container2.add(jlb3); container2.add(eng);
		container2.add(jlb4); container2.add(math);
		
		container3.add(button1); container3.add(button2);
		container3.add(button3);
		
//		JPanel group = new JPanel(new BorderLayout(hgap, vgap));
		JPanel group = new JPanel();
		group.setLayout(new BorderLayout());
		group.add(container2,BorderLayout.NORTH);
		group.add(jsp,BorderLayout.CENTER);
		group.add(container3,BorderLayout.SOUTH);
		
		add(container1,BorderLayout.NORTH);
		add(group,BorderLayout.CENTER);
		
		setBounds(200,200,450,200);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	
	}

	public static void main(String[] args) {
		new Exam10_2();
	}

}
