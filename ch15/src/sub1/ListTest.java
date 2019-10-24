package sub1;

import java.util.ArrayList;
import java.util.List;

/*
날짜 : 2019/10/24
이름 : 이다함
내용 : 컬렉션 프레임워크 List 실습하기/교재 p724
 */

//	컬렉션	(자료구조 : 객체만 취급, 일반타입 변수 사용X, 다 Generic 클래스임)
// 1) List - ArrayList 이것만 쓸 줄 알면 됨.	(배열식 - 순서가 중요함. 중복 허용함. 하지만 배열과 다름. 배열보다 많이 사용.) 
// 2) Set - HashSet 이것만 쓸 줄 알면 됨.		(집합 - 순서가 의미없음. 중복 허용안함.) 
// 3) Map - HashMap 이것만 쓸 줄 알면 됨.		(서류에 라벨링해서 서류상자에 차곡차곡 쌓아둔 형태. 라벨링 보고 데이터 추출.) 

public class ListTest {
	public static void main(String[] args) {
		
		//  리스트 생성 및 데이터 저장
		List<Integer> list1 = new ArrayList<>();	//ArrayList는 List 인터페이스를 구현한것이
		
		list1.add(1);		//lis1에 1을 추가한다.
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.remove(2);	//list1의 2번째를 삭제한다.
		list1.add(0, 5);	//list1의 0번째에 5를 더한다.
		list1.add(3, 3);	//list1의 2번째에 3를 더한다.
		
		
		System.out.println("list1 1번째 원소 : "+list1.get(0));
		System.out.println("list1 2번째 원소 : "+list1.get(1));
		System.out.println("list1 3번째 원소 : "+list1.get(2));
		System.out.println("list1 4번째 원소 : "+list1.get(3));
		System.out.println("list1 5번째 원소 : "+list1.get(4));
		
		// 리스트 생성 및 데이터 저장
		List<String> list2 = new ArrayList<>();
		
		list2.add("김유신");
		list2.add("이순신");
		list2.add("정약용");
		
		// 리스트 반복문
		for(String name : list2) {
			System.out.println("list2원소 : "+name);
		}
		
		// 사과 리스트 생성 및 사과 저장
		Apple a1 = new Apple("한국", 3000);
		Apple a2 = new Apple("미국", 2000);
		Apple a3 = new Apple("일본", 1000);
		
		List<Apple> list3 = new ArrayList<>();
		
		list3.add(a1);
		list3.add(a2);
		list3.add(a3);
		
		//사과전체 갯수
		System.out.println("전체 사과 갯수 : "+list3.size());
		
		//사과출력
		Apple apple = list3.get(1);
		apple.info();
		
		list3.get(2).info();
	}
}
