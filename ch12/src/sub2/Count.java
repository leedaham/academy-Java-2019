package sub2;

public class Count {

	private int num;
	
	public int getNum() {
		return num;
	}
	
	//동기화 블럭선언으로 쓰레드간 경합을 막는다. (synchronized) 
	public synchronized void setNum() {
		this.num++;
	}
	
}
