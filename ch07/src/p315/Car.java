package p315;

import p314.Tire;

public class Car {
	//�ʵ�
	public Tire frontLeftTire = new Tire("�տ���", 6);
	public Tire frontRightTire = new Tire("�տ�����", 2);
	public Tire backLeftTire = new Tire("�ڿ���", 3);
	public Tire backRightTire = new Tire("�ڿ�����", 4);
	
	//������
	public int run() {
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		if(frontLeftTire.roll()==false) { stop(); return 1;}
		if(frontRightTire.roll()==false) { stop(); return 2;}
		if(backLeftTire.roll()==false) { stop(); return 3;}
		if(backRightTire.roll()==false) { stop(); return 4;}
		return 0;
	}
	
	public void stop() {
		System.out.println("[�ڵ����� ����ϴ�.]");
	}
}
