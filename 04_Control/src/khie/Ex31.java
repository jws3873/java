package khie;

// 다중 for문을 이용하여 구구단을 화면에 출력해 보자.

public class Ex31 {

	public static void main(String[] args) {
//		for(int i = 2; i <= 9; i++) {
//			for(int j = 1; j <= 9; j++) {
//				System.out.printf("%d*%d = %2d%n",i,j,(i*j));
//			}
//			System.out.println();
//		}
//		System.out.println();
//		System.out.println();
//		for(int i = 1; i <= 9; i++) {
//			for(int j = 2; j <= 9; j++) {
//				System.out.printf("%d*%d = %2d\t",j,i,(i*j));
//			}
//			System.out.println();
//		}
		for(int k =2;k<=9;k++) {
			System.out.printf("***"+k+"단***\t");
		}
		for(int i =1;i<=9;i++) {
			for(int j =2;j<=9;j++) {
				System.out.printf("%d*%d = %2d\t",j,i,(i*j));
			}
			System.out.println();
		}
		
	}

}
