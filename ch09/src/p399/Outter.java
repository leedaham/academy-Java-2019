package p399;

public class Outter {
	//�ڹ� 7 ����
	/*
	public void method1(final int arg) {
		final int localVariable = 1;
		//arg = 100; (X)
		//localVariable = 100; (X)
		class Inner {
			public void method() {
				int reult = arg + localVariable;
			}
		}
	}
	*/
	//�ڹ� 8 ����
	public void method2(int arg) {
		int localVariable = 1;
		//arg = 100; (X)
		//localVariable = 100; (X)
		class Inner {
			public void method() {
				int reult = arg + localVariable;
			}
		}
	}
}
