package khie;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.Attributes.Name;

import javax.swing.*;


public class Ex35_Event extends JFrame{
	public Ex35_Event() {

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
		
		setBounds(200,200,550,400);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
		//4. 이벤트 처리
		// 계산버튼 클릭 시 이벤트 처리
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = name.getText();
				int num1 = Integer.parseInt(kor.getText());
				int num2 = Integer.parseInt(eng.getText());
				int num3 = Integer.parseInt(math.getText());
				int total = num1+num2+num3;
				double avg = (Math.round((total/3.0*100)))/100.0;
				String hakjum = "";
				if(avg >= 90) hakjum = "A학점";
				else if(avg >= 80) hakjum = "B학점";
				else if(avg >= 70) hakjum = "C학점";
				else if(avg >= 60) hakjum = "D학점";
				else  hakjum = "F학점";
				jta.append(
				"***"+str+"님 성적 결과***\n"+
				"이름 : "+ str+"\n"+
				"국어점수 : "+ num1+"점\n"+
				"영어점수 : "+ num2+"점\n"+
				"수학점수 : "+ num3+"점\n"+
				"총점 : "+ total+"점\n"+
				"평균 : "+ avg+"점\n"+ //String.format("%.2f점\n",avg) 시발 ㅈ고생했네 
				//지정된 형식에 따라 개체의 값을 문자열로 변환하여 다른 문자열에 삽입 합니다. 
				//Format(String, Object)	문자열에 있는 하나 이상의 형식 항목을 지정된 개체의 문자열 표현으로 바꿉니다.
				"학점 : "+ hakjum+"\n\n");
				name.setText(""); kor.setText("");
				eng.setText(""); math.setText("");
				name.requestFocus(true);
			}
		});
		//종료버튼 클릭 시 이벤트 처리
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		//취소버튼 클릭 시 이벤트 처리
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				name.setText(null); kor.setText(null);
				eng.setText(null); math.setText(null);
				jta.setText(null);
				name.setFocusable(true);
			}
		});
	
	}

	public static void main(String[] args) {
		new Ex35_Event();
	}

}
