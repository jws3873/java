package khie;

import javax.swing.JOptionPane;

/*
 * 키보드로부터 입력받은 정수값을 5의 배수이면
 * " 이 정수는 5의 배수입니다." 라고 출력을 하고, 그렇지 않으면
 * " 이 정수는 5의 배수가 아닙니다." 라고 화면에 출력을 해보자.
 * 단, 입력받은 정수가 음수이면 " 음수 값이 입력되었습니다" 라고 출력해 보자.
 */

public class Ex07 {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("정수를 입력하세요"));

		if(num>0) { 
			if((num%5)==0) {
				System.out.println("이 정수는 5의 배수입니다.");
			}else { 
				System.out.println("이 정수는 5의 배수가 아닙니다.");
			}
		}else { 
				System.out.println("음수값이 입력되었습니다.");
			}
		
		
	}

}
