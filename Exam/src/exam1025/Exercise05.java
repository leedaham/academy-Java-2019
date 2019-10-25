package exam1025;

/*
 * 날짜 : 2019/10/25
 * 이름 : 이다함
 * 문항 : Exercise05-2
 */

public class Exercise05 {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}
