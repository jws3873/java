package khie;

public class Exam03_05 {

	public static void main(String[] args) {	
		int num = 1;
		int[][] arr = new int[5][5];
		for(int i =0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				arr[i][j] = num;
				num+=1;
			}
		}
		for(int i =0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				System.out.printf("%2d\t",arr[j][i]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		for(int i =0;i<=4;i++) {
			for(int j=1;j<=25;j+=5) {
				System.out.print((i+j)+"\t");
			}
			System.out.println();
			
		}
	}

}


