package sub1;

public class StockAccount extends Account{

	//Ư��(��� ����)
	
	private String stock;	//�ֽ�
	private int amount;		//����
	private int stockPrice;	//�ֽ� �ϳ��� ����.
	
	//������
	public StockAccount(String bank, String id, String name, int money, String stock, int amount, int stockPrice) {
		super(bank, id, name, money); //�θ�Ŭ������ ������ ����.
	
		this.stock = stock;
		this.amount = amount;
		this.stockPrice = stockPrice;
		//�θ�(Account)Ŭ������ �����͸� �޾Ƽ� �ڽ�(StockAccount)���� ����Ѵ�.	
	}
	//���(��� �޼���)

	public void sell(int amount) {
		this.amount -= amount;
		
	}
	public void buy(int amount) {
		this.amount += amount;
	}
	
	public void info() {
		super.info();
		System.out.println("===========================");
		System.out.println("�ֽ����� : "+stock);
		System.out.println("�ֽİ��� : "+stockPrice);
		System.out.println("�ֽļ��� : "+amount);
		System.out.println("---------------------------");
	}
	
	
	
	
	
}
