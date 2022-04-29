package khie;

/*
 * [문제] 키보드로부터 임의의 숫자 4개를 입력받아서
 * 각각의 화폐 매수가 몇 장이 필요한지를 코딩을 
 * 통해서  화면에 출력해 보세요.
 * 예) 8792
 */

public class Exam_04 {

	public static void main(String[] args) {
		
		//1. 키보드로부터 임의의 숫자 4개를 입력을 받자.
		int su = Integer.parseInt(args[0]);
		
		//2. 각각의 화폐단위 변수를 선언해 주자.
		int oc,c,ob,b,os,s,o,i,res;
		
		//3. 화폐매수를 계산 해 보자.
		
		oc = su / 5000; // 오천원의 몫 ==> 1
		res=su%5000; // res ==> 3792
		
		c = res / 1000; //천원의 몫  ==> 3
		res %=1000; //res =>> 792
		
		ob = res/500; // 오백원의몫 ==> 1
		res %= 500; // res 292
		
		b = res/100; //백원의 몫 ==> 2
		res %= 100; // res 92
		
		os =res/50; //오십원의 몫 =>> 1
		res %= 50; //res 42
		
		s = res/10; //십원의 몫 ==> 4
		res %= 10; //res 2
		
		o = res/ 5; // 오원의 몫==> 0
		res %=5;	//res 2
		
		i = res/1; // 일원의 몫 ==> 2
		res %=1;   // res 0
		
		//4. 화면에 출력해 보자.
		System.out.println("입력받은 숫자 : "+su);
		System.out.println("오천원 지폐 : "+oc+"장");
		System.out.println("천원 지폐 : "+c+"장");
		System.out.println("오백원 동전 : "+ob+"개");
		System.out.println("백원 동전 : "+b+"개");
		System.out.println("오십원 동전 : "+os+"개");
		System.out.println("십원 동전 : "+s+"개");
		System.out.println("오원 동전 : "+o+"개");
		System.out.println("일원 동전 : "+i+"개");
	}

}
