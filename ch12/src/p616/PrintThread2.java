package p616;

public class PrintThread2 extends Thread {
	public void run() {
		try {
			while(true) {
				System.out.println("���� ��");
				Thread.sleep(1);
			}
		} catch (Exception e) {
		}
		
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
