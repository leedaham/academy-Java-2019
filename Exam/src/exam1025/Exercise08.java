package exam1025;

/*
 * 날짜 : 2019/10/25
 * 이름 : 이다함
 * 문항 : Exercise08-3
 */

public class Exercise08 {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run();
		tire.run();
	}
}
