package Exam08;

public class ProductSerchData {

	
	String[][] proTavble;
	
	public ProductSerchData() {
		proTavble = new String[3][2];
		proTavble[0][0] = "세탁기"; 
		proTavble[1][0] = "냉장고"; 
		proTavble[2][0] = "TV"; 
		proTavble[0][1] = "드럼 세탁기 최신형"; 
		proTavble[1][1] = "지펠 냉장고 최신형"; 
		proTavble[2][1] = "HDTV 150인치 최신 모델";	
	}// 기본 생성자
	
	String search(String productName) {
		for(int i =0;i<proTavble.length;i++) {
			if(proTavble[i][0].equals(productName)) {
				return proTavble[i][1];
			}
		}
		return null;
	}

	
	
}
