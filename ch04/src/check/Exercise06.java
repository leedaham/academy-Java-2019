package check;

public class Exercise06 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {				//for, i는 1부터 5까지 증가한다.
			for(int k=1; k<=i;k++) {		//for, k는 1부터 5까지 증가한며 *을 출력한다.
				System.out.print("*");		
				if(k==i) {					//만약 k와 i가 같다면 줄을 띄운다.
					System.out.println();
				}
			}
		}
	}
}
