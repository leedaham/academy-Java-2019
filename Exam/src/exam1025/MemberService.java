package exam1025;

/*
 * ��¥ : 2019/10/25
 * �̸� : �̴���
 * ���� : Exercise05-1
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
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
}
