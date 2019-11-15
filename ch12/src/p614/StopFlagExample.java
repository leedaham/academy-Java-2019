package p614;

import p615.PrintThread1;

public class StopFlagExample {
	public static void main(String[] args) {
		PrintThread1 printThread = new PrintThread1();
		printThread.start();
		
		try { Thread.sleep(1000);} catch (Exception e) {}
		
		printThread.setStop(true);
	}
}
