package exam1025;

/*
 * ��¥ : 2019/10/25
 * �̸� : �̴���
 * ���� : Exercise06-2
 */

public class Child extends Parent{
	private String name;
	
	public Child() {
		this("���ѹα�");
		System.out.println("Child() call");
	}

	public Child(String name){
		this.name = name;
		System.out.println("Child(String nation) call");
	}
}

