package sub1;

public class Banana {

		//변수
		private String country;
		private int price;
		
		//생성자
		public Banana(String country, int price) {
			this.country = country;
			this.price = price;
		}
		
		//메서드
		public void info()	{
			System.out.println("원산지 : "+country);
			System.out.println("가   격 : "+price);
		}
}
