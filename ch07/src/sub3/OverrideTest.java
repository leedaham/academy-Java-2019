package sub3;

/*
��¥ : 2019/10/21
�̸� : �̴���
���� : �������̵� �޼��� �ǽ��ϱ�/���� p295
 */

public class OverrideTest {
	public static void main(String[] args) {
		
		BBB b = new BBB();
		
		b.method1();
		b.method2();
		b.method2(1);
		b.method3();
	
		// final �ǽ�
		// - final ���� : ���
		// - final �޼��� : �������̵� ����
		// - final Ŭ���� : ��ӱ���
		
		final int NUM = 1; //���. �׻� ���� ��. �ٲ� �� ����. �빮�ڻ��.
		final double PI= 3.14;
		//NUM = 2; //����� ���� ���� �� �� ����.
	}
}

//�������̵� = ������
//�θ��� �޼���� �ߺ��Ǹ� �ڽ��� �޼��尡 ����� (������ ������)

