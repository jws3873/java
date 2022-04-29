package khie;

public class Exam03_04 {

	public static void main(String[] args) {
		int sum=1;
		for(int i =1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.printf("%2d\t",sum);
				sum++;
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		int num = 1;
		int[][] arr = new int[5][5];
		for(int i =0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				arr[i][j] = num;
				num+=1;
				System.out.printf("%2d\t",arr[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
