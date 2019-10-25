package exam1025;

/*
 * 날짜 : 2019/10/25
 * 이름 : 이다함
 * 문항 : Exercise05-1
 */

public class MemberService {
	public boolean login(String id, String password) {
		if( id == "hong" && password == "12345" ) {
			return true;
		}else {
			return false;
		}
	}
	
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
