package khie;

import java.util.Scanner;

/*
 * [문제] 배열의 5개의 정수를 키보드로 입력받아서
 * 저장한 후 저장된 5개의 정수를 화면에 출력해 보세요
 */
public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1. 배열 선언 및 배열 메모리 생성.
		int[] arr = new int[5];
		int max= 0,temp = 0;
		//2. 배열의 초기화 작업
		// ==> 5개의 정수를 키보들 입력을 받아서 배열에 저장.
		for(int i =0;i<arr.length;i++) {
			System.out.print((i+1)+"번째 정수를 입력하시오.");
			arr[i]=sc.nextInt();
			temp = arr[i];
			if(temp>max) max = temp;
		}
		System.out.println();
		
		//3. 배열에 저장된 5개의 데이터를 화면에 출력해 보자.
		for(int i =0;i<arr.length;i++) {
			System.out.println((i+1)+"번째 정수 >>> "+arr[i]);
		}
		System.out.println("가장 큰 수는 "+max+"입니다.");
		sc.close();
	}

}
