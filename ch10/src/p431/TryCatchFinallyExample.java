package p431;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			Class clazz = class.forName("java.lang.String2");
		}catch(ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
	}
}
