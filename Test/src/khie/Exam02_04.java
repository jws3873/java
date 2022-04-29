package khie;

public class Exam02_04 {

	public static void main(String[] args) {
		for(char i ='Z';i>='A';i--) {
			for(char j = (int)'A';j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
