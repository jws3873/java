package khie;

import java.awt.BorderLayout;

import javax.swing.*;

public class Ex24 extends JFrame {

	public Ex24() {
	
		setTitle("성적 처리");
		
		// 컨테이너 3개를 만들자.
		JPanel container1 = new JPanel();  // North-1 컨테이너
		JPanel container2 = new JPanel();  // North-2 컨테이너
		JPanel container3 = new JPanel();  // South 컨테이너
		
		
		// 1. 컴포넌트를 만들자.
		// 1-1-1. 상단(North-1 컨테이너)에 들어갈 컴포넌트를 만들자.
		JLabel jl1 = new JLabel("이  름 : ");
		JTextField name = new JTextField(10);
		
		// 1-1-2. 상단(North-2 컨테이너)에 들어갈 컴포넌트를 만들자.
		JLabel jl2 = new JLabel("국  어 : ");
		JTextField kor = new JTextField(3);
		
		JLabel jl3 = new JLabel("영  어 : ");
		JTextField eng = new JTextField(3);
		
		JLabel jl4 = new JLabel("수  학 : ");
		JTextField mat = new JTextField(3);
		
		// 1-2. 중앙에 들어갈 컴포넌트를 만들자.
		JTextArea jta = new JTextArea(5, 20);
		
		JScrollPane jsp = new JScrollPane(
				jta, 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, 
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		jta.setLineWrap(true);
		
		// 1-3. 하단(South 컨테이너)에 들어갈 컴포넌트를 만들자.
		JButton result = new JButton("계   산");
		JButton exit = new JButton("종   료");
		JButton cancel = new JButton("취   소");
		
		
		// 2. 컴포넌트를 컨테이너에 올려야 한다.
		// 2-1. North-1 컨테이너에 올라갈 컴포넌트를 추가해 주자.
		container1.add(jl1); container1.add(name);
		
		// 2-2. North-2 컨테이너에 올라갈 컴포넌트를 추가해 주자.
		container2.add(jl2); container2.add(kor);
		container2.add(jl3); container2.add(eng);
		container2.add(jl4); container2.add(mat);
		
		// 2-3. South 컨테이너에 올라갈 컴포넌트를 추가해 주자.
		container3.add(result);
		container3.add(exit); container3.add(cancel);
		
		
		// 새로운 컨테이너 하나를 만들어 주자.
		JPanel group = new JPanel(new BorderLayout());
		
		group.add(container2, BorderLayout.NORTH);
		group.add(jsp, BorderLayout.CENTER);
		group.add(container3, BorderLayout.SOUTH);
		
		
		// 3. 컨테이너를 프레임에 올려주어야 한다.
		add(container1, BorderLayout.NORTH);
		add(group, BorderLayout.CENTER);
		
		
		setBounds(200, 200, 300, 300);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		
		new Ex24();

	}

}