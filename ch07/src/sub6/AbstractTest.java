package sub6;

/*
��¥ : 2019/10/21
�̸� : �̴���
���� : �߻�Ŭ���� �ǽ��ϱ�/���� p329
 */

//���Ǽ����� ��ü�� �ڵ�ȭ �� �� = Ŭ����
//�߻�Ŭ������ Ŭ�������� ǥ��ȭ�Ѵ�.
public class AbstractTest {
	public static void main(String[] args) {
		
		//�߻� �޼��� ����(���� �ȵ�)
		//Unit unit = new Unit():
		
		Unit u1 = new Marin();
		Unit u2 = new Zealot();
		Unit u3 = new Zergling();
		
		u1.move();
		u1.attack();
		u1.speacial();
		
		u2.move();
		u2.attack();
		u2.speacial();
		
		u3.move();		
		u3.attack();
		u3.speacial();
	}
}
