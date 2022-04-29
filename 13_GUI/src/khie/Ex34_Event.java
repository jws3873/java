package khie;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;


public class Ex34_Event extends JFrame{
public Ex34_Event() {

	setTitle("계산기 예제 - 3");
	
	
	//컨테이너를 만들자
	JPanel container1 = new JPanel(); // 상단-1컨테이너
	JPanel container2 = new JPanel(); // 하단-1컨테이너
	JPanel container3 = new JPanel(); // 하단 컨테이너
	
	//1. 컴포넌트들을 만들어 보자.
	
	//1-1. 상단 컨테이너에 들어갈 컴포넌트들을 만들자.
	JLabel jlb1 = new JLabel("수1");
	JTextField su1 = new JTextField(5);
	
	JLabel jlb2 = new JLabel("수2");
	JTextField su2 = new JTextField(5);
	
	JLabel jlb3 = new JLabel("연산자");
	JRadioButton jrb1 = new JRadioButton("+");
	JRadioButton jrb2 = new JRadioButton("-");
	JRadioButton jrb3 = new JRadioButton("*");
	JRadioButton jrb4 = new JRadioButton("/");
	JRadioButton jrb5 = new JRadioButton("%");
	ButtonGroup group = new ButtonGroup();
	group.add(jrb1);
	group.add(jrb2);
	group.add(jrb3);
	group.add(jrb4);
	group.add(jrb5);
	
	//1-2. 중앙 컨테이너에 들어갈 컴포넌트들을 만들자.
	JTextArea jta = new JTextArea(5,20);
	JScrollPane jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	jta.setLineWrap(true);
	
	//1-3. 하단 컨테이너에 들어갈 컴포넌트들을 만들자.
	JButton button1 = new JButton("계산");
	JButton button2 = new JButton("종료");
	JButton button3 = new JButton("취소");

	container1.add(jlb1); container1.add(su1);
	container1.add(jlb2); container1.add(su2);
	
	container2.add(jlb3);
	container2.add(jrb1); container2.add(jrb2);
	container2.add(jrb3); container2.add(jrb4);
	container2.add(jrb5); 
	
	container3.add(button1);
	container3.add(button2);
	container3.add(button3);
	
	JPanel group1 = new JPanel(new BorderLayout());
	group1.add(container2,BorderLayout.NORTH);
	group1.add(jsp,BorderLayout.CENTER);
	group1.add(container3,BorderLayout.SOUTH);

	
	add(container1,BorderLayout.NORTH);
	add(group1,BorderLayout.CENTER);
	
	setBounds(200,200,450,200);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	pack();
	setVisible(true);
	
	//4. 이벤트 처리
	//계산버튼을 클릭했을 때 이벤트 처리
	button1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			int num1 = Integer.parseInt(su1.getText());
			int num2 = Integer.parseInt(su2.getText());
			String operator = "";
			String result = "";
			if(jrb1.isSelected()) {
				operator = "+"; result = "결과>>>"+num1+"+"+num2+" = "+(num1+num2);
				
			}
			else if(jrb2.isSelected()) {
				operator = "-"; result = "결과>>>"+num1+"-"+num2+" = "+(num1-num2);
			}
			else if(jrb3.isSelected()) {
				operator = "*"; result = "결과>>>"+num1+"*"+num2+" = "+(num1*num2);
			}
			else if(jrb4.isSelected()) {
				operator = "/"; result = "결과>>>"+num1+"/"+num2+" = "+(num1/num2);
			}
			else if(jrb5.isSelected()) {
				operator = "%"; result = "결과>>>"+num1+"%"+num2+" = "+(num1%num2);
			}
			jta.append(result+"\n");
			//입력받은 컴포넌트들은 모두 초기화
			su1.setText(""); su2.setText("");//null보다는 ""를 이용해주어야 한다 nullpointer exception이발생할 수 있으므로
			//라디오 버튼도 초기화 되어야 한다.
			group.clearSelection();
			
			su1.requestFocus(true);
		}
	});
	
	//종료 버튼을 클릭했을 때 이벤트 처리
	button2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "시스템 종료");
			System.exit(0);
		}
	});
	
	//취소 버튼을 클릭했을 때 이벤트 처리
	button3.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			su1.setText(""); su2.setText("");
			su1.requestFocus(true);
			group.clearSelection();
			
		}
	});
}

	public static void main(String[] args) {
		new Ex34_Event();
	}

}
