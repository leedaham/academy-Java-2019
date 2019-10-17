package sub1;

public class Computer {
	public static void main(String[] args) {
		
		//컴퓨터 객체생성
		Computer samsung = new Computer("INTEL i7", "8GB", "1TB");
		Computer imac 	 = new Computer("INTEL i7", "4GB", "512GB");
		
		samsung.info();
		samsung.calc();
		samsung.internet();
		
		imac.info();
		imac.calc();
		imac.internet();
	}
	
	//특성(멤버 변수)
	protected String cpu;
	protected String ram;
	protected String hdd;
	
	//생성자(공식이니까 외워버려~)
	public Computer(String cpu, String ram, String hdd) {
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}
	
	//기능(멤버 메서드)
	public void calc() {
		System.out.println("컴퓨터 계산 중...");
	}
	
	public void internet() {
		System.out.println("인터넷 중...");
	}
	
	public void info() {
		System.out.println("===================");
		System.out.println("CPU : "+this.cpu);
		System.out.println("RAM : "+this.ram);
		System.out.println("HDD : "+this.hdd);
		System.out.println("-------------------");
	}
}
