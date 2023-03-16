package ch6;

public class Member {
	
	//아이디 userid ex)hong123
	String userid;
	//비밀번호 password ex)honghong
	String password;
	//비밀번호 확인 confirmPassword ex)honghong
	String confirmPassword;
	//전화번호 hp ex)01012341234
	String hp;
	//주소 address ex)서울
	String address;
	
	
	public Member(String userid, String password, String confirmPassword, String hp) {
		super();
		this.userid = userid;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.hp = hp;
	}


	public Member(String userid, String password, String confirmPassword, String hp, String address) {
		super();
		this.userid = userid;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.hp = hp;
		this.address = address;
	}
	
	boolean passwordAndConfirmPasswordEquals() {
		return password.equals(confirmPassword);
	}
	
//	String memberInfo() {
//		return userid+"+"+password+"+"+confirmPassword+"+"+hp+"+"+address;
//	}
	
	
	
	

}
