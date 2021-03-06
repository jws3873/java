package Model;

/*
 * ★★★★★★★★★★★★★★★★★★★★★★★★
 * 자바 빈(java Bean)?
 * -DB에 접근하여 테이블의 특정 컬럼(속성)에 값을 저장하거나
 * 저장된 값을 가져올 때 사용하는 클래스.
 * -java Bean == DTO(Data Transfer Object데이터를 전송하는 객체) == VO(Value Object값을 가지고 있는 객체)
 * -구성요소
 * 1. 멤버변수 - DB컬럼명 : 접근지정자(private)
 * 2. setter(): 지정자 메서드
 * 3. getter(): 획득자 메서드
 */

//Java Bean의 정의
//데이터를 표현하는 것을 목적으로 하는 자바 클래스.
//컴포넌트와 비슷한 의미로도 사용된다.
//JavaBean 규격서에 따라 작성된 자바 클래스를 가리킨다.
//
//Java Bean의 규격
//클래스는 패키지화 하여야 한다.
//멤버변수는 프로퍼티(Property)라 칭한다.
//클래스는 필요에 따라 직렬화가 가능하다.
//프로퍼티의 접근자는 private이다.
//프로퍼티마다 getter/setter 가 존재해야 하며, 그 이름은 각각 get/set으로 시작해야 한다.
//위의 프로퍼티 getter/setter 메서드의 접근자는 public이어야 한다.
//외부에서 프로퍼티에 접근은 메서드를 통해서 접근한다.
//프로퍼티는 반드시 읽기/쓰기가 가능해야 하지만, 읽기 전용인 경우 getter만 정의할 수 있다.
//getter의 경우 파라미터가 존재하지 않아야 하고, setter의 경우 한 개 이상의 파라미터가 존재한다.
//프로퍼티의 형이 boolean일 경우 get 메서드 대신 is메서드를 사용해도 된다.

public class MemberDTO {
	//만약에 DB상의 테이블의 이름이 member(회원 테이블) 이라고 가정했을 때
	//member 테이블의 구성(컬럼)이 id, name, age, phone, address
	// 로 구성이 되어 있다고 가정을 하면
	
	//멤버변수
	private String id; //회원 아이디
	private String name; // 회원 이름
	private int age; //회원 나이
	private String phone; // 회원 연락처
	private String address; // 회원 주소
	public MemberDTO() {
		// TODO Auto-generated constructor stub
	}
	public MemberDTO(String id,String name,int age, String phone, String address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address =address;
	}
	
	public void display(MemberDTO[] dto) {
		System.out.println();
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}

	


	
}
