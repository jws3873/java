package khie;

public class Exam02_05 {

	public static void main(String[] args) {
		int hap = 0;
		for(int i=1;i<=100;i++) {
			if((i%2)==1) {
				hap +=i;
			}else {
				hap -=i;
			}
		}
		System.out.println("hap ==> "+hap);
	}

}
