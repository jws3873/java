package util;
import java.util.Calendar;
/*
 * 3. calendar 클래스
 * -날짜 / 시간과 관련된 정보를 제공해 주는 클래스.
 * -Calendar 클래스는 추상클래스임.
 * -추상클래스로 작성된 이유 : 날짜와 시간을 계산하는 방법이 지역, 나라마다 다르기 때문임.
 * -Calendar 클래스에는 날짜와 시간을 계산하는데 꼭 필요한
 * 메서드나 상수로 구성이 되어 있음.
 * -추상클래스이지만 getInstance() 메서드를 이용하여 
 * Calendar 클래스는 추상 클래스이므로 객체를 직접 생성할 수는 없지만, getInstance() 메소드를 이용하여 시스템의 날짜와 시간 정보를 표현할 수 있다
 * 시스템의 날짜와 시간 정보를 표현할 수 있음.
 * 싱글톤(Singleton) 패턴의 정의는 단순하다. 객체의 인스턴스가 오직 1개만 생성되는 패턴을 의미한다.
 * -getInstance(): 싱글턴 방식. 하나의 인스턴스만을 가지고 공유해서 사용할 때 쓰는 방식
 * 싱글톤을 사용하는 이유는 메모리와 클래스간에 정보공유를 위해 사용한다.
 */

public class Ex03 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); //반환이 클래스타입으로 반환된다.
		//Calendar.get(int field); Calendar 인스턴스에 저장된 정보 중 상수를 전달하여 원하는 값을 반환하는 메소드다.
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);// 현재 일
		int week = cal.get(Calendar.WEEK_OF_YEAR); //1년 52주 중에 몇번째 주인지
		
		System.out.println("현재 년도 >>> "+year+"년");
		System.out.println("현재 월 >>> "+month+"월");
		System.out.println("현재 일 >>> "+day+"일");
		System.out.println("현재 주 >>> 52주 중에 "+week+"주");
		
		System.out.println();
		
		//시간과 관련된 정보를 확인하는 방법
		//1. 12시간제를 이용하는 방법
		int am_pm = cal.get(Calendar.AM_PM);
		int hour = cal.get(Calendar.HOUR); // 몇시
		int minute = cal.get(Calendar.MINUTE); //몇분
		int second = cal.get(Calendar.SECOND); // 몇초
		
		if(am_pm == 0) {
			System.out.println
			("현재 시간은 오전"+hour+"시"+minute+"분"+second+"초 입니다.");
		}else {
			System.out.println
			("현재 시간은 오후"+hour+"시"+minute+"분"+second+"초 입니다.");
		}
		//2. 24시간제를 이용하는 방법
		int hours = cal.get(Calendar.HOUR_OF_DAY);
		System.out.println
		("현재 시간은 오후"+hours+"시"+minute+"분"+second+"초 입니다.");
		
		
		
	
	
		
		
	
		

	
	}

}
