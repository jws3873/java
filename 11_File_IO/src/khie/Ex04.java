package khie;

import java.io.InputStreamReader;

/*
 * java 스트림의 종류
 * 1. 바이트 스트림 관련 클래스
 * -바이트 스트림 방식으로 데이터를 입출력하는 클래스.
 * ==> xxxInputStram / xxxOutputStream
 * 2. 문자 스트림관련 클래스
 * -문자 스트림 방식으로 데이터를 입출력하는 클래스.
 * ==> xxxReader(문자로 데이터를 입력)/xxxWriter(문자스트림 방식으로 데이터를 출력)
 * 3. 바이트 스트림 -> 문자 스트림으로 변환 관련 클래스
 * ==> 바이트는 1바이트 문자는 2바이트 1바이트를 2바이트로 읽어 또는 출력
 * ==> InputStreamReader/ OutputStreamWriter
 */
public class Ex04 {

	public static void main(String[] args) {
		
		System.out.println("입력 후 끝 이라고 입력하세요......");
		InputStreamReader isr = new InputStreamReader(System.in);//바이트를 문자스트림 방식으로 읽어오는것
		
		int readbyte;
		
		try {
			while(true) {
				readbyte = isr.read();
				if(readbyte =='끝') {
					break;
				}
				System.out.print(readbyte);
				System.out.print((char)readbyte);
			}
			//입출력 스트림을 닫아 주는 것이 좋다.
			isr.close();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		
	}

}
