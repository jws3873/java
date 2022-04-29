package Model;

public class StudentDTO {
	private int hakbun;
	private String name;
	private String major;
	private String phone;
	private String address ;
	
	public StudentDTO() {
	}
	public StudentDTO(int hakbun,String name,String major,String phone, String address) {
		this.hakbun = hakbun;
		this.name = name;
		this.major = major;
		this.phone = phone;
		this.address = address;
	}
	public int getHakbun() {
		return hakbun;
	}
	public String getName() {
		return name;
	}
	public String getMajor() {
		return major;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}

	
}
