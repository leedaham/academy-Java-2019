package sub4;

public class Calc {
	
	//�̱���(����) ��ü
	private static Calc instance = new Calc(); //�ִ��� �����ũ���� �ܿ��. instance��� Calc�� method area�� �÷���.
	
	public static Calc getInstance() {
		return instance;
	} //�� ~ �����̾�.
	
	private Calc() {}
	
	public int plus (int x , int y) {
		int z = x + y;
		return z;
	}

	public int minus (int x , int y) {
		int z = x - y;
		return z;
	}
	public int multi (int x , int y) {
		int z = x * y;
		return z;
	}
	public int div (int x , int y) {
		int z = x / y;
		return z;
	}
}
