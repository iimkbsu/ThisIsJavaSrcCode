package ch06.Quiz.Quiz15;

public class MemberService {
	
	private String id = "hong";
	private String pw = "12345";
	
	//login() 메소드 호출시 매개값으로 id password 제공
	//logout() 메소드는 매개값 id만 제공
	
	//login() 메소드는 id = "hong", password = "12345" 일 경우에만 true 리턴
	//logout() 메소드는 "id님이 로그아웃 되었습니다." 출력되도록
	
	
	public boolean login(String id, String pw) {
		if(this.id.equals(id) && this.pw.equals(pw)) {
			return true;
		}else {
			return false;
		}
	}
	
	public void logout(String id) {
		System.out.println(id +"님이 로그아웃 되었습니다");
		//return;
	}
	
}
