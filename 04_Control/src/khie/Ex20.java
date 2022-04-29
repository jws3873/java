package khie;

public class Ex20 {

	public static void main(String[] args) {
		
		// while 반복문을 이용하여 1~10까지의 합을 출력해 보자.
		int su = 1; //반복문에서의 초기식
		int sum = 0; // 1 ~ 10 까지의 합을 저장할 변수
		while(su<=100) { // 반복문에서의 조건식
			sum += su;
			su++; //반복문에서의 증감식
		}
		System.out.println("sum >>> "+sum);
	}

}
