package Exam09;

public class Exercise9_3 {

	public static int count(String sec,String target) {
		int count = 0;
		int pos = 0;
		
		while(true) {
			int i = sec.indexOf(target, pos);
			
			if(i<0) break;
			count+=1;
			pos =i+target.length();
		}

		return count;
		
	}
	public static void main(String[] args) {

		System.out.println(count("12345AB12AB345AB","AB"));
		System.out.println(count("12345","AB"));

	}

}
