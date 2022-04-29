package khie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * 파일 복사
 * - Koala.jpg : 원본 이미지 파일
 * - Copeid.jpg : 복사 이미지 파일
 */

public class Ex08 {
	
	public static void main(String[] args) throws Exception {
		
		// 원본 이미지 파일
		FileInputStream fis = 
				new FileInputStream("C:/test/Koala.jpg");// 역슬래쉬 두개 또는 슬래쉬 이며 복사하는 경우 역슬래쉬 두개이다.
		
		//원본 이미지 파일이 복사되어서 저장될 파일
		FileOutputStream fos = 
				new FileOutputStream("C:/test/Copied.jpg");
		
		int readbyte;
		
		while(true) {
			readbyte = fis.read();
			
			if(readbyte==-1) break;
			
			fos.write(readbyte);
		}
		
		
		//입출력 객체 닫기
		fos.close();
		fis.close();
		System.out.println("복사완료");
	}
}
