package sub3;

public class Calc {

	public int plus (int a, int b) {
		int c = a + b;
		return c;
	}
	public int minus (int a, int b) {
		int c = a - b;
		return c;
	}
	public int mult (int a, int b) {
		int c = a * b;
		return c;
	}
	//������ �߻��Ҷ� �޼��带 ȣ���ϴ� ������ ������ ������.
	public int div (int a, int b) throws Exception { //throws Exception �޼ҵ� ����ó��
		int c = a / b;
		return c;
	}
}
