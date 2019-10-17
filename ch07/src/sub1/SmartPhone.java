package sub1;

public class SmartPhone extends Computer {
	
	//Ư��(��� ����)
	private String brand;
	private String tel;
	private int price;
	
	//������
	public SmartPhone(String cpu, String ram, String hdd, String brand, String tel, int price) {
		super(cpu, ram, hdd);
		
		this.brand = brand;
		this.tel = tel;
		this.price = price;
	}
	
	//���(��� �޼���)

	public void call() {
		System.out.println(tel+"��ȣ�� ��ȭ �Ŵ� ��...");
	}
	public void info() {
		System.out.println("==============================");
		System.out.println("CPU : "+cpu);
		System.out.println("CPU : "+ram);
		System.out.println("CPU : "+hdd); //�� class���� cpu, ram, hdd�� �������� �ʾ�����, super�����ν� �θ𿡰Լ� protected,public �� ������ ������ ��밡��. private�� �ȵſ�~

		System.out.println("��ǰ�� : "+brand);
		System.out.println("����ȣ : "+tel);
		System.out.println("��ǰ���� : "+price);
		System.out.println("------------------------------");
	}
}
