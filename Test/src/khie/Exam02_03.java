package khie;

public class Exam02_03 {

	public static void main(String[] args) {
		char star = '*';
		
		for(int i =1;i<=6;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(star);
			}
			System.out.println();
		}
		for(int i =6;i>=1;i--) {
			for(int j = 1;j<=i;j++) {
				System.out.print(star);
			}
			System.out.println();
		}
	}

}
