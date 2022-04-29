package abstracts;

public class Ex03_SmartPhone {

	public static void main(String[] args) {
		Galaxy galaxy = new Galaxy();
		Iphone iphone = new Iphone();
		galaxy.puspose();
		galaxy.spec();
		
		System.out.println();
		iphone.puspose();
		iphone.spec();
	}

}
