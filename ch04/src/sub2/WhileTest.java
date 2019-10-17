package sub2;

/*
 * 날짜 : 2019/10/14
 * 이름 : 이다함
 * 내용 : while문 실습하기
 */

public class WhileTest {
	
	public static void main(String[] args) {
		
		//1부터 10까지 합.  while(조건) - 조건이 true면 실행함. 초기식이나 증감식은 while문 밖에 있음.
		int k = 1;
		int sum = 0;
		
		while(k<=10) {
			sum += k;
			k++;
		}
		
		System.out.println("1부터 10까지 합 : "+sum);
		
		// do ~ while 문. 무조건 최초 1번은 반복을 하는 반복문.
		int total = 0;
		int i = 1;
		
		do {
			if(i%2 == 1) {
				total += i;
			}
			i++;
		}while(i<=10);

		System.out.println("1부터 10까지  홀수 합 : "+total);
		
		//break, while문은 true조건으로 많이 쓴다.
		int num = 0;
		
		while(true) {
			
			num++;
			
			if(num%5 == 0 && num%7 == 0) {
				break; //반복문 탈출
			}
			
		}

		System.out.println("5와 7의 최소공배수 : "+num);
		
		//continue
		int tot = 0;

		for(int a=1; a<=10; a++) {
			if(a%2 == 0) {
				continue; //조건에 걸리면 다시 위로 보내버림. 밑으로 안내려가고.
			}
			tot += a;
		}
		System.out.println("1부터 10까지 홀수합 : "+tot);
		
	}	
}
