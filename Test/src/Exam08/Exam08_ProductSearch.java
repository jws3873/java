package Exam08;


import javax.swing.JOptionPane;

public class Exam08_ProductSearch {

	public static void main(String[] args) {

		

		String productname = JOptionPane.showInputDialog("검색할 상품명을 입력하세요.");
		ProductSerchData psd = new ProductSerchData();
		String productInfo = psd.search(productname);
		try {
//		if(productInfo == null) {
//			throw new Exception("안녕 나는 예외야!");
//		}
			productInfo.length(); //예외가 발생할 가능성이 있는 코드
		}catch(Exception e) {
			productInfo ="해당 상품이 없습니다.";
		}
		JOptionPane.showMessageDialog(null, productInfo);

		
	}

}
