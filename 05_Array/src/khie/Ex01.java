package khie;

/*
 * 배열(Array)?
 * - 하나의 이름으로 동일한 자료형의 데이터를 여러 개 연속적으로 저장할 수 있는 
 * 메모리 공간을 할당을 받는 것을 말함.
 * - 변수는 하나의 값만을 저장하지만, 배열은 여러개의 값을
 * 저장할 수 있음. - 같은 자료형의 데이터들이 순차적으로 저장됨.
 * - 배열은 선언과 동시에 저장할 수 있는 자료형의 타입이 결정 됨.
 * 만약 다른 자료형의 데이터를 저장하려면 타입 불일치 컴파일 오류가 발생함.
 * - 배열의 방의 이름은 0이라는 인덱스부터 시작함.
 * - 배열의 단점 : 배열은 한 번 크기가 정해지면 크기를 늘리거나 줄일 수 없음.
 * 
 * [배열을 사용하는 방법]
 * - 1단계 : 배열 선언(형식) 자료형[] 배열명(배열이름), 자료형 배열명[])
 * - 2단계 : 배열 메모리 생성 (메모리 할당 : 배열명 = new 자료형[배열의 크기])
 * - 3단계 : 배열 초기화(할당된 메모리 영역에 데이터를 저장)
 * - 4단계 : 배열을 이용(데이터 처리- 연산, 출력 등)
 * 
 * [배열을 생성하는 방법 - 2가지]
 * 1. new 키워드를 사용하여 배열 생성.
 * 2. 배열의 초기값을 이용하여 배열생성.
 */
public class Ex01 {

	public static void main(String[] args) {
		int[] Array1;
		Array1 = new int[1];
		int Array2[] = {1,2,3};
		int[] Array3;
		Array3 = new int[] {};
		
		//1단계 : 배열 선언(형식) 자료형[] 배열명(배열이름), 자료형 배열명[])
		//int[] arr;
		//2단계 : 배열 메모리 생성 (메모리 할당 : 배열명 = new 자료형[배열의 크기])
		//arr = new int[5]; // 이후 heap메모리에 배열의 공간을 5개를 만들어 준다. 각각의 공간이 int 4byte total 20byte
						  // 변수에는 주소값이 저장된다.
		// 1단계 + 2단계 : 배열선언 및 배열 메모리 생성
		//3단계 : 배열 초기화(할당된 메모리 영역에 데이터를 저장)
		int[] arr = new int[5];
		int[] arr2 = new int[] {10,20,30,40,50};
		int[] arr3 = {10,20,30,40,50};
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		arr[2] +=100;
		int[] arr4;
		
		//배열의 주소를 복사
		arr4=arr;
		
		System.out.println(arr);
		// 4단계 : 배열 출력
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		System.out.println();
		
		// 반복문을 이용하여 배열을 출력해 보자.
		for(int i = 0;i<arr.length;i++) {
			System.out.printf("arr[%d] >>> %3d%n",i,arr[i]);
		}
		System.out.println();
		System.out.println();
		for(int i = 0;i<arr4.length;i++) {
			System.out.printf("arr[%d] >>> %3d%n",i,arr4[i]);
		}
		
	}

}
