package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 2. Set 계열의 컬렉션 프레임워크 특징
 * -자료의 순서가 없다(정렬 기능 없음. -index가 없다).
 * -중복 데이터 허용 불가.
 * -Set인터페이스의 자식클래스를 이용하여 구현.
 * ==>HashSet(o), TreeSet(x)
 */
public class Ex08 {

	public static void main(String[] args) {
		
		// Set 인터페이스의 자식 클래스를 이용하여 객체 생성.
		Set<Integer> set = new HashSet<Integer>();
		
		//1. add("값") : 원소를 추가하는 메서드.
		set.add(100);
		set.add(200);
		set.add(300); //중복
		set.add(400);
		set.add(500);
		set.add(300); //중복
		
		//2. size() : 원소의 크기를 알려주는 메서드.
		System.out.println("Set 컬렉션 크기 : "+set.size()); // 사이즈가 감소해 있다 그 이유는 중복된 데이터를 허용하지 않아 자동삭제하기 때문
		System.out.println();
		System.out.println(set);
		
		//list출력방법에는 for문 이외에도 while문으로 출력
		//Iterator : 자바의 컬렉션 프레임워크에서 컬렉션 에 저장되어 있는
		//요소들을 읽어오는 방법을 표준화 해 놓은 객체.
		Iterator<Integer> it = set.iterator();
		
		//hasNext(): 읽어올 요소가 있는지 확인하는 메서드 - boolean형으로 반환이 된다.
		while(it.hasNext()) {
			// next(): 요소를 가져오는 메서드.
			System.out.println("set 요소 : "+it.next());
		}
		
		
	}

}
