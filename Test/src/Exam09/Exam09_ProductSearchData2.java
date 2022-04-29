package Exam09;

import javax.swing.JOptionPane;

public class Exam09_ProductSearchData2 {

	public static void main(String[] args) {
		String productName = JOptionPane.showInputDialog("검색할 상품명을 입력하세요");
		
		ProductSearchData2 psd = new ProductSearchData2();
		
		String productInfo = psd.search(productName);
		
		try {
			productInfo.length();
			JOptionPane.showMessageDialog(null, productInfo);
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "해당 상품이 없습니다.");
		}
		
		
		
	}

}
