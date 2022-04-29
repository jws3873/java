package abstracts;

public abstract class SmartPhone {

	//공통적인 기능의 특성
	String call = "전화";
	String sns = "SNS";
	String serch = "인터넷 검색";
	String game = "게임";
	
	// 각각의 기계(단말기) 들의 특성.
	String company, name, color, size, weight, price;
	
	void puspose() {
		System.out.println("사용목적 : "+call+" / "+sns+" / "+serch+" / "+game );
	}

	//각각의 단말기(기계)들의 spec
	abstract void spec();
}
