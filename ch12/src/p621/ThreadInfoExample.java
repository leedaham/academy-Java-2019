package p621;

import java.util.Map;
import java.util.Set;

import p619.AutoSaveThread;

public class ThreadInfoExample {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setName("AutoSaveThread");
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> threads = map.keySet();
		for(Thread thread : threads) {
			System.out.println("Nam: "+thread.getName() + ((thread.isDaemon())?"(����)": "(��)"));
			System.out.println("\t"+"�Ҽӱ׷�: "+ thread.getThreadGroup().getName());
			System.out.println();
		}
	}
}
