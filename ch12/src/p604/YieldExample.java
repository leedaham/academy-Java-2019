package p604;

import p605.ThreadA;
import p606.ThreadB;

public class YieldExample {
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		threadA.start();
		threadB.start();
		
		try { Thread.sleep(3000);} catch (Exception e) {}
		threadA.work = false;
		
		try { Thread.sleep(3000);} catch (Exception e) {}
		threadA.work = true;
		
		try { Thread.sleep(3000);} catch (Exception e) {}
		threadA.work = true;
		threadB.work = true;
	}
}
