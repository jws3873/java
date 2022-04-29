package khie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Ex02 {

	public static void main(String[] args) throws Exception {
		
		InputStream is = new FileInputStream("C:/test/test2.txt");
		
		int readByte;
		byte[] bytes = new byte[3];
		
		String data = "";
		System.out.println(is.available());
		
		while(true) {
			readByte = is.read(bytes); // 입력 스트림으로부터 읽은 바이트들을 매개값으로  주어진 바이트 배열 bytes에 저장, 실제 읽은 바이트 수 리턴
			if(readByte ==-1) {
				break;
			}
			
			data += new String(bytes, 0, readByte);
			System.out.println(data);
		}
		System.out.println(data);
		is.close();//사용한 시스템 자원을 반납하고 입력 스트림 닫음
		
		System.out.println();
		System.out.println();
		

		
	}

}
