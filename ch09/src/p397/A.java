package p397;

public class A {
	public int field1;
	public void method1() {}
	
	public static int field2;
	public static void method2() {}
	
	public class B{
		public void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();			//��� �ʵ�� �޼ҵ忡 ������ �� �ִ�.
		}
	}
	public static class C {
		public void method() {
			//field1 = 10;
			//method1();		�ν��Ͻ� �ʵ�� �޼ҵ�� ������ �� ����.
			
			field2 = 10;
			method2();
		}
	}
}
