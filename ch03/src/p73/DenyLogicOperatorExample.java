package p73;

public class DenyLogicOperatorExample {
	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play); //play = true�ϱ� ���
		
		play = !play;
		System.out.println(play); //play = !true ��, false�ϱ� ���X
		
		play = !play;
		System.out.println(play); //play = !(!true) ��, true�ϱ� ���
	}
}
