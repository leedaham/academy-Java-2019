package check;

public class Exercise04 {
	public static void main(String[] args) {
		while(true) {
			int num1 = (int)(Math.random()*6)+1;	//math.random()�� �������̶� �������ƴ�. (int)�� ������ Ư���������.
			int num2 = (int)(Math.random()*6)+1;	//math.random() �� *n�� �ϸ� 0<x<6 �� ������ ������ ��.
			System.out.println("(" + num1 + "," + num2 + ")");
			if((num1+num2)==5) {
				break;
			}
		}

		System.out.println("���α׷� ����...");
	}
}
