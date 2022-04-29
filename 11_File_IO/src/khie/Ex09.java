package khie;

import java.io.File;
import java.io.IOException;

/*
 * File클래스
 * - 파일 및 디렉터리 (폴더) 를 만들어 주는 클래스
 * - 파일 입출력 시에 사용됨,
 * - 파일 디렉토리에 대한 경로명, 크기, 타입, 수정날짜 등의 속성을 제공함
 *  또한 파일 삭제, 디렉토리 생성, 파일이름 변경, 디렉토리 내의 파일 리스트
 *  제공 등 다양한 파일 관리 작업을 지원함.
 */
public class Ex09 {

	public static void main(String[] args) throws IOException {

		// C:/test 폴더가 있습니다.
		// C:/test/sample 폴더를 만들어 보자. java를 이용하여 파일을 만들어보는것
		// C:/test/sample/sample.txt 파일을 만들어보자
		
		//1.C:/test/sample 폴더를 만들어 보자.
		File dir = new File("C:/test/sample");
		
		if(!dir.exists()) {//C:/test/sample 폴더가 없다면
			dir.mkdir();	// 실제로 폴더를 만들어 주는 메서드
		}
		System.out.println("폴더 생성 완료!!!");
		
		// 2. C:/test/sample/sample.txt 파일을 만들어보자.
		//형식) new File(폴더경로,"파일명");
		File file = new File(dir,"sample.txt");//(폴더명, 파일명)
		if(!file.exists()) {
			file.createNewFile();
		}
		System.out.println("파일 생성 완료!!!");
		
	}

}
