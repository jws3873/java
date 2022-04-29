package javajungseok;
class Product
{
	int price;
	int bonusPoint;
	
	Product(){
		super();
	}
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product{
	Tv(){
		super();
	}

	public String toString() {
		return "Tv";
	}
}
public class Exercise7_3 {

	public static void main(String[] args) {
		Tv t = new Tv();
		System.out.println(t);
	}

}
