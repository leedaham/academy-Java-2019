package p229;

public class Car {
	//�ʵ�
	public int speed;
	
	//������
	
	//�޼ҵ�
	public int getSpeed() {
		return speed;
	}
	
	public void keyTurnOn() {
		System.out.println("Ű�� �����ϴ�.");
	}
	
	public void run() {
		for(int i=0; i<=50; i+=10) {
			speed = i;
			System.out.println("�޸��ϴ�.(�ü�:"+ speed + "km/h)");
		}
	}
}
