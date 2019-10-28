package p400;

public class Outter {
	String field = "Outter-field";
	public void method() {
		System.out.println("Outer-method");
	}
	
	public class Nested{
		String field = "Nested-field";
		public void method() {
			System.out.println("Nested-method");
		}
		public void print() {
			System.out.println(this.field);
			this.method();
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}
