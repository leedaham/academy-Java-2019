package sub3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
��¥ : 2019/11/05
�̸� : �̴���
���� : ���� ���� ����� ��Ʈ�� �ǽ��ϱ�/���� p1032
 */

public class BufferIOTest {
	public static void main(String[] args) throws IOException {

		String file1 = "C:\\Users\\java\\Desktop\\cameron.jpg";
		String file2 = "C:\\Users\\java\\Desktop\\cameron2.jpg";

		//����� ��Ʈ�� ���� �� ���� ����
		FileInputStream fis = new FileInputStream(file1);
		FileOutputStream fos = new FileOutputStream(file2);
		
		//���� ��Ʈ�� ���� �� ���� ����
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		

		//�Է� ��Ʈ������ ������ �б�
		while(true) {

			int data = bis.read();

			if(data == -1) {
				break; //���̻� ���� �����Ͱ� ������
			}
			//��� ��Ʈ������ ������ ����
			bos.write(data);
		}

		fis.close();
		fos.close();
		System.out.println();
		System.out.println("��Ʈ�� �۾� ��");
	}
}
