package generic;
/*
 * 제네릭(generic)?
 * -포괄적인, 총괄적인.
 * -특정한 클래스에 원하는 개체 타입을 지정하여
 * 객체를 만들때 해당 클래스의 객체를 Objec를 지정하여 원하는 형으로 변경이 가능하지만 객체를 담을때 마다 형변환을 진행하여야 한다.
 * 제네릭을 이용하여 클래스 선언시 원하는 형을 지정한다는 <T>키워드를 통해 객체생성시에 형을 지정할 수 있다.
 */

class Generic<T>{ //T는 타입의 약자 T나 E 
	T[] str;
	T var;
	
	void setStr(T[] str) {
		this.str = str;
		
	}
	void setVar(T var) {
		this.var = var;
	}
	
	void output() {
		for(T k : str) {
			System.out.println("str 배열 요소 : "+k);
		}
		System.out.println("var요소 "+var);
	}
}

class Generic2<T>{
	T[] str;
	T var;
	
	public T[] getStr() {
		return str;
	}
	public void setStr(T[] str) {
		this.str = str;
	}
	public T getVar() {
		return var;
	}
	public void setVar(T var) {
		this.var = var;
	}
	
	void ouput() {
		for(T k : str ) {
			System.out.println("str 배열 요소 : "+k);
		}
		System.out.println("var 요소 : "+var);
	}
	
	
}


public class Ex03 {

	public static void main(String[] args) {
		
		// String 타입의 클래스 객체 생성
		Generic<String> st = new Generic<String>();
		
		
//		st.setStr(st);
		
		String[] str = {"홍길동","이순신","유관순"};
		String var = "김연아";
		
		st.setStr(str);
		st.setVar(var);
		st.output();
		System.out.println();
		
		//Integer 타입의 클래스 객체 생성
		Generic<Integer> it = new Generic<Integer>();
		
		Integer[] iarr = {10,20,30,40};
		Integer ivar = 500;
		
		it.setStr(iarr);
		it.setVar(ivar);
		it.output();
		System.out.println();
		
		
		Generic2<String> gr = new Generic2<String>();
		String[] str2 = {"안녕","시발","놈아"};
		String var2 = "만나서 반가워";
		
		gr.setStr(str2);
		gr.setVar(var2);
		
		gr.ouput();
		
		

		
	
		
	}

}
