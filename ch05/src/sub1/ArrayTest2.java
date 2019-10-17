package sub1;

/*
 * 날짜 : 2019/10/15
 * 이름 : 이다함
 * 내용 : 다차원 배열 실습하기
 */

public class ArrayTest2 {
	public static void main(String[] args) {
		
		//1차원 배열
		int score[] = {80, 60, 78, 69, 87, 92};
		int sum = 0;
		
		for(int i=0; i<6; i++) {
			sum += score[i];
		}
		
		
		System.out.println("점수의 총합 : "+sum);
		System.out.println("점수의 평균 : "+sum/score.length); //~.length : 배열의 길이
		
		//배열의 반복문
		int jumsu[] = {10, 20, 30, 40, 50, 60};
		int total = 0;
		
		for(int n : jumsu) {
			total += n;
		}
		System.out.println("jumsu의 합 : "+total);
		
		//2차원 배열 (행렬) 첫번째[]는 행 두번째[]는 열
		int arr[][] = {{  1, 2, 3}, //0번째 행
					   {  4, 5, 6}, //1번째 행
					   {  7, 8, 9}, //2번째 행
					   { 10,11,12}};//3번째 행
		
		for(int a=0; a<4; a++) {
			
			for(int b=0; b<3; b++) {
				System.out.println("arr["+a+"]["+b+"] = "+arr[a][b]);
			}
		}
	}
}
