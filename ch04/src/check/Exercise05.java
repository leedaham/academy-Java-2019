package check;

public class Exercise05 {
	public static void main(String[] args) {
		for(int x = 1 ; x<=10; x++) { //x�� 1���� 10���� �����Ѵ�.
			for(int y = 1; y<=10; y++) { //y�� 1���� 10���� �����Ѵ�.
				if((4*x + 5*y)==60 ) { //���� 4x+5y=60�̶�� ����Ѵ�.
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}
	}
}
