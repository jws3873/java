package Exam;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginScreen extends JFrame{
	public LoginScreen() {
		setTitle("제품관리 시스템");
		
		JPanel titlePanel = new JPanel();
		JLabel loginscreen = new JLabel("로그인 화면");
		loginscreen.setFont(new Font("휴먼편지체", Font.BOLD, 25));
		loginscreen.setForeground(new Color(5, 0, 153));
		titlePanel.add(loginscreen);
		
		JPanel container = new JPanel(new GridLayout(3,2));
		
		JPanel idp1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JLabel jlbid = new JLabel("아이디:",JLabel.CENTER);
		idp1.add(jlbid);
		JPanel idp2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JTextField jtfid = new JTextField(8);
		idp2.add(jtfid);
		
		container.add(idp1); container.add(idp2);
		
		JPanel pwdp1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JLabel jlbpwd = new JLabel("비밀번호:",JLabel.CENTER);
		pwdp1.add(jlbpwd);
		
		JPanel pwdp2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPasswordField jpfpwd = new JPasswordField(8);
		pwdp2.add(jpfpwd);
		
		container.add(pwdp1); container.add(pwdp2);
		
		JPanel btp1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JButton button1 = new JButton("로그인");
		btp1.add(button1);
		JPanel btp2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JButton button2 = new JButton("회원가입");
		btp2.add(button2);
		
		container.add(btp1); container.add(btp2);
		
		JPanel panel = new JPanel(new FlowLayout());
		panel.add(container);
		setLayout(new BorderLayout());
		
		add(titlePanel,BorderLayout.NORTH);
		add(panel,BorderLayout.CENTER);

		setBounds(200, 200, 300, 300);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);
		
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String myId = jtfid.getText();
				String mypws = new String(jpfpwd.getPassword());
				JOptionPane.showMessageDialog(null,
						"아이디:"+myId+
						",비번:"+mypws
						);
			}
		});
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new joinScreen();
				dispose();
			}
		});

	}
}
