package p610;

import p609.ThreadA;
import p609.WorkObject;

public class WaitNotifyExample {
	public static void main(String[] args) {
		WorkObject sharedObject = new WorkObject();
		
		ThreadA threadA = new ThreadA(sharedObject);
		ThreadB threadB = new ThreadB(sharedObject);
		
		threadA.start();
		threadB.start();
	}
}
