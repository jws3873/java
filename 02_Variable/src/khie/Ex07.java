package khie;

public class Ex07 {

	public static void main(String[] args) {
		
		// 두 수를 서로 교환을 해보자.
		int su1 = 47;
		
		int su2 = 82;
		System.out.println("변경하기 전 su1:"+su1+",su2:"+su2);
		
		//방법1
//		int temp = su1;
//		su1 = su2;
//		su2 = temp;
		
		int temp = su2;
		su2 = su1;
		su1 = temp;
		
		System.out.println();
		System.out.println("변경한 후 su1:"+su1+",su2:"+su2);

	}

}
