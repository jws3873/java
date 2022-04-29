package khie;

//1 ~ 100 까지의 홀수의 합과 짝수의 합을 구해보자.

public class Ex22 {

	public static void main(String[] args) {
		// 홀수의 합 변수, 짝수의 합 변수
		int i = 1;
		int oddSum = 0, evenSum = 0;
		while(i<=100) {
			if((i%2) == 1) {
				oddSum +=i;
			}else {
				evenSum +=i;
			}
			i++;
		}// while 반복분 end
		System.out.println("홀수의 합 >>>"+oddSum);
		System.out.println("짝수의 합 >>>"+evenSum);
		

	}

}
