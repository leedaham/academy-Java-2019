package sub3;

public final class BBB extends AAA{ //final�� ���ؼ� �� �̻� ����� ����.
	
	@Override
	public void method1() {
		System.out.println("BBB - method1()...");
	}
	
	//Overload
	public void method2(int a) {
		System.out.println("BBB - method2()...");
	}
	
	@Override
	public final void method3() { //final�� ���ؼ� Override�� ������ �ʰԵ�.
		System.out.println("BBB - method3()...");
	}
}
