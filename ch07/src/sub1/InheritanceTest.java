package sub1;

/*
��¥ : 2019/10/17
�̸� : �̴���
���� : Ŭ���� ��� �ǽ��ϱ�/���� p288
 */

public class InheritanceTest {

	public static void main(String[] args) {
		
		StockAccount kw = new StockAccount("Ű������", "121-11-1234", "������", 100000, "�Ｚ����", 10, 30000);
		kw.deposit(30000);
		kw.buy(15);
		kw.sell(5);
		kw.info();	//info�� Account(�θ�)���� �ְ� StockAccount(�ڽ�)���� �ִ�. �⺻������ �ڽĿ� �ִ� info�� �����.
		//Account�� �ִ� info�� �����Ϸ��� StockAccount(�ڽ�)�� info�ȿ��� �θ��� info�� �����Ű�� ��.
	
		SmartPhone iphone = new SmartPhone("A10", "4GB", "128GB", "iphone X", "010-1234-1234", 100);
		SmartPhone galaxy = new SmartPhone("2.3GHz", "4GB", "516GB", "galaxy s10", "010-1234-1235", 110);
		
		iphone.info();
		iphone.calc();
		iphone.internet();
		iphone.call();

		galaxy.info();
		galaxy.calc();
		galaxy.internet();
		galaxy.call();
		
		
	}
	
}
