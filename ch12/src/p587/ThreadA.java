package p587;

public class ThreadA extends Thread {
	public ThreadA() {
		setName("ThreadA");
	}
	
	public void run() {
		System.out.println(getName() + "�� ����� ����");
	}
}
