package javajungseok;

public class Exercise6_17 {
	public static int[] shuffle(int[] Array){
		if(Array == null||Array.length == 0) {
			return Array;
		}
		for(int i =0;i<Array.length;i++) {
			int randum = (int)(Math.random()*Array.length);
			int temp = Array[i];
			Array[i] = Array[randum];
			Array[randum] = temp;
		}
		return Array;
	}
	public static void main(String[] args) {
		
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
}

}
