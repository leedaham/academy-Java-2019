package sub6;

//�߻�Ŭ����
// - �߻�޼��带 ���� Ŭ����
// - ����� ���� ����Ʈ
// - ����ȭ�� Ŭ���� ���踦 �����Ѵ�.
public abstract class Unit {

	public void move() {
		System.out.println("Unit move...");
	}
	
	//�޼��� ����(����X) - �ڽ�Ŭ�������� ����
	public abstract void attack();
	public abstract void speacial();
}
