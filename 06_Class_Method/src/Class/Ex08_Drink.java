package Class;

import java.util.Scanner;

public class Ex08_Drink {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("자판기 음료갯수를 입력하세요 : ");
		
		Drink[] d = new Drink[sc.nextInt()];
		System.out.println("Drinks >> "+d);
		
//		Drink d1 = new Drink("콜라",1000);

//		System.out.println(d1);

		for(int i = 0;i<d.length;i++) {
			System.out.print((i+1)+"번째 음료의 이름과 가격을 입력하세요 : ");
			d[i] = new Drink();
			d[i].name = sc.next();
			d[i].price = sc.nextInt();
//			d[i] = new Drink(sc.next(),sc.nextInt());
		}
//		System.out.println("drinks[0]>>>"+d[0]);

		System.out.print("돈을 넣어주세요. : ");
		int coin = sc.nextInt();
		//입력을 받은 coin과 객체 배열에 저장된 Drink 클래스의 멤버변수인 
		// price 가격을 비교해서 coin보다 가격이 작거나 같은 음료를 선택
		
		for(int i =0;i<d.length;i++) {
			if(coin >= d[i].price) {
				System.out.print(d[i].name+"\t");
			}
		}
		sc.close();
	
	}

}
