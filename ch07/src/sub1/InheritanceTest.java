package sub1;

/*
날짜 : 2019/10/17
이름 : 이다함
내용 : 클래스 상속 실습하기/교재 p288
 */

public class InheritanceTest {

	public static void main(String[] args) {
		
		StockAccount kw = new StockAccount("키움증권", "121-11-1234", "김춘추", 100000, "삼성전자", 10, 30000);
		kw.deposit(30000);
		kw.buy(15);
		kw.sell(5);
		kw.info();	//info는 Account(부모)에도 있고 StockAccount(자식)에도 있다. 기본적으로 자식에 있는 info가 실행됨.
		//Account에 있는 info를 실행하려면 StockAccount(자식)의 info안에서 부모의 info를 실행시키면 됨.
	
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
