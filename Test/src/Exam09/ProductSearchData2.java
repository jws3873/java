package Exam09;

import java.util.HashMap;
import java.util.Map;

public class ProductSearchData2 {
	Map<String, String> map;
	public ProductSearchData2() {
		map =  new HashMap<String, String>();
		map.put("세탁기", "드럼 세탁기 최신형");
		map.put("내장고", "지펠 냉장고 최신형");
		map.put("세탁기", "HDTV 150인치 최신 모델");
	}

	String search(String productName) {
		String productInfo=null;
		if(map.containsKey(productName)) {
			productInfo = map.get(productName);
		}else {
			productInfo = "해당 상품이 없습니다.";
		}
		return productInfo;
	}
}
