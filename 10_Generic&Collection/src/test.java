import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class test {

	public static void main(String[] args) {
		
	Map<String, Integer> map = new HashMap<String, Integer>();
		
		//1. put(): map에 데이터를 저장하는 메서드.
		// ==> 이름을 키(key)로 저장, 점수를 값(value)으로 저장
		map.put("홍길동", 95);
		map.put("유관순", 90);
		map.put("세종대왕", 100);
		map.put("김유신", 88);
		map.put("김연아", 89);
		
		for(String k: map.keySet()) {
			System.out.println(k+map.get(k));
		}
	
	
	}
	
}


