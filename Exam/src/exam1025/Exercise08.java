package exam1025;

/*
 * ��¥ : 2019/10/25
 * �̸� : �̴���
 * ���� : Exercise08-3
 */

public class Exercise08 {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run();
		tire.run();
	}
}
