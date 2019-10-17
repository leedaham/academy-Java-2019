package sub1;

public class SmartPhone extends Computer {
	
	//특성(멤버 변수)
	private String brand;
	private String tel;
	private int price;
	
	//생성자
	public SmartPhone(String cpu, String ram, String hdd, String brand, String tel, int price) {
		super(cpu, ram, hdd);
		
		this.brand = brand;
		this.tel = tel;
		this.price = price;
	}
	
	//기능(멤버 메서드)

	public void call() {
		System.out.println(tel+"번호로 전화 거는 중...");
	}
	public void info() {
		System.out.println("==============================");
		System.out.println("CPU : "+cpu);
		System.out.println("CPU : "+ram);
		System.out.println("CPU : "+hdd); //이 class에는 cpu, ram, hdd를 정의하지 않았지만, super함으로써 부모에게서 protected,public 된 변수를 마음껏 사용가능. private은 안돼용~

		System.out.println("제품명 : "+brand);
		System.out.println("폰번호 : "+tel);
		System.out.println("제품가격 : "+price);
		System.out.println("------------------------------");
	}
}
