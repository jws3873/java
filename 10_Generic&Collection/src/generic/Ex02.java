package generic;

class StringType{
	String[] str;
	String var;
	
	void setStr(String[] str) {
		this.str = str;
		
	}
	void setVar(String var) {
		this.var = var;
	}
	
	void output() {
		for(String k : str) {
			System.out.println("str 배열 요소 : "+k);
		}
		System.out.println("var : "+ var );
	}
}
	
	class Integertype{
		Integer[] iarr;
		Integer ivar;
		
		void setStr(Integer[] str) {
			this.iarr = str;
			
		}
		void setVar(Integer var) {
			this.ivar = var;
		}
		
		void output() {
			for(Integer k : iarr) {
				System.out.println("iarr 배열 요소 : "+k);
			}
			System.out.println("ivar : "+ ivar );
		}
	}


public class Ex02 {

	public static void main(String[] args) {
		
		StringType st = new StringType();
		
		String[] str = {"홍길동","이순신","유관순"};
		String var = "김연아";
		
		st.setStr(str);
		
		st.setVar(var);
		
		st.output();
		
		Integertype it = new Integertype();
		
		Integer[] iarr = {10,20,30,40,50};
		Integer ivar = 500;
		
		//매개변수가 기본자료형이 아니라 클래스 자료형이 필요한 경우가 있다 이때는 기본형으로 매개변수를 넣지 못한다.
		//특정 클래스의 매개변수는 기본자료형이 들어가지 못할 수 있다. 클래스형이 들어가야 하는 경우가 있다.
		
		it.setStr(iarr);
		it.setVar(ivar);
		it.output();
		
		
		

	}

}
