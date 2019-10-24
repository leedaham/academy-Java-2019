package sub2;

/*
날짜 : 2019/10/24
이름 : 이다함
내용 : 제네릭클래스 실습하기/교재 p654 //이해가 잘 안됨 ㅜㅜ
 */

public class MultiGenericTest {
	public static void main(String[] args) {
		
		TV	tv = new TV();
		SmartPhone	phone = new SmartPhone();
		
		Product<TV, Integer> p1 = new Product<>(tv, 100);
		Product<SmartPhone, String> p2 = new Product<>(phone, "Galaxy s10"); 
		
		p1.info();
		p2.info();
		
		
	}
		
}
