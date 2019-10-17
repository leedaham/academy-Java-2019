package p73;

public class DenyLogicOperatorExample {
	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play); //play = true니까 출력
		
		play = !play;
		System.out.println(play); //play = !true 즉, false니까 출력X
		
		play = !play;
		System.out.println(play); //play = !(!true) 즉, true니까 출력
	}
}
