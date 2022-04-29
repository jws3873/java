package Project;

public class FriendsVO {
	private String F_id;
	private String F_name; 
	private String F_gender; 
	private String F_phone; 
	private String F_email;  
	private String F_edate; 
	private String F_photo;
	public FriendsVO() {
		// TODO Auto-generated constructor stub
	}
	public FriendsVO(String F_id,String F_name,String F_gender,String F_phone,String F_email,String F_edate,String F_photo) {
	this.F_id = F_id;
	this.F_name = F_name;
	this.F_gender = F_gender;
	this.F_phone = F_phone;
	this.F_email = F_email;
	this.F_edate = F_edate;
	this.F_photo = F_photo;
	}
	public String getF_id() {
		return F_id;
	}
	public String getF_name() {
		return F_name;
	}
	public String getF_gender() {
		return F_gender;
	}
	public String getF_phone() {
		return F_phone;
	}
	public String getF_email() {
		return F_email;
	}
	public String getF_edate() {
		return F_edate;
	}
	public String getF_photo() {
		return F_photo;
	}
	
	
	

}
