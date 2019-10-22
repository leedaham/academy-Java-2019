package sub2;

/*
날짜 : 2019/10/22
이름 : 이다함
내용 : 다양한 예외처리 실습하가 /교재 p433
 */

public class VarietyExceptionTest {
	public static void main(String[] args) {
		
		// 범위에 벗어난 인덱스값 참조 에러
		try {
			int arr[] = {1, 2, 3};

			for(int i = 0; i < arr.length ; i++) {
				System.out.println(arr[i]);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// NullPoint 에러 (null : 없음)
		try {
			Tiger t = new Tiger();
			Eagle e = null;

			t.move();
			e.move();
		}catch (NullPointerException e) {
			e.printStackTrace();
		}

		// 캐스팅 에러
		try {
			Animal ani = new Tiger();	//업캐스트
			Tiger t = (Tiger)ani;		//다운캐스팅
			Shark s = (Shark)ani;		//잘못된 캐스팅
		}catch (ClassCastException e) {
			e.printStackTrace();
		}

		System.out.println("프로그램 종료...");
	}
}
