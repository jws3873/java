package khie;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * - 파일 디렉토리에 대한 경로명, 크기, 타입, 수정날짜 등의 속성을 제공
 */
public class Ex11 {

	public static void main(String[] args) {
		
		File temp = new File("C:/Windows/Temp");
		
		//날자관련 클래스, 원하는 날자 형식을 맞추어 주는 클래스
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  a  HH:mm"); //날자의 월은 대문자 시간의 초는 소문자,a는 오전이냐 오휴이냐
		
		//listFiles() : 디렉토리에 포함된 파일 및 서브 디렉토리 목록
		// 전부를 확인하여 File 객체 배열로 반환해 주는 메서드.
		File[] contaents =temp.listFiles();//인자가없는 메서드는 파일 객체타입으로 반환된다.
		
		System.out.println("날짜\t\t시간\t형태\t크기\t이름");
		System.out.println("--------------------------------------------------------------");
		
		for(File file :contaents) { //단축for문
			// lastModified() : 마지막 수정 날짜 및 시간을 반환해 주는 메서드.
			System.out.print(sdf.format(new Date(file.lastModified())));
			
			if(file.isDirectory()) {
				//getName():파일의 이름을 반환해 주는 메서드.
				System.out.print("\t<DIR>\t\t"+file.getName());
			}else {
				System.out.print("\t\t"+file.length()+"\t"+file.getName());
			}
			
			System.out.println();
			
		}
	}

}
