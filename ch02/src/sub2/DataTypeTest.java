package sub2;

/*
 * ��¥ : 2019.10.10
 * �̸� : �̴���
 * ���� : ������ �ڷ���(������ Ÿ��)
 */

public class DataTypeTest {
	
	public static void main(String[] args) {
	
		// ������
		byte var1 = 127; 				 	//byte�� 127����. 128 �� ����.
		short var2 = 2; 					//byte���� ũ�� ����.
		int var3 = 2147483647;  			//2147483647���� ����. int�� �� Ŀ����.
		long var4 = 9223372036854775807L;   // <-���� ����. �� �� ����. �� �� L���̻� �ʿ�.
		
		// �Ǽ���
		float var5 = 1.123456789f; 			//�� �� f���̻� �ʿ�.
		double var6 = 1.1234567890123456789;
		
		// ����
		boolean var7 = true;
		boolean var8 = false;
		
		// ������
		char ch1 = 'A'; 					//''�� ǥ��.
		char ch2 = '��';
		
		// ���ڿ�
		String str1 = "A"; 					// ""�� ǥ��. �ܾ �� ���ڵ� �����ؼ� �ַ� ����.
		String str2 = "Apple";
		String str3 = "���";
		
		System.out.println("var1 : "+var1);
		System.out.println("var2 : "+var2);
		System.out.println("var3 : "+var3);
		System.out.println("var4 : "+var4);
		System.out.println("var5 : "+var5);
		System.out.println("var6 : "+var6);
		System.out.println("var7 : "+var7);
		System.out.println("var8 : "+var8);
		System.out.println("ch1 : "+ch1);
		System.out.println("ch2 : "+ch2);
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		System.out.println("str3 : "+str3);
		
	}
	
}
