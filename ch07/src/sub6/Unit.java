package sub6;

//추상클래스
// - 추상메서드를 갖는 클래스
// - 상속을 위한 퀘스트
// - 구조화된 클래스 설계를 제공한다.
public abstract class Unit {

	public void move() {
		System.out.println("Unit move...");
	}
	
	//메서드 선언(구현X) - 자식클래스에서 구현
	public abstract void attack();
	public abstract void speacial();
}
