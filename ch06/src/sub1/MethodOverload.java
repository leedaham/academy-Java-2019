package sub1;

/*
 * ��¥ : 2019/10/15
 * �̸� : �̴���
 * ���� : overload method(�Լ�) �ǽ��ϱ�
 */

public class MethodOverload {

	public static void main(String[] args) {
		overload(1);
		overload(1,2);
		overload("������");
		overload(true);
	}
	
	//overload method : method�̸��� �Ȱ����� �Ű������� �����ϴ� method.
	public static void overload(int a) {
		System.out.println("ù��° �����ε� �޼��� ����...");
	}
	public static void overload(int a, int b) {
		System.out.println("�ι�° �����ε� �޼��� ����...");
	}
	public static void overload(String name) {
		System.out.println("����° �����ε� �޼��� ����...");
	}
	public static void overload(boolean isOk) {
		System.out.println("�׹�° �����ε� �޼��� ����...");
	}
	
	
}
