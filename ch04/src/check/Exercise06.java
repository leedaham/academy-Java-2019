package check;

public class Exercise06 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {				//for, i�� 1���� 5���� �����Ѵ�.
			for(int k=1; k<=i;k++) {		//for, k�� 1���� 5���� �����Ѹ� *�� ����Ѵ�.
				System.out.print("*");		
				if(k==i) {					//���� k�� i�� ���ٸ� ���� ����.
					System.out.println();
				}
			}
		}
	}
}
