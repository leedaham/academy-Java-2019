package sub3;

public class SubThread extends Add implements Runnable{	 //implements로 할때는 Thread가 아닌 Runnable

	private int start;
	private int end;
	
	public SubThread(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {
		for(int k=start; k<=end; k++) {
			setNum(k);
		}
	}

	
}
