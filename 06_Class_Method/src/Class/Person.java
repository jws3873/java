package Class;

public class Person {
	//멤버변수
		String name;
		int age;
		boolean marriage;
		int unmberOfchild;
		
		Person(){}
		
		Person(String n,int a, boolean m,int c){
			name = n;
			age=a;
			marriage = m;
			unmberOfchild = c;
		}

		void display() {
			String mar = "";
			if(marriage) {
				mar = "기혼";
			}else {
				mar = "미혼";
			}
			System.out.println("이름 >>> "+name);
			System.out.println("나이 >>> "+name);
			System.out.println("결혼여부 >>> "+mar);
		}
}
