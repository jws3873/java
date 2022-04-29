package Exam10;

import java.awt.BorderLayout;

import javax.swing.*;

public class Exam10_3 extends JFrame{
	public Exam10_3() {
		setTitle("커피 자판기");
		
		
		JPanel container1 = new JPanel();
		JPanel container2 = new JPanel();
		JPanel container3 = new JPanel();
		JPanel container4 = new JPanel();
		
		JLabel jlb1 = new JLabel("원하는 커피 선택");
		JRadioButton jrb1 = new JRadioButton("아메리카노(2500)");
		JRadioButton jrb2 = new JRadioButton("카페모카(3500)");
		JRadioButton jrb3 = new JRadioButton("에스프레소(2500)");
		JRadioButton jrb4 = new JRadioButton("카페라떼(4000)");
		ButtonGroup coffeegroup = new ButtonGroup();
		coffeegroup.add(jrb1);
		coffeegroup.add(jrb2);
		coffeegroup.add(jrb3);
		coffeegroup.add(jrb4);
		
		JLabel jlb2 = new JLabel("수량 : ");
		JTextField amount = new JTextField(8);
		JLabel jlb3 = new JLabel("입금액 : ");
		JTextField money = new JTextField(8);
		
		JTextArea jta = new JTextArea(5,20);
		JScrollPane jsp = new JScrollPane(
				jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		
		JButton button1 = new JButton("계산");
		JButton button2 = new JButton("종료");
		JButton button3 = new JButton("수량");
		
		JPanel group1 = new JPanel(new BorderLayout());
		container1.add(jlb1);
		container2.add(jrb1); container2.add(jrb2);
		container2.add(jrb3); container2.add(jrb4);
		group1.add(container1,BorderLayout.NORTH);
		group1.add(container2,BorderLayout.CENTER);
		
		JPanel group2 = new JPanel(new BorderLayout());
		container3.add(jlb2); container3.add(amount);
		container3.add(jlb3); container3.add(money);
		container4.add(button1); 
		container4.add(button2);
		container4.add(button3);
		group2.add(container3,BorderLayout.NORTH);
		group2.add(jsp,BorderLayout.CENTER);
		group2.add(container4,BorderLayout.SOUTH);
		
		setLayout(new BorderLayout());
		add(group1,BorderLayout.NORTH);
		add(group2,BorderLayout.CENTER);	
		
		setBounds(200,200,400,200);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Exam10_3();
	}

}
