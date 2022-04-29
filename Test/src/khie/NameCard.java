package khie;

public class NameCard {
	String name;
	String phoneNumber;
	String address;
	String position;
	
	public NameCard() {
	}
	public NameCard(String n,String ph, String a, String p) {
		name = n;
		phoneNumber = ph;
		address = a;
		position =p;
	}
	public void display() {
		System.out.println("================================");
		System.out.println("이름 : "+name);
		System.out.println("전화번호 : "+phoneNumber);
		System.out.println("주소 : "+address);
		System.out.println("직급 : "+position);
	}

}
