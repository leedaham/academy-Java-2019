package p582;

import java.awt.Toolkit;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try { Thread.sleep(500);} catch (Exception e) {}
		}
	}
}
//Runnable �͸� ��ü �̿�
Thread thread = new Thread(new Runnable() {
	
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try { Thread.sleep(500);} catch (Exception e) {}
		}
	}
});
//���ٽ� �̿�
Thread thread = new Thread(()->{
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	for(int i=0; i<5; i++) {
		toolkit.beep();
		try { Thread.sleep(500);} catch (Exception e) {}
	}
});
