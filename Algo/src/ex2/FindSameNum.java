package ex2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 날짜 : 2019/10/25
 * 이름 : 이다함
 * 내용 : 알고리즘 실습 - 중복숫자 찾기
 * 
 * 개발과정
 * 1) numbs1의 첫번째 원소 6을 뒤에 있는 3, 5, 3, 7과 차례로 비교, 6과 중복된 숫자 발견 못함.
 * 2) 두번째 원소 3을 뒤에 있는 원소 5, 3, 7과 차례로 비교, 앞에 있는 6과는 이미 비교했음, 4번째 자리 3과 중복 발견. 
 * 3) 발견된 중복 숫자 3을 집합 resultSet에 저장
 * 4) resultSet에 저장된 데이터 출력
 */
 
public class FindSameNum {

	public static void main(String[] args) {

		// 개발용 데이터
		int[] numbs1 = {6, 3, 5, 3, 7};

		// 테스트용 데이터
		int[] numbs2 = {1, 5, 9, 7, 5, 3, 2, 5, 3, 1};

		Set<Integer> resultSet = fineSameNumber(numbs2);

		// 집합 출력

	}
	//fineSameNumber 메서드 정의
	public static Set<Integer> fineSameNumber(int[] array) {

		Set<Integer> resultSet = new HashSet<>();

		for (int i=0; i<array.length; i++) {
			for (int k = (i+1); k < (array.length) ; k++ ) {
				if (array[i] == array[k]) {
					resultSet.add(array[k]);
				}
			}
		}
		Iterator<Integer> it = resultSet.iterator(); //집합 원소를 추출해주는 반복자

		while(it.hasNext()) {
			System.out.println("원소 : "+it.next());
		}

		return null;
	}
}