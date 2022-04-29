package Exam09;

import javax.swing.JOptionPane;

public class Exam09_ProductSearchData {

	public static void main(String[] args) {
		
		String searchName = JOptionPane.showInputDialog("검색할 상품명을 입력하세요.");
		
		ProductSearchData psd = new ProductSearchData();
		
		String productInfo = psd.serch(searchName);
		
		try {
			productInfo.length();
			JOptionPane.showMessageDialog(null, productInfo);
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "해당 상품이 없습니다.");
		}
		
	}

}
