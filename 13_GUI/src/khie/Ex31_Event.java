package khie;

import java.awt.event.*;

import javax.swing.*;

public class Ex31_Event extends JFrame{
	public Ex31_Event() {
		setTitle("글자 이동 이벤트");
		
		
		JPanel container = new JPanel();
		//컴포넌트를 만들어 보자.
		JLabel label = new JLabel("JAVA");
		
		//2.컴포넌트를 컨테이너에 올려야 한다.
		container.add(label);
		
		//3. 컨테이너를 프레임에 올려야 한다.
		add(container);
		
		setBounds(200,200,1000,500);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
		//4. 이벤트 처리
		//원래는이벤트 컴포넌트에서 이벤트가 발생한다.
//		container 에서 특정 영역에 마우스를 클릭시 이벤트 발생.
		container.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX(); //마우스 버튼이 눌려질 때의 x좌표값
				int y = e.getY(); //마우스 버튼이 눌려질 때의 y좌표값
				//라벨 컴포넌트의 위치를 (x,y)로 이동
				label.setLocation(x,y);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}

	public static void main(String[] args) {
		new Ex31_Event();
	}

}
