package packages;
import Model.MemberDTO;

/*
 * 패키지(package)?
 * -서로 연관성이 있는 클래스들과 인터페이스들의 묶음을 말함.
 * -패키지는 물리적으로 폴더 개념과 유사함.
 * 패키지는 서브패키지를 가질 수 있으며, "."으로 구분함.
 * import 키워드 : 현재 패키지의 클래스에서 다른 패키지에 있는
 * 다른 클래스를 사용하고 싶은 경우 import 해야 한다.
 * (단, 동일한 패키지에 있는 다른 클래스를 사용할 경우에는 생략 가능)
 * 형식)import 패키지명. 서브패키지명. 클래스명 //Ctrl+shift+o 다른 패키지에 있는 클래스를 자동 import
 * 
 */

public class Ex01 {

	public static void main(String[] args) {
		
		//model 패키지에 있는 MemberDTO 클래스를 사용하는 방법
		MemberDTO member = new MemberDTO();
		
		//회원 정보를 저장해 보자.
		member.setId("hong");
		member.setName("홍길동");
		member.setAge(27);
		member.setPhone("010-1111-1234");
		member.setAddress("서울시 중구 남대문로");
		
		//화면에 출력을 해 보자.
		System.out.println("회원 아이디 >>> "+member.getId());
		System.out.println("회원 이름 >>> "+member.getName());
		System.out.println("회원 나이 >>> "+member.getAge());
		System.out.println("회원 핸드폰번호 >>> "+member.getPhone());
		System.out.println("회원 주소 >>> "+member.getAddress());

	}

}
