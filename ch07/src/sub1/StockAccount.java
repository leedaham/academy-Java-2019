package sub1;

public class StockAccount extends Account{

	//특성(멤버 변수)
	
	private String stock;	//주식
	private int amount;		//수량
	private int stockPrice;	//주식 하나의 가격.
	
	//생성자
	public StockAccount(String bank, String id, String name, int money, String stock, int amount, int stockPrice) {
		super(bank, id, name, money); //부모클래스의 생성자 실행.
	
		this.stock = stock;
		this.amount = amount;
		this.stockPrice = stockPrice;
		//부모(Account)클래스의 데이터를 받아서 자식(StockAccount)에서 사용한다.	
	}
	//기능(멤버 메서드)

	public void sell(int amount) {
		this.amount -= amount;
		
	}
	public void buy(int amount) {
		this.amount += amount;
	}
	
	public void info() {
		super.info();
		System.out.println("===========================");
		System.out.println("주식종목 : "+stock);
		System.out.println("주식가격 : "+stockPrice);
		System.out.println("주식수량 : "+amount);
		System.out.println("---------------------------");
	}
	
	
	
	
	
}
