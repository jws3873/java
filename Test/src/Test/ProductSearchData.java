package Test;

import java.util.HashMap;
import java.util.Map;

public class ProductSearchData {
	Map<String, String> map;
	public ProductSearchData() {
	map = new HashMap<String, String>();
	map.put("세탁기", "드럼세탁기 최신형");
	map.put("내장고", "지펠 냉장고 최신형");
	map.put("TV", "HDTV인치 최신모델");
	}
	
	String search(String productName) {
		String ProductInfo="";
		if (map.containsKey(productName)) {
			ProductInfo = map.get(ProductInfo);
		}else {
			ProductInfo = "해당 상품이 없습니다.";
		}
		return ProductInfo;
	}
	
}
