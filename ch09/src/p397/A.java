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
			method2();			//모든 필드와 메소드에 접근할 수 있다.
		}
	}
	public static class C {
		public void method() {
			//field1 = 10;
			//method1();		인스턴스 필드와 메소드는 접근할 수 없다.
			
			field2 = 10;
			method2();
		}
	}
}
