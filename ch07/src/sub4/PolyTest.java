package sub4;

/*
��¥ : 2019/10/21
�̸� : �̴���
���� : ������(Polymorphism) �ǽ��ϱ�/���� p305
 */

public class PolyTest {
	public static void main(String[] args) {
		
		//������ - ��ü�� ����Ÿ���� �θ�Ŭ������ �����ϴ� ��
		Animal t = new Tiger(); //Animal�� ����Ÿ������ �ϹǷν� Tiger�� Animal�� �ƴ� Animal�� ������. �ٸ� Animal���� �������̵� �� �Լ������� tiger�� ������ ��.
		Animal e = new Eagle();	//Animal�� hunt�޼��尡 ���ٸ� Tiger�� �ִ� hunt�� ������� ����.
		Animal s = new Shark();	//Animal�� �����ϹǷν� Tiger, Eagle, Shark�� Animal�� ǥ��ȭ ���״�.
								//���α׷��� �����ϰ� �������.
		
		t.move();
		t.hunt(); 
		
		e.move();
		e.hunt();
		
		s.move();
		s.hunt();
		
	}
	
	
	
}
