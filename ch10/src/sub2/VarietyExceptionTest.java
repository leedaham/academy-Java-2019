package sub2;

/*
��¥ : 2019/10/22
�̸� : �̴���
���� : �پ��� ����ó�� �ǽ��ϰ� /���� p433
 */

public class VarietyExceptionTest {
	public static void main(String[] args) {
		
		// ������ ��� �ε����� ���� ����
		try {
			int arr[] = {1, 2, 3};

			for(int i = 0; i < arr.length ; i++) {
				System.out.println(arr[i]);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// NullPoint ���� (null : ����)
		try {
			Tiger t = new Tiger();
			Eagle e = null;

			t.move();
			e.move();
		}catch (NullPointerException e) {
			e.printStackTrace();
		}

		// ĳ���� ����
		try {
			Animal ani = new Tiger();	//��ĳ��Ʈ
			Tiger t = (Tiger)ani;		//�ٿ�ĳ����
			Shark s = (Shark)ani;		//�߸��� ĳ����
		}catch (ClassCastException e) {
			e.printStackTrace();
		}

		System.out.println("���α׷� ����...");
	}
}
