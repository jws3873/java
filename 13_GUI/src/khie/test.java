package khie;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;




public class test extends JFrame  {
	public test() {
		setTitle("test");
		
		
		JPanel containerGroup = new JPanel(new FlowLayout());
		
		JPanel container1 = new JPanel();
		JLabel jlb1 = new JLabel("test1");
		JTextField jtf1 = new JTextField(10);
		container1.add(jlb1); container1.add(jtf1);
		
		
		JPanel container2 = new JPanel();
		JLabel jlb2 = new JLabel("test2");
		JTextField jtf2 = new JTextField(10);
		container2.add(jlb2); container2.add(jtf2);
		
		JPanel container3 = new JPanel();
		JLabel jlb3 = new JLabel("test3");
		JTextField jtf3 = new JTextField(10);
		container3.add(jlb3); container3.add(jtf3);
		
		JPanel container4 = new JPanel();
		JLabel jlb4 = new JLabel("test4");
		JTextField jtf4 = new JTextField(10);
		container4.add(jlb4); container4.add(jtf4);
		
		JPanel container5 = new JPanel();
		JLabel jlb5 = new JLabel("test5");
		JTextField jtf5 = new JTextField(10);
		container5.add(jlb5); container5.add(jtf5);
		
		JPanel container6 = new JPanel();
		JLabel jlb6 = new JLabel("test6");
		JTextField jtf6 = new JTextField(10);
		container6.add(jlb6); container6.add(jtf6);
		
		
		containerGroup.setPreferredSize(new Dimension(200, 180));
		containerGroup.add(container1);
		containerGroup.add(container2);
		containerGroup.add(container3);
		containerGroup.add(container4);
		containerGroup.add(container5);
		containerGroup.add(container6);
		
	

		
		
		
		JScrollPane jsp = new JScrollPane(
				containerGroup,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		add(jsp);
	
		
		setBounds(200,200,200,200);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
				
				
	}
	
	public static void main(String args[]) {

		new test();


	}

}