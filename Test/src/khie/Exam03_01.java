package khie;

import java.util.Scanner;

public class Exam03_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("배열 크기:");
		int[] arr =new int[sc.nextInt()];
		int max =0,min = 0;
		for(int i =0;i<arr.length;i++) {
			System.out.print((i+1)+" 번째 값 입력 : ");
			arr[i] = sc.nextInt();
			min=arr[i];
		}
		for(int i =0;i<arr.length;i++) {
			if(max<arr[i]) {max=arr[i];}
			if(min>arr[i]) {min=arr[i];}
		}

		System.out.println("max : "+max+", min : "+min);
		sc.close();
	}


}