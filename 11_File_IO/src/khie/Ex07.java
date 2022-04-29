package khie;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * 1. FileInputStream/FileOutputStream 바이트기반 스트림
 * - 1바이트 단위로 파일을 처리하는 바이트 기반 입출력 파일스트림
 * - 그림(이미지), 오디오파일, 비디오 파일 등 모든 종류의 파일 처리가 가능.
 * - 한글이 들어가지 않으면 그냥 사용해도 무방하나 한글은 1바이트로 처리가 불가능하핟.
 * 
 * 2. FileReader/FileWriter 문자기반 스트림
 * - 2바이트 단위로 파일을 처리하는 문자기반 입출력 파일 스트림
 * - 문자 단위로 처리를 하기 때문에 그림, 오디오 파일들을 처리가 불가능
 */
public class Ex07 {

	public static void main(String[] args) throws Exception {
		
		long start,end;
		//1. 바이트 스트림만을 이용하여 데이터를(이미지파일) 읽어오기
		FileInputStream fis = 
		new FileInputStream("C:/test/Koala.jpg");
		start = System.nanoTime();
		
		while(fis.read()!=-1) {} // time을 확인하기 위해 읽기만
		
		end = System.nanoTime();
		
		System.out.println("바이트 스트림을 이용한 경우 >>>"+(end-start)+"nanotime");
		
		fis.close();
		
		//2. 바이트 스트림에 보조스트림을 이용하여 데이터(이미지파일)를 읽어보는 방법 
		FileInputStream fis1 = new FileInputStream("C:/test/Koala.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis1);
		start = System.nanoTime();
		
		while(bis.read()!=-1) { } // time을 확인하기 위해 읽기만
		
		end = System.nanoTime();
		
		System.out.println("보조 스트림을 이용한 경우 >>>"+(end-start)+"nanotime");
		
		bis.close();
		fis1.close();
		
		//소스코드 확인
	
	}

}
