package khie;

import java.util.Scanner;

public class Exam03_03 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 수를 입력하세요. : ");
		String[] name = new String[sc.nextInt()];
		int[] kor = new int[name.length];
		int[] eng = new int[name.length];
		int[] math = new int[name.length];
		int[] total = new int[name.length];
		double[] avg = new double[name.length];
		String[] grade = new String[name.length];
		int[] rank = new int[name.length];
		
		for(int i =0; i<name.length;i++) {
			System.out.print("이름 입력 : ");
			name[i] = sc.next();
			System.out.print("국어점수 입력 : ");
			kor[i] = sc.nextInt();
			System.out.print("영어점수 입력 : ");
			eng[i] = sc.nextInt();
			System.out.print("수학점수 입력 : ");
			math[i] = sc.nextInt();
			
			total[i] = kor[i]+eng[i]+math[i];
			avg[i] = total[i]/3.0;
			
			if(avg[i]>=90) grade[i] = "A학점";
			else if(avg[i]>=80) grade[i] = "B학점";
			else if(avg[i]>=70) grade[i] = "C학점";
			else if(avg[i]>=60) grade[i] = "D학점";
			else grade[i] ="F학점";
			rank[i] = 1;
		}
		for(int i =0;i<name.length;i++) {
			for(int j =i+1;j<name.length;j++) {
				if(total[i]<total[j]) {
					rank[i]++;
				}
			}
		}
		
			System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::");
		for(int i =0;i<name.length;i++) {
			System.out.print("이름 : "+name[i]+"점\t");
			System.out.print("총점 : "+total[i]+"\t");
			System.out.printf("평균 : %.2f점\t",avg[i]);
			System.out.print("학점 : "+grade[i]+"\t");
			System.out.print("순위 : "+rank[i]+"등\t");
			System.out.println();
		}
		sc.close();

	}

}
