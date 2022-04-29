package javajungseok;
class Outer2{
	int iiv = 0;
	class Inner1{
		int iv1 = 150;
	}
	static class Inner2{
		int iv = 200;
		static int iv2 =100;
	}
}
public class Exercise7_7 {

	public static void main(String[] args) {
		
		Outer2 o = new Outer2();
		Outer2.Inner1 i1 = o.new Inner1();
		Outer2.Inner2 i = new Outer2.Inner2();
		
		System.out.println(o.iiv);
		System.out.println(i1.iv1);
		System.out.println(i.iv);
		System.out.println(Outer2.Inner2.iv2);
		
		
		
		
	}

}
