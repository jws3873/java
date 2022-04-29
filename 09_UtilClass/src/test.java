import java.util.Calendar;

public class test {
	
	public static void main(String[] args) {
	
		Calendar car = Calendar.getInstance();
		
		int year = car.get(Calendar.YEAR);
		int month = car.get(Calendar.MONTH)+1;
		int day = car.get(Calendar.DATE);
		int week = car.get(Calendar.WEEK_OF_YEAR);
		
		System.out.println("현재 년도 : "+year+"년");
		System.out.println("현재 월 : "+month+"월");
		System.out.println("현재 일 : "+day+"일");
		System.out.println("현재 주 : "+week+"주");
		
		int am_pm = car.get(Calendar.AM_PM);
		int hour1 = car.get(Calendar.HOUR);
		int hour2 = car.get(Calendar.HOUR_OF_DAY);
		int minute = car.get(Calendar.MINUTE);
		int second = car.get(Calendar.SECOND);
		
		if (am_pm == 0) {
			System.out.println("현재 시간은 오전"+hour1+"시"+minute+"분"+second+"초 입니다.");
		}else {
			System.out.println("현재 시간은 오후"+hour1+"시"+minute+"분"+second+"초 입니다.");
		}
		System.out.println("현재 시간은 오후"+hour2+"시"+minute+"분"+second+"초 입니다.");
		
		
		
	}
	
}
