package khie;

/*
 * 키보드로 두 수를 입력받아서 그 중에
 * 큰 정수를 화면에 출력해 보세요
 */

import javax.swing.JOptionPane;

public class Ex08 {

	public static void main(String[] args) {

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("첫번째 정수를 입력하시오"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("첫번째 정수를 입력하시오"));
		int max,min;
		if(num1>num2) {
			max = num1;
			min = num2;
		}

		else {
			max = num2;
			min = num1;
		}
		System.out.println("최대값은 "+max+" 입니다.");
		System.out.println("최소값은 "+min+" 입니다.");
		
	}

}
