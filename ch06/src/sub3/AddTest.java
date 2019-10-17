package sub3;
/*
날짜 : 2019/10/16
이름 : 이다함
내용 : 클래스 메모리 생성 실습하기
 */
public class AddTest {

		public static void main(String[] args) {
			
			Adder ad1 = new Adder();
			ad1.x = 100;
			
			int[] arr = {10, 20, 30};
			
			ad1.add(100);
			System.out.println("ad1.x = "+ad1.x);
			
			ad1.add(ad1);
			System.out.println("ad1.x = "+ad1.x);
			
			ad1.add(arr);
			System.out.println("arr[0] = "+arr[0]);
			
			ad1 = ad1.addNew(ad1);
			System.out.println("ad1.x = "+ad1.x);
			
		}
}

/*
Adder란 public class 만듬.
 Adder에서 사용되는 x 값은 int.
 -Adder 내에서 사용되는 함수들
  add(int x) 	   : add함수에 변수 (int x)를 넣을시 Adder의 변수 x는 함수에 입력된 변수x에 50을 더한 값.
  add(int[] arr)   : add함수에 배열을 넣을시 배열의 첫번째 값을 ++한다.
  add(Adder a1)    : add에함수에 Adder 객체를 넣을시. 객체의 변수 x값에 40을 더한값이 객체의 변수 x값이 된다.
  addNew(Adder a2) : addNew함수에 (a2라는 Adder클래스)라는 변수를 넣으면  새로운 Adder클래스를 만들고 이를 a2라한다.
		   			  그리고 이 a2를 return한다.
-------------------------------------------------------------------------------------------------------------------------------------

Adder ad1 = new Adder ();   -ad1이라는 새로운 Adder 객체 생성.
ad1.x = 100;				-ad1이라는 Adder 객체의 기본 x값 100.

int [] arr = {10, 20, 30}; 	-arr배열 생성.

ad1.add(100};				-ad1 객체의 add함수 사용. 변수는 (정수 100). 
			 				  정수를 넣을시 기존 변수x에 50을 더한 값. 			  						즉 x의 값은, 150.

ad1.add(ad1);				-ad1 객체의 add함수 사용. 변수는 (Adder객체 ad1).
			 				  객체를 넣을시 객체의 변수 값 x에 40을 더한값이 객체의 변수값이 됨. 					즉 x의 값은, 190

ad1.add(arr);				-ad1 객체의 add함수 사용. 변수는 (arr배열)
			 				  배열을 넣을시 배열의 0번째 수에 ++연산.			  							즉 x의 값은, 11

ad1 = ad1.addNew(ad1);		-ad1은 ad1객체의 addNew함수 사용한 값이 된다. addNew함수의 변수는 (Adder객체 ad1).
			 				 ad1은 새로만들어진 객체 ad1과 같고 이를 return한다.
			 				 return한 값이 ad1의 값이 되며, 새로운 객체이기 때문에 x의 값은 0.	   				즉 x의 값은, 0
*/