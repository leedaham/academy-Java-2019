package sub2;

/*
��¥ : 2019/10/22
�̸� : �̴���
���� : �͸� Ŭ���� �ǽ��ϱ�/���� p404
 */

public class AnonyObjectTest {
	public static void main(String[] args) {

		//�͸�ü - �������̽��� Ŭ���� ����(implements)���� new �������� ������ ����
		Person p = new Person() {
			@Override
			public void info() {
				System.out.println("Peroson info...");
			}
			@Override
			public void hello() {
				System.out.println("Peroson hello...");

			}
		};
		
		p.info();
		p.hello();
	}
}
