package khie;

public class Exam_02 {

	public static void main(String[] args) {
		int su = Integer.parseInt(args[0]);
		System.out.printf("입력받은 정수 ==> %d%n",su);
		int suu = su*su;
		System.out.printf("%d의 제곱근 ==> %d%n",su,suu);
		suu *=su;
		System.out.printf("%d의 세제곱근 ==> %d%n",su,suu);
	}

}
