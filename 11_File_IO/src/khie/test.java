package khie;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
// FileInputStream,FileOutputStream  파일 자체를 읽을 수 있으며 1바이트로 이동시켜 사진등을 옮길 수 있다. 파일 내용도 읽기 가능
// FileReader,FileWriter 2바이트씩 이동시켜 사진등을 옮길 수는 없으나 2바이트로 읽을 수 있어 한글등의 글자를 옮길 수 있다.
// FileWriter로 글자 입력 후 FileReader읽기 가능
public class test {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		System.out.println("한줄 문자열을 입력하세요.1");
	
		try {
			int readbyte;
			while(true) {
				readbyte=isr.read();
				if(readbyte=='\n') break;
				System.out.print((char)readbyte);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		InputStreamReader isr2 = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr2);
		System.out.println("한줄 문자열을 입력하세요.2");
		String str = br.readLine();
		
		System.out.println(str);
		
		Scanner sc = new Scanner(System.in);
		sc.next();

	}	
}

