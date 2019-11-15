package p600;

import p598.StatePrintThread;
import p599.TargetThread;

public class ThreadStateExample {
	public static void main(String[] args) {
		StatePrintThread statePrintThread = 
				new StatePrintThread(new TargetThread());
		statePrintThread.start();
	}
}
