package Exam09;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercise9_6 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		if(input != null) {
		String[] num = input.split(" ");
		int with = Integer.parseInt(num[0]);
		int height = Integer.parseInt(num[1]);
		
		String area = String.format("%.1f", (double)(with*height)/2);
		
		System.out.print(area);
		}
	}

}
