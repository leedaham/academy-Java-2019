package exam1025;

/*
 * 날짜 : 2019/10/25
 * 이름 : 이다함
 * 문항 : Exercise06-1
 */

public class Parent {
	public String nation;
	
	public Parent() {
		this("대한민국");
		System.out.println("Parent() call");
	}

	public Parent(String nation){
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
