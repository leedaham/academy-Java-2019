package p235;

public class Car {
	//필드
	public String model;
	public int speed;
	
	//생성자
	Car(String model){
		this.model = model;
	}
	
	//메소드
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void run() {
		for(int i=0; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h");
		}
	}
}
