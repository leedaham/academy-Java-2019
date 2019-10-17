package sub4;

public class Increment {

	private int num1;
	public static int num2;
	//static붙는애들은 method area(정적영역)으로 감 (stack/heap 이 아니고)
	//main();함수도 method area에 있음. 항상 메모리에 상주해야 프로그램이 실행됨. (항상 상주 = static) in method area.RAM. 
	//변수를 고정해둔다 생각해두면 됨.
	public Increment() {
		this.num1++;
		this.num2++;
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
	}
	
	public Increment(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public static void add() {
		//static method에서는 none static 변수를 참조할 수 없다.
		//num1++;
		num2++;
	}
}
