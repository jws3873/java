package khie;

public class Exam_01 {

	public static void main(String[] args) {
		int kor = Integer.parseInt(args[0]);
		int eng = Integer.parseInt(args[1]);
		int math = Integer.parseInt(args[2]);
		int java = Integer.parseInt(args[3]);
		int total = kor+eng+math+java;
		double avg = (double)total/4;
		System.out.println("국어점수 : "+kor+"점");
		System.out.println("영어점수 : "+eng+"점");
		System.out.println("수학점수 : "+math+"점");
		System.out.println("자바점수 : "+java+"점");
		System.out.println("총 점 : "+total+"점");
		System.out.printf("평 균 : %.2f점",avg);
	}

}
