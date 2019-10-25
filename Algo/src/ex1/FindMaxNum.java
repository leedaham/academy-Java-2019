package ex1;

/*
 * 날짜 : 2019/10/25
 * 이름 : 이다함
 * 내용 : 알고리즘 실습 - 최대값 찾기 
 * 
 * 개발과정
 * 1) 배열의 1번째 숫자 17을 최댓값으로 maxNum에 저장
 * 2) 2번째 숫자 92를 현재 최댓값 17과 비교, 92는 17보다 크므로 최댓값을 92로 바꿔 저장
 * 3) 3번째 숫자 18을 현재 최댓값인 92와 비교, 18은 92보다 작으므로 maxNum에 저장하지 않음.
 * 4) 4번째 숫자부터 마지막까지 같은 과정을 반복.
 */
public class FindMaxNum {
	
	public static void main(String[] args) {
		
		// 개발용 데이터
		int numbs[] = {17, 92, 18, 33, 58, 7, 33, 42};
		
		int maxNum = numbs[0];
		
		for(int i=0; i < numbs.length ; i++) {
			if(numbs[i] > maxNum ) {
				maxNum = numbs[i];
			}
		}
		
		System.out.println("numbs 최대값 : "+maxNum);
	}
}