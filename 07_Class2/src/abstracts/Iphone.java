package abstracts;

public class Iphone extends SmartPhone{

	@Override
	void spec() {
		company = "애플"; name = "Iphone 12";color = "mint";
		size = "10cm"; weight = "2000g";price = "150만원";
		
		System.out.println
		(company+" / "+name+" / "+color+" / "+size+" / "+weight+" / "+price);
		
	}
	

}
