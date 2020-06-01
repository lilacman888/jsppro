package beans;

public class LoginBean {	
	
	private String userid;		// property
	private String passwd;      // 사용자가 폼에서 입력한 정보

	private String _userid;		// DB에 저장된 정보
	private String _passwd;
	
	// 생성자
	public LoginBean() {
		// 인증에 사용할 기본값 설정
		_userid = "myuser";
		_passwd = "1234";
	}
	
	// 아이디와 비밀번호가 맞는지 체크하는 메서드
	public boolean checkUser() {
		if(userid.equals(_userid) && passwd.equals(_passwd))
			return true;					// 일치
		else
			return false;					// 불일치
	}		
	
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}	
	
	public String getUserid() {
		return userid;
	}
	
	public String getPasswd() {
		return passwd;
	}
}