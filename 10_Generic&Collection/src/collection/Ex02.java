package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {
		
		//다형성을 이용하여 ArrayList객체 생성
		List<String> list = new ArrayList<String>();
		
		list.add("one");
		list.add("tow");
		list.add("three");
		list.add("four");
		list.add("five");
		
		//list출력방법에는 for문 이외에도 while문으로 출력
		//Iterator : 자바의 컬렉션 프레임워크에서 컬렉션 에 저장되어 있는
		//요소들을 읽어오는 방법을 표준화 해 놓은 객체.
		Iterator<String> it = list.iterator();
		
		//hasNext(): 읽어올 요소가 있는지 확인하는 메서드 - boolean형으로 반환이 된다.
		while(it.hasNext()) {
			// next(): 요소를 가져오는 메서드.
			System.out.println(it.next());
		}
		
		
	}

}
