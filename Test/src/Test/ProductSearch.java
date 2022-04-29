package Test;

import javax.swing.JOptionPane;

public class ProductSearch {

	public static void main(String[] args) {
		ProductSearchData psd = new ProductSearchData();
		String productName = JOptionPane.showInputDialog("검색항 상품명을 입력하세요");
		String productInfo = psd.search(productName);
		
		try {
			productInfo.length();
			JOptionPane.showMessageDialog(null, productInfo);
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "해당상품이 없습니다.");
		}
		
	}

}
