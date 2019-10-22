package sub1;

public class RemoteLG implements RemoteControl{

	@Override
	public void powerOn() {
		System.out.println("LG power On...");
	}
	@Override
	public void powerOff() {
		System.out.println("LG power Off...");
	}

	@Override
	public void chUp() {
		System.out.println("LG ch Up...");
	}
	@Override
	public void chDown() {
		System.out.println("LG ch Down...");
	}

	@Override
	public void soundUp() {
		System.out.println("LG sound Up...");
	}
	@Override
	public void soundDown() {
		System.out.println("LG sound Down...");
	}

}
