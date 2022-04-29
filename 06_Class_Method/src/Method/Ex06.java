package Method;

public class Ex06 {
	public static void change(int[] array) {
		array[0] = 100;
		array[1] = 100;
		array[2] = 100;
		System.out.println("array주소값 >>"+array);
	}
	public static void main(String[] args) {
		
		//2. call by reference 방식
		int[] arr = new int[] {10,20,30};
		
		System.out.println("change() 메서드 호출 전");
		System.out.println("arr주소값 >>"+arr);
		
		for(int i =0; i<arr.length;i++) {
			System.out.println("arr["+i+"]>>>"+arr[i]);
		}
		
		change(arr);
		
		System.out.println("change() 메서드 호출 후");
		
		for(int i =0; i<arr.length;i++) {
			System.out.println("arr["+i+"]>>>"+arr[i]);
		}
		
	}

}
