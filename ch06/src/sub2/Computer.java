package sub2;

/*
 * ��¥ : 2019/10/16
 * �̸� : �̴���
 * ���� : 
 */

public class Computer {
	public static void main(String[] args) {
		
		//��ǻ�� ��ü����
		Computer samsung = new Computer("INTEL i7", "8GB", "1TB");
		Computer imac 	 = new Computer("INTEL i7", "4GB", "512GB");
		
		samsung.info();
		samsung.calc();
		samsung.internet();
		
		imac.info();
		imac.calc();
		imac.internet();
	}
	
	//Ư��(��� ����)
	private String cpu;
	private String ram;
	private String hdd;
	
	//������(�����̴ϱ� �ܿ�����~)
	public Computer(String cpu, String ram, String hdd) {
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}
	
	//���(��� �޼���)
	public void calc() {
		System.out.println("��ǻ�� ��� ��...");
	}
	
	public void internet() {
		System.out.println("���ͳ� ��...");
	}
	
	public void info() {
		System.out.println("===================");
		System.out.println("CPU : "+this.cpu);
		System.out.println("RAM : "+this.ram);
		System.out.println("HDD : "+this.hdd);
		System.out.println("-------------------");
	}
}
