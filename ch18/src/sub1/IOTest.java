package sub1;

import java.util.Scanner;

/*
��¥ : 2019/11/05
�̸� : �̴���
���� : �⺻ ����� ��Ʈ�� �ǽ��ϱ�/���� p994
 */

public class IOTest {
	public static void main(String[] args) {
		
		// �ý��� �⺻ �Է½�Ʈ��
		Scanner scan = new Scanner(System.in);	//Ű���� ��ü
		
		System.out.print("�̸� �Է� : ");
		String name = scan.nextLine();
		
		//�ý��� �⺻ ��½�Ʈ��
		System.out.println("�̸� : "+name);
	}
}
