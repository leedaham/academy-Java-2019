package p213;

public class Car {
	//�ʵ�
	public String company = "�����ڵ���";
	public String model;
	public String color;
	public int maxSpeed;
	
	//������
	public Car() {
	}
	
	public Car(String model) {
		this(model, "����", 250);
	}
	
	public Car(String model, String color) {
		this(model, color, 250);
	}
	
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
