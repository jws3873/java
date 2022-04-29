package khie;


import java.util.*;

public class Ex06 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		Scanner sc = new Scanner(System.in);
		int su=0;
		Exception e = null;
		try {
		su = sc.nextInt();
		}catch(InputMismatchException ie) {
			System.out.println("입력받은 값이 정수가 아닙니다.");
			System.out.println("예외 정보 "+ie);
			e = (Exception)ie; 
			ie.printStackTrace();
		}finally {
			//입출력과 관련된 데이터를 처리하는 코드
			sc.close();
		}
		if(e == null) {
		System.out.println("입력받은 수 >>> "+su);
		}
		System.out.println("프로그램 종료");
		
	}

}
