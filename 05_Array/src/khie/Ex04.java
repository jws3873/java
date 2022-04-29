package khie;
// 2. 배열의 초기값을 이용하여 배열 생성.
public class Ex04 {

	public static void main(String[] args) {
		//배열을 생성함과 동시에 초기값 설정
		int[] arr = {10,20,30,40,50};
		
		for(int i = 0; i<arr.length;i++) {
			System.out.println("arr["+i+"] >>>"+arr[i]);
		}
		
		for(int arrprint :arr) {
			System.out.println(arrprint);
			
		}
		/*
		 * for문을 단축시킨 반복문 ==>단축 for문(개선된 for문)
		 * -java jdk 1.5버전부터 추가된 기능
		 * -주로 배열의 요소(원소, 값)를 처리(출력) 할때 사용함.
		 * 형식)
		 * for(자료형 변수명: 배열명){
		 * 반복실행문
		 * }
		 * 
		 * 실행방법
		 * -배열의 첫번째 인덱스[0]에 있는 데터를 좌변의 변수명에
		 * 할당하여 출력을 해 줌.
		 * -데이터 수 만큼 자동으로 반복하여 출력함.
		 * 
		 * 주의)
		 * - 우변의 배열명의 자료형과 좌변의 변수명의 자료형은 
		 * 반드시 일치해야 함.
		 * -만약 일치하지 않으면 error발생.
		 */
	}

}
