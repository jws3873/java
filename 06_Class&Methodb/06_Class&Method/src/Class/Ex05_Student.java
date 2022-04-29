package Class;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex05_Student {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hakbun = 
			Integer.parseInt(JOptionPane.showInputDialog("학번 입력"));
		
		String name = JOptionPane.showInputDialog("이름 입력");
		
		String major = JOptionPane.showInputDialog("학과 입력");
		
		String addr = JOptionPane.showInputDialog("주소 입력");
		
		
		Student student = 
					new Student(hakbun, name, major, addr);
		
		student.display();
		
		sc.close();

	}

}
