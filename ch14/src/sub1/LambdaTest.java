package sub1;

/*
��¥ : 2019/10/28
�̸� : �̴���
���� : ���ٽ� �ǽ��ϱ�/���� p678
 */

public class LambdaTest {
	public static void main(String[] args) {
		
		//���ٽ� : �Ű������� ���� �ڵ���� ���� �͸��Լ�
		Type1 t1 = () -> {System.out.println("Type1 ���ٽ� ����..."); };
		Type2 t2 = (x) -> {System.out.println("Type2 ���ٽ� ����... - "+x); };
		Type3 t3 = (x, y) -> {
			int result = x + y;
			return result;
		};
		
		//���ٽ� ����
		t1.fx();
		t2.fx(3);
		
		int result = t3.fx(2, 3);
		System.out.println("result : "+ result);
		
	}
}
