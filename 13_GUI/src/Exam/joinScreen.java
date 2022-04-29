package Exam;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class joinScreen extends JFrame{
	public joinScreen() {
	
		setTitle("제품관리 시스템");
		JPanel joinPanel = new JPanel();
		JLabel join = new JLabel("회원가입");
		join.setFont(new Font("휴먼편지체", Font.BOLD, 25));
		join.setForeground(new Color(5,0,153));
		joinPanel.add(join);
		
		JPanel buttonPanel = new JPanel();
		JRadioButton client = new JRadioButton("고객");
		JRadioButton manager = new JRadioButton("관리자");
		JRadioButton ETC = new JRadioButton("기타");
		buttonPanel.add(client);
		buttonPanel.add(manager);
		buttonPanel.add(ETC);
		ButtonGroup group = new ButtonGroup();
		group.add(client);
		group.add(manager);
		group.add(ETC);
		
		JPanel container1 = new JPanel(new BorderLayout());
		container1.add(joinPanel,BorderLayout.NORTH);
		container1.add(buttonPanel,BorderLayout.CENTER);
		
		
		
		JPanel container2 = new JPanel(new GridLayout(5,2));
		
		JPanel idp1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JLabel jlbid = new JLabel("아이디:",JLabel.CENTER);
		idp1.add(jlbid);
		
		JPanel idp2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JTextField jtfid = new JTextField(8);
		idp2.add(jtfid);
		container2.add(idp1); container2.add(idp2);
		
		
		JPanel pwdp1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JLabel jlbpwd = new JLabel("비밀번호:",JLabel.CENTER);
		pwdp1.add(jlbpwd);
		
		JPanel pwdp2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPasswordField jpfpwd = new JPasswordField(8);
		pwdp2.add(jpfpwd);
		container2.add(pwdp1); container2.add(pwdp2);
		
		
		JPanel np1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JLabel jlbn = new JLabel("이름:",JLabel.CENTER);
		np1.add(jlbn);
		
		JPanel np2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JTextField jtfn = new JTextField(8);
		np2.add(jtfn);
		container2.add(np1); container2.add(np2);
		
		
		JPanel pp1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JLabel jlbp = new JLabel("전화번호:",JLabel.CENTER);
		pp1.add(jlbp);
		
		JPanel pp2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JTextField jtfp = new JTextField(8);
		pp2.add(jtfp);
		container2.add(pp1); container2.add(pp2);
		
		
		JPanel btp1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JButton button1 = new JButton("회원가입");
		btp1.add(button1);
		
		JPanel btp2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JButton button2 = new JButton("취소");
		btp2.add(button2);
		container2.add(btp1); container2.add(btp2);
		
		JPanel container2r = new JPanel(new FlowLayout());
		container2r.add(container2);
		
		setLayout(new BorderLayout());
		add(container1,BorderLayout.NORTH);
		add(container2r,BorderLayout.CENTER);
		
		
		setBounds(200, 200, 300, 400);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);
		
		client.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "고객을 선택했군요");
			}
		});
		manager.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "관리자를 선택했군요");
			}
		});
		ETC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "기타를 선택했군요");
			}
		});
		
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String position = "";
				String id = jtfid.getText();
				String pwd = new String(jpfpwd.getPassword());
				String name = jtfn.getText();
				String phone = jtfp.getText();
				
				if(client.isSelected()) position = "고객";
				else if(manager.isSelected()) position = "관리자";
				else if(ETC.isSelected()) position = "기타";
				JOptionPane.showMessageDialog(null,
						id+pwd+pwd+name+phone+position);
			}
		});
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new LoginScreen();
				dispose();
			}
		});
	}
}
