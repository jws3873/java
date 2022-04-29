package khie;

public class Ex05 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		String str1 = "Korea";
		String str2 = null; // null : 값이 없는 상태 
		try {
			System.out.println("str1 문자열의 길이 >>>"+str1.length());
			System.out.println("str2 문자열의 길이 >>>"+str2.length());	
		}
		catch(NullPointerException ne) {
			System.out.println("예외발생 >>> "+ne);
		}
		
		
		System.out.println("프로그램 종료");
	}

}
