package sub1;

/*
 * ��¥ : 2019/10/15
 * �̸� : �̴���
 * ���� : method type �ǽ��ϱ�
 */

public class MethodTypeTest {

	public static void main(String[] args) {
		
		int rs1 = type1(2, 4);
		System.out.println("rs1 : "+rs1);
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		type2(arr);
		
		double rs2 = type3() * 5 * 5;
		System.out.println("�������� 5�� ���� ���� : "+rs2);
		
		type4();
		
		//������ �Լ� ����
		gugudan(2);
		gugudan(5);
		gugudan(7);
		
	}
	//gugudan 
	public static void gugudan(int n) {
		
		System.out.println(n+"��");
		
		for(int i=1; i<10; i++) {
			System.out.println(n+" X "+ i +" = "+n*1);
		}
		
	}
	
	
	
	//type 1 : parameta O, return O
	public static int type1(int a, int b) {
		int c = a + b;
		return c;
	}
	
	//type 2 : parameta O, return X
	public static void type2(int[] score) {
		int sum = 0;
		
		for(int s : score) {
			sum += s;
		}
		System.out.println("�迭�� �� : "+sum);
	}
	
	//type 3 : parameta X, return O
	public static double type3() {
		
		return 3.14;
	}
	
	//type 4 : parameta X, return X
	public static void type4() {
		
		int result = type1(3,7);
		System.out.println("type4�� result : "+result);
	}
}
