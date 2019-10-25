package exam1025;

/*
 * 날짜 : 2019/10/25
 * 이름 : 이다함
 * 문항 : Exercise06-2
 */

public class Child extends Parent{
	private String name;
	
	public Child() {
		this("대한민국");
		System.out.println("Child() call");
	}

	public Child(String name){
		this.name = name;
		System.out.println("Child(String nation) call");
	}
}

