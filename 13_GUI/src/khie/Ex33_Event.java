package khie;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ex33_Event extends JFrame{
	public Ex33_Event() {

		setTitle("간단한 계산기");
		
		// 컨테이너를 3개를 만들자.
		JPanel container1 = new JPanel();//상단 컨테이너
		JPanel container2 = new JPanel();//중앙 컨테이너
		JPanel container3 = new JPanel();//하단 컨테이너

		//1. 컴포넌트들을 만들어 보자.
		//1-1. 상단 컨테이너에 들어갈 컴포넌트들을 만들자.
		JLabel jl1 = new JLabel("수1 : ");
		JTextField su1 = new JTextField(5);
		
		JLabel jl2 = new JLabel("수2 : ");
		JTextField su2 = new JTextField(5);
		
		JLabel jl3 = new JLabel("연산자 : ");
		JTextField op = new JTextField(5);
		
		
		//1-2. 중앙 컨테이너에 들어갈 컴포넌트들을 만들자.
		JTextArea jta = new JTextArea(5,20);
		
		JScrollPane jsp = new JScrollPane(
				jta, // 스크롤바가 보여질 컴포넌트 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, // 수직으로 스크롤바를 보여 줄지 여부 확인
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);//수평으로 스크롤바를 보여 줄지 여부 확인
		
		jta.setLineWrap(true);// 자동 줄바꿈 기능 설정
		
		
		//1-3. 하단 컨테이너에 들어갈 컴포넌트들을 만들자.
		
		JButton button1 = new JButton("계 산");
		JButton button2 = new JButton("종 료");
		JButton button3 = new JButton("취 소");

		
		//2. 컴포넌트들을 컨테이너에 추가해 주어야 한다.
		//2-1. 상단 컨테이너에 들어갈 컴포넌트들을 추가해 주자.
		
		container1.add(jl1); container1.add(su1);
		container1.add(jl2); container1.add(su2);
		container1.add(jl3); container1.add(op);
		
		//2-2. 중앙 컨테이너에 들어갈 컴포넌트들을 추가해 주자.
		container2.add(jsp);
		
		//2-3. 하단 컨테이너에 들어갈 컴포넌트들을 추가해 주자.
		container3.add(button1);
		container3.add(button2);
		container3.add(button3);
		
		//3. 컨테이너를 프레임에 올려주어야 한다.
		// 프레임에 3개의 컨테이너를 올려야 한다. 배치를 해서 올리면 됨.
		add(container1,BorderLayout.NORTH);
		add(container2,BorderLayout.CENTER);
		add(container3,BorderLayout.SOUTH);
		
		setBounds(200,200,350,150);
		
		//pack() : JFrame에 올라온 컴포넌트(내용물)를 알맞게 
		//프레임의 크기를 조절해 주는 기능
		pack();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
		//4. 이벤트 처리
		//4-1. 계산(button1) 버튼을 클릭했을 때 이벤트를 처리
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(su1.getText());
				int num2 = Integer.parseInt(su2.getText());
				String operator = op.getText();
				String result = "";
				
				switch(operator) {
				case "+" : result = "결과>>>"+num1+"+"+num2+" = "+(num1+num2);
				break;
				case "-" : result = "결과>>>"+num1+"-"+num2+" = "+(num1-num2);
				break;
				case "*" : result = "결과>>>"+num1+"*"+num2+" = "+(num1*num2);
				break;
				case "/" : result = "결과>>>"+num1+"/"+num2+" = "+(num1/num2);
				break;
				case "%" : result = "결과>>>"+num1+"%"+num2+" = "+(num1%num2);
				break;
				}// switch~case문 end
				jta.append(result+"\n");
				su1.setText(null);
				su2.setText(null);
				op.setText(null);
				
				su1.requestFocus(true);
			}
		});
		
		//4-2.종료(exit) 버튼을 클릭했을 때 이벤트 처리
		
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		// 4-3. 취소(cancel)버튼을 클릭했을 때 이벤트 처리
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//전체 컴포넌트의 값을 초기화 시키는 작업
				su1.setText(null);
				su2.setText(null);
				op.setText(null);
				jta.setText(null);
				
			}
		});
	}

	public static void main(String[] args) {
		new Ex33_Event();
	}

}
