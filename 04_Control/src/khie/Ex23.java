package khie;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * [문제] 키보드로 입력받은 수 까지의 홀수의 합과
 * 짝수의 합을 구하여 화면에 출력해 보세요.
 * (단, while 반복문을 이용하여 처리할 것)
 */

public class Ex23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int max = sc.nextInt();
		int i = 1, oddSum = 0, evenSum =0; 
		
//		int max1 = Integer.parseInt(JOptionPane.showInputDialog("정수값을 입력하시오"));
		
		while(i<=max) {
			if((i%2)==1) {
				oddSum +=i;
			}else {
				evenSum +=i;
			}
			i++;
		}
		
		System.out.println("홀수의 합 >>> "+ oddSum);
		System.out.println("짝수의 합 >>> "+ evenSum);
		
		sc.close();
	}

}
