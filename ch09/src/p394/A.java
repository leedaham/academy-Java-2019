package p394;
//�ٱ� Ŭ����
public class A {
	public A(){System.out.println("A��ü�� ������");}
	
	//�ν���Ʈ ��� Ŭ����
	public class B{
		public B(){System.out.println("B��ü�� ������");}
		public int field1;
		//static int field2;
		public void method1() { }
		//static void method2
	}
	
	//���� ��� Ŭ����
	public static class C{
		public C(){System.out.println("C��ü�� ������");}
		public int field1;
		public static int field2;
		public void method1() {}
		public static void method2() {}
	}
	
	public void method() {
		//���� Ŭ����
		class D {
			D(){System.out.println("D��ü�� ������");}
			public int field1;
			//static int field2;
			public void method1() { }
			//static void method2
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
