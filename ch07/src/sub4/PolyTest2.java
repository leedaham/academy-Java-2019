package sub4;

/*
��¥ : 2019/10/21
�̸� : �̴���
���� : ������(Polymorphism) �ǽ��ϱ�/���� p305
 */

public class PolyTest2 {
	//�������� �̿��ϸ� ���α׷��� ��� ���������°�~
	public static void main(String[] args) {
		
		Tiger t = new Tiger();
		Eagle e = new Eagle();
		Shark s = new Shark();
		
		//��ü �迭
		Animal objs[] = {t, e, s};
		
		objs[0].move();
		objs[0].hunt();
		
		objs[1].move();
		objs[1].hunt();
		
		objs[2].move();
		objs[2].hunt();
		
		//�������� �̿��� �޼����� �Ű�����;
		move(t);
		move(e);
		move(s);
	}
	
	public static void move(Animal a) {
		a.move();
	}
}
//	Animal Class ����.
//	Tiger Class ����. (extends Animal)
//	Eagle Class ����. (extends Animal)
//	Shark Class ����. (extends Animal)
//
//	Tiger t = new Tiger();
//	Eagle e = new Eagle();
//	Shark s = new Shark(); �� ��ü�� �����߾��µ�, ��ü ����Ÿ���� Animal�� �ٲ�.
//
//	���� Tiger, Eagle, Shark�� ������������
//	Tiger, Eagle, Shark�� extends �� Animal���� �����߾���.
//	Animal�� ���������ν� Tiger, Eagle, Shark�� ���������ʰ� Animal�� ������.
//	�ٸ�, Tiger, Eagle, Shark�κ��� Override�� method���� Animal���� ������.
//
//	Animal�� ��ü�����ϸ�, ��ü �迭�� �� �� �ְ�,
//	Tiger, Eagle, Shark�� �Ű������� �������������� �ʾƵ� ��. 

