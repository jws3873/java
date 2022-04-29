package inheritance;

import java.util.Scanner;

public class Ex05_Remote {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Tv tv = new Tv();
		Radio radio = new Radio();
		Computer computer = new Computer();
		
		while(true) {
			System.out.print
			("1.TV/ 2.Radio/ 3.Computer / 4.종료");
			int menu = sc.nextInt();
			if(menu == 4) {
				break;
			}
			System.out.print("1. 볼류Up/ 2. 볼륨Down :");
			int volume = sc.nextInt();
			
			switch(menu) {
			case 1:// Tv를 선택
				if(volume==1) {
					tv.volumeUp();
				}else {
					tv.volumeDown();
				}
				break;
			case 2:// radio를 선택
				if(volume==1) {
					radio.volumeUp();
				}else {
					radio.volumeDown();
				}
				break;
			case 3:// computer를 선택
				if(volume==1) {
					computer.volumeUp();
				}else {
					computer.volumeDown();
				}
				break;
			} //switch~case 문 end
			System.out.println();
			System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.println("Tv Volume: "+tv.getVol()+" /Radio Volume: "+radio.getVol()+" /Computer Volume: "+computer.getVol());
			System.out.println();
		}//while문 end
		System.out.println();
		System.out.println("수고 많이 하셨습니다.~~~~");
		sc.close();
		
	}

}
