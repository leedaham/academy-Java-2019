package sub1;

/*
��¥ : 2019/10/22
�̸� : �̴���
���� : �������̽� �ǽ��ϱ�/���� p344
 */

	//�������̽�
	// - �߻�Ŭ�������� �� �߻�����

public class InterfaceTest {
	public static void main(String[] args) {
		
		RemoteControl lg = new RemoteLG();
		RemoteControl samsung = new RemoteSamsung();
		
		lg.powerOn();
		lg.chUp();
		lg.soundDown();
		
		samsung.powerOn();
		samsung.chDown();
		samsung.powerOff();
	}
}
