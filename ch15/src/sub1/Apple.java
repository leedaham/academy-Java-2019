package sub1;

// 자바의 모든 클래스는 Object를 상속받는다. 자바의 최상위 클래스.
public class Apple extends Object{

		//변수
		private String country;
		private int price;
		
		//생성자
		public Apple(String country, int price) {
			this.country = country;
			this.price = price;
		}
		
		//메서드
		public void info()	{
			System.out.println("원산지 : "+country);
			System.out.println("가   격 : "+price);
		}
}
