package khie;

/*
 * [문제] 이름과 국어점수, 영어, 자바점수를
 * 		키보드로 입력을 받아서 성적을 처리해 보자.
 * 		총점, 평균까지 출력해 보자.
 */

public class Exam_01 {

	public static void main(String[] args) {
		//1. 키보드로 이름, 국어, 영어, 수학, 자바점수를 입력을 받자.
		
		String name = args[0];
		int kor = Integer.parseInt(args[1]);
		int eng = Integer.parseInt(args[2]);
		int math = Integer.parseInt(args[3]);
		int java = Integer.parseInt(args[4]);
		int total = kor+eng+math+java;
		double average = (double)total/4;
		
		System.out.println("이름 : "+ name);
		System.out.println("국어점수 : "+ kor);
		System.out.println("영어점수 : "+ eng);
		System.out.println("수학점수 : "+ math);
		System.out.println("자바점수 : "+ java);
		System.out.println("총점 : "+ total);
		System.out.printf("평균 : %.2f\n", average);
	}

}
