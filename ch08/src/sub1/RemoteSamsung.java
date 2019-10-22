package sub1;

public class RemoteSamsung implements RemoteControl{

	@Override
	public void powerOn() {
		System.out.println("Samsung power On...");
	}

	@Override
	public void powerOff() {
		System.out.println("Samsung power Off...");
	}

	@Override
	public void chUp() {
		System.out.println("Samsung ch Up...");
	}
	@Override
	public void chDown() {
		System.out.println("Samsung ch Down...");
	}

	@Override
	public void soundUp() {
		System.out.println("Samsung sound Up...");
	}
	@Override
	public void soundDown() {
		System.out.println("Samsung sound Down...");
	}

}
