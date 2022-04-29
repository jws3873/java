package Project;

public class ShopMember {

	private String memberId;

	private String memberPw;

	private String memberName;
	//문제3-1. int을 String으로
	private int memberAge;

	private String phone;

	private String addr;

	public ShopMember() {}

	public String getMemberId() {

		return memberId;

	}

	public void setMemberId(String memberId) {

		this.memberId = memberId;

	}

	public String getMemberPw() {

		return memberPw;

	}

	public void setMemberPw(String memberPw) {

		this.memberPw = memberPw;

	}

	public String getMemberName() {

		return memberName;

	}

	public void setMemberName(String memberName) {

		this.memberName = memberName;

	}
	//문제3-2
	public int getMemberAge() {

		return memberAge;

	}
	//문제3-3
	public void setMemberAge(int memberAge) {

		this.memberAge = memberAge;

	}

	public String getPhone() {

		return phone;

	}

	public void setPhone(String phone) {

		this.phone = phone;

	}

	public String getAddr() {

		return addr;

	}

	public void setAddr(String addr) {

		this.addr = addr;

	}

}
