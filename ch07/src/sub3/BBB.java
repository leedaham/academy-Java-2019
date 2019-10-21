package sub3;

public final class BBB extends AAA{ //final로 인해서 더 이상 상속을 못함.
	
	@Override
	public void method1() {
		System.out.println("BBB - method1()...");
	}
	
	//Overload
	public void method2(int a) {
		System.out.println("BBB - method2()...");
	}
	
	@Override
	public final void method3() { //final로 인해서 Override를 당하지 않게됨.
		System.out.println("BBB - method3()...");
	}
}
