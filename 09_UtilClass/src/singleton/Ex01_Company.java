package singleton;

public class Ex01_Company {

	public static void main(String[] args) {
		// 객체가 많아지면 메모리 용량에 한계가 올 수 있다.
		// 객체를 공유할 때에는 싱글턴 방식을 사용한다. 
//		Company com1 = new Company();
//		Company com2 = new Company();
//		Company com3 = new Company();
//		Company com4 = new Company();
//		Company com5 = new Company();
//		Company com6 = new Company();
//		Company com7 = new Company();
//		Company com8 = new Company();
//		Company com9 = new Company();
//		Company com10 = new Company();
		
		Company com1 = Company.getInstance();
		Company com2 = Company.getInstance();
		Company com3 = Company.getInstance();
		Company com4 = Company.getInstance();
		Company com5 = Company.getInstance();
		Company com6 = Company.getInstance();
		Company com7 = Company.getInstance();
		Company com8 = Company.getInstance();
		Company com9 = Company.getInstance();
		Company com10 = Company.getInstance();

		System.out.println(com1);
		System.out.println(com2);
		System.out.println(com3);
		System.out.println(com4);
		System.out.println(com5);
		System.out.println(com6);
		System.out.println(com7);
		System.out.println(com8);
		System.out.println(com9);
		System.out.println(com10);
		
	}

}
