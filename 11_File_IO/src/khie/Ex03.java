package khie;

import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {

		System.out.print("한 줄을 입력하세요.......");
		int num;
		try {
			while(true) {
				num = System.in.read();
				if(num=='\n') {
					break;
				}
				System.out.println((char)num);
			} //while문의 end
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
