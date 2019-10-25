package exam1025;

/*
 * 날짜 : 2019/10/25
 * 이름 : 이다함
 * 문항 : Exercise04
 */

public class Exercise04 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
			for(int i=0; i<array.length; i++) {
				if(max<array[i]) {
					max = array[i];
				}
			}
		System.out.println("배열의 최대값: " + max);
	}
}
