package p592;

public class Calculator {
	private int memory;
	
	public int getMoney() {
		return memory;
	}
	
	public void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (Exception e) {}
		System.out.println(Thread.currentThread().getName()+": "+this.memory);
	}
}
