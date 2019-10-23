package sub3;

/*
날짜 : 2019/10/23
이름 : 이다함
내용 : AutoBox, AutoUnbox 실습하기/교재 p527
 */

public class AutoBoxTest {
	public static void main(String[] args) {
		
		//Auto Box
		Boolean	box1 = false;
		Integer box2 = 2;
		Double	box3 = 3.14;
		
		System.out.println("box1 : "+box1);
		System.out.println("box2 : "+box2);
		System.out.println("box3 : "+box3);
		
		//Auto Unboxing
		boolean	ubx1 = box1;
		int		ubx2 = box2;
		double	ubx3 = box3;
		
		System.out.println("ubx1 : "+ubx1);
		System.out.println("ubx2 : "+ubx2);
		System.out.println("ubx3 : "+ubx3);
	} 
}

//String	-> primitive	: Wrapper.parse~
//primitive	-> wrapper		: auto.Boxing
//Wrapper	-> String		: toString
//String	-> wrapper		: Wrapper.valueOf
//Wrapper	-> primitive	: auto.Unboxing
//primitive	-> String		: String.valueOf