package abstracts;

public abstract class Person {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	// 메서드의 body{}를 만들어주지 않으므로 추상메서드 키워드필요
	abstract void output(); //추상 메서드
	
	
}
