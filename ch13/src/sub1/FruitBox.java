package sub1;

public class FruitBox<T> {

	private T fruit;
	
	
	//Getter : 외부로 클래스의 멤버를 전달하기 위한 메서드
	public T getFruit() {
		return fruit;
	}

	//Setter : 외부에서 클래스의 멤버를 전달받기 위한 메서드
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
	
}
