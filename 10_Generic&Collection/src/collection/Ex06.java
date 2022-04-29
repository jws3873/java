package collection;

import java.util.Stack;

/*
 * stack 클래스(자료구조)
 * -후입선출(LIFO : Last In First Out) 구조.
 * 
 */
public class Ex06 {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		
		//1.push(): stack에 저장시키는 메서드.
		
		stack.push("김강찬"); // 제네릭으로 선언한 내용이 들어가야 한다.
		stack.push("세종대왕");
		stack.push("김 구");
		stack.push("윤봉길");
		stack.push("홍범도");
		
		//2. stack에 저장된 데이터를 가져오는 메서드
		// ==>peek() :  stack의 맨 위(마지막) 에 입력된 데이터를 가져오는 메서드
		//- 가져온 데이터를 stack에서 제거하지 않음.
		System.out.println("stack peek() : "+stack.peek());
		System.out.println();
		
		//3. stack에 저장된 데이터를 가져오는 메서드
		// ==> pop() stack의 맨 위(마지막) 에 입력된 데이터를 가져오는 메서드
		//- 가져온 데이터를 stack에서 제거함.
		while(!(stack.isEmpty())) {
			System.out.println("이름 : "+stack.pop());
			
		}
		

		
	}

}
