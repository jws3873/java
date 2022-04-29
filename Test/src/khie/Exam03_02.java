package khie;

import java.util.Scanner;

public class Exam03_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 숫자를 입력하세요");
		int[] arr= new int[5];
		
		for(int i =0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int temp;
		for(int i =0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		sc.close();
	}

}
