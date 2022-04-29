package Class;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex05_Student {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("학번, 이름, 학과, 주소를 입력하세요....");
//		Student s = new Student(sc.nextInt(),sc.next(),sc.next(),sc.next());
		int h = Integer.parseInt(JOptionPane.showInputDialog("학번 입력"));
		String name = JOptionPane.showInputDialog("학생이름");
		String major = JOptionPane.showInputDialog("학생 학과");
		String addr = JOptionPane.showInputDialog("학생 주소");
		Student s = new Student(h,name,major,addr);
		s.display();
		sc.close();
	}
	

}
