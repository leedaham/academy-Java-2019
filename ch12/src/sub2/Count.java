package sub2;

public class Count {

	private int num;
	
	public int getNum() {
		return num;
	}
	
	//����ȭ ���������� �����尣 ������ ���´�. (synchronized) 
	public synchronized void setNum() {
		this.num++;
	}
	
}
