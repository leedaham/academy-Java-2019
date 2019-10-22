package sub1;

public interface RemoteControl {
	
	//추상메서드 선언(abstract 생략가능), interface에서는 abstract 없어도 됨.
	public abstract void  powerOn();
	public abstract void  powerOff();
	
	public void chUp();
	public void chDown();

	public void soundUp();
	public void soundDown();
	
}
