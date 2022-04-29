package khie;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ex36_Event extends JFrame{
public Ex36_Event() {
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
	JButton button3 = new JButton("취소");
	JButton button4 = new JButton("새창");
	
//	JPanel group1 = new JPanel(new BorderLayout());
	JPanel group1 = new JPanel();
	group1.setLayout(new BorderLayout());
	container1.add(jlb1);
	container2.add(jrb1); container2.add(jrb2);
	container2.add(jrb3); container2.add(jrb4);
	group1.add(container1,BorderLayout.NORTH);
	group1.add(container2,BorderLayout.CENTER);
	
//	JPanel group2 = new JPanel(new BorderLayout());
	JPanel group2 = new JPanel();
	group2.setLayout(new BorderLayout());
	container3.add(jlb2); container3.add(amount);
	container3.add(jlb3); container3.add(money);
	container4.add(button1); 
	container4.add(button2);
	container4.add(button3);
	container4.add(button4);
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
	
	button1.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			String coffee ="";
			int danga = 0;
			final double vatrate = 1.1;
			if(jrb1.isSelected()) {
				coffee = "아메리카노";
				danga = 2500;
			}else if(jrb2.isSelected()) {
				coffee = "카페모카";
				danga = 3500;
			}else if(jrb3.isSelected()) {
				coffee = "카페모카";
				danga = 2500;
			}else if(jrb4.isSelected()) {
				coffee = "카페모카";
				danga = 4000;
			}
			int su= Integer.parseInt(amount.getText());
			int inputMoney = Integer.parseInt(money.getText());
			int supplyPrice=danga*su;
			int vat =(int)(supplyPrice*0.1);
			int totalPrice = supplyPrice+vat;
			int cahrge = inputMoney-totalPrice;
			jta.append(
					"커피 종류 : "+coffee+"\n"+
					"커피 단가 : "+danga+"원\n"+
					"수      량 : "+ su+"\n"+
					"공급가액 : "+supplyPrice+"원\n"+
					"부가세액 : "+vat+"원\n"+
					"총금액 : "+totalPrice+"원\n"+
					"입금액 : "+inputMoney+"원\n"+
					"거스름돈 : "+cahrge+"원\n"
					);
			coffeegroup.clearSelection();
			amount.setText(""); money.setText("");
			amount.setFocusable(true);
		}
	});
	button2.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "시스템 종료");
			System.exit(0);
		}
	});
	button3.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			coffeegroup.clearSelection();
			amount.setText(null); money.setText(null);
			amount.setFocusable(true);
		}
	});
	
	//새창 버튼을 클릭했을 때 이벤트 처리
	button4.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			new Ex15_JTabbedPane();
		}
	});
}
	public static void main(String[] args) {
		new Ex36_Event();
	}

}
