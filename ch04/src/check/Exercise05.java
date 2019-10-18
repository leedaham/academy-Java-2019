package check;

public class Exercise05 {
	public static void main(String[] args) {
		for(int x = 1 ; x<=10; x++) { //x를 1부터 10까지 대입한다.
			for(int y = 1; y<=10; y++) { //y를 1부터 10까지 대입한다.
				if((4*x + 5*y)==60 ) { //만약 4x+5y=60이라면 출력한다.
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}
	}
}
