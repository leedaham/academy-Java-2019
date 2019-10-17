package sub4;

public class Increment {

	private int num1;
	public static int num2;
	//static�ٴ¾ֵ��� method area(��������)���� �� (stack/heap �� �ƴϰ�)
	//main();�Լ��� method area�� ����. �׻� �޸𸮿� �����ؾ� ���α׷��� �����. (�׻� ���� = static) in method area.RAM. 
	//������ �����صд� �����صθ� ��.
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
		//static method������ none static ������ ������ �� ����.
		//num1++;
		num2++;
	}
}
