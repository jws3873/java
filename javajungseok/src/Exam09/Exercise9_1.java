package Exam09;

public class Exercise9_1 {

	public static void main(String[] args) {
		StudentCard c1 = new StudentCard(3, true);
		StudentCard c2 = new StudentCard(3, true);
		
		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);
		System.out.println("c1.equals(c2): "+c1.equals(c2));
	}

}

class StudentCard{
	int num;
	boolean isKwng;
	
	public StudentCard() {
		this(1,true);
	}
	
	public StudentCard(int num,boolean isKwang) {
		this.num = num;
		this.isKwng = isKwang;
	}
	
	public boolean equals(Object obj) {
		StudentCard sc = (StudentCard)obj;
		if(obj instanceof StudentCard) {
			return (this.num==sc.num)||(this.isKwng==sc.isKwng);
		}else {
			return false;
		}
	}
	
	public String toString() {
		return num+(isKwng ? "K":"");
	}
	
}