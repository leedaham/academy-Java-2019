package exam1025;

/*
 * ��¥ : 2019/10/25
 * �̸� : �̴���
 * ���� : Exercise07-1
 */

public class ShopService {
	private static ShopService instance = new ShopService();
	public ShopService() {}
	public static ShopService getInstance() {
		return instance;
	}
}
