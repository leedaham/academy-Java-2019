package p69;

public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
		int result1 = +x; // ���� * ���ϱ�� ����ϱ� ������ x�� -100
		int result2 = -x; // ���� * ����� ���ϱ�ϱ�  x�� 100
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		
		short s = 100;
		//short result3 = -s; //������ ���� (��ȣ�������� ����Ÿ���� int��)
		int result3 = -s;
		System.out.println("result3=" + result3);
	}
}
