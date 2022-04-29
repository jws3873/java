package Class;

/*
 * 클래스 (class) 와 객체(Object)
 * -클래스 : 객체를 정의해 놓은 것(추상화).
 * -객체 클래스에 의해 만들어진 결과물 (실체화).
 * 예) 제품설계도(클래스) ==> 제품(객체)
 * -인스턴스화 : 클래스를 이용하여 객체를 만들어 가는 과정.
 * -클래스(1): 객체(N)
 */


public class Ex02_Tv {
	// 멤버변수
	String color; //tv색상
	boolean power; //tv전원
	int  channel; //tv 채널
	Ex02_Tv(){}
	Ex02_Tv(String c,boolean p,int ch){
		color = c;
		power = p;
		channel = ch;
	}
	
	// 멤버 메서드
	void power() { //tv전원을 누르는 메서드. boolean type의 기본값은 false이다.
		power = !power;
	}
	void channeUp() { //TV channel을 올리는 메서드
		if(power) {
			channel++; //channel을 하나 증가
		}
	}
	void channelDown() { //TV 채널을 내리는 메서드
		if(power) {
			channel--; // 채널 하나 감소
		}
	}
	void dispaly() {
		String status = "";
		if(power) {
			status = "전원 On";
		}else {
			status = "전원 Off";
		}
		System.out.println("TV 색상 >>> "+color);
		System.out.println("TV 전원 >>> "+status);
		System.out.println("TV 채널 >>> "+channel);
	}
	
	public static void main(String[] args) {
		
		//1단계 + 2단계: 클래스 선언 및 클래스 객체 생성
		Ex02_Tv tv =new Ex02_Tv();
		tv.dispaly();
		System.out.println();
		
		tv.color="검정색";
		tv.channel = 7;
		tv.channeUp();
		tv.dispaly();
		System.out.println();
		
		//TV작동
		tv.power();
		tv.channeUp();
		tv.dispaly();
		System.out.println();
	
		/*
		 * [문제] TV 객체를 만들 되 tv1이라는 참조변수를 이용하여 
		 * 객체를 만들어 아래와 같이 정보를 변경하세요.
		 * 조건1) 색상: 흰색, 전원:off, 채널:15
		 * 조건2) tv1정보를 화면에 출력 - display()메서드 호출
		 * 조건3) tv1정보를 다음과 같이 변경하여 화면에 출력해 보세요.
		 * 색상: 흰색, 전원:On, 채널:28
		 */
		

//		Ex02_Tv tv1=new Ex02_Tv("흰색",true,28);
//		tv1.dispaly(); //조건2
//		System.out.println();
		
		Ex02_Tv tv1=new Ex02_Tv();
		tv1.color="흰색"; //조건3
		tv1.power();
		for(int i=tv1.channel;i<28;i++) {
		tv1.channeUp();	
		}
		tv1.dispaly(); //조건3
		System.out.println();
		
		/*
		 * [문제2] TV객체를 만들되, tv2라는 참조변수를 이용하여
		 * 객체를 만들어 아래와 같이 정보를 변경하세요.
		 * 조건1) 색상:흰색, 전원:off, 채널:32
		 * 조건2)tv2정보를 화면에 출력
		 * 조건3)tv2정보를 다음과 같이 변경하여 화면에 출력하세요.
		 * 색상:검정색, 전원:on,채널11
		 */
		
		Ex02_Tv tv2=new Ex02_Tv();
		
		tv2.color="흰색";
		tv2.power();
		for(int i=tv2.channel;i<32;i++) {
			tv2.channeUp();	
		}
		tv2.power();
		tv2.dispaly();
		System.out.println();
		
		tv2.color="검정색";
		tv2.power();
		for(int i =tv2.channel;i>11;i--) {
			tv2.channelDown();
		}
		tv2.dispaly();
		System.out.println();
		
	}

}
