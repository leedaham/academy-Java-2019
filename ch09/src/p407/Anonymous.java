package p407;

public class Anonymous {
	//필드 초기값으로 대입
	public Person filed = new Person()	{
		public void work() {
			System.out.println("출근합니다.");
		}
		@Override
		public void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};
	
	public void method1() {
		//로컬 변수값으로 대입
	Person localVar = new Person() {
			public void walk() {
				System.out.println("산책합니다.");
			}
			@Override
			public void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		
		//로컬 변수 사용
		localVar.wake();
	}
	
	public void method2(Person person) {
		person.wake();
	}
}
