package Exam09;

import java.util.HashMap;
import java.util.Map;

public class ProductSearchData {
	
	Map<String, String> map;
	
	public ProductSearchData() {
		map = new HashMap<String, String>();
		map.put("세탁기", "드럼 세탁기 최신형");
		map.put("냉장고", "지펠 냉장고 최신형");
		map.put("TV", "HDTV 150인치 최신 모델");
	}
	
	String serch(String searchName) {
		String productInfo = null;
		if(map.containsKey(searchName)) {
			productInfo = map.get(searchName); 
		}else {
			productInfo = "해당 상품이 없습니다.";
		}
		return productInfo;
	}
}
