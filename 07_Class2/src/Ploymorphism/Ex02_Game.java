package Ploymorphism;

import java.util.Scanner;

public class Ex02_Game {

	public static void main(String[] args) {
//		OverWatch mei = new Mei();
//		OverWatch Gengi = new Gengi();
//		OverWatch mccree = new Mccree();
		
		Scanner sc = new Scanner(System.in);
		OverWatch watch = null;
		
		System.out.print
		("플래이 할 캐릭터 선택 (1.메이/ 2.겐지/ 3/매크리) : ");
		
		int bunho = sc.nextInt();
		
		if(bunho == 1) {
			watch = new Mei();
		}else if(bunho == 2) {
			watch = new Gengi();
		}else if(bunho == 3) {
			watch = new Mccree();
		}
		watch.leftClick();
		watch.rightClick();
		watch.shiftButton();
		watch.eButton();
		watch.qButton();
		
		sc.close();
		
	}

}
