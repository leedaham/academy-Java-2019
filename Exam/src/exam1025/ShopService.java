package exam1025;

/*
 * 날짜 : 2019/10/25
 * 이름 : 이다함
 * 문항 : Exercise07-1
 */

public class ShopService {
	private static ShopService instance = new ShopService();
	public ShopService() {}
	public static ShopService getInstance() {
		return instance;
	}
}
