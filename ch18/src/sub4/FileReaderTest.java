package sub4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/*
��¥ : 2019/11/05
�̸� : �̴���
���� : ���� ���� ��Ʈ�� �ǽ��ϱ�/���� p1032
 */

public class FileReaderTest {
	public static void main(String[] args) throws IOException {

		String file1 = "C:\\Users\\java\\Desktop\\sample1.txt";
		// String file2 = "C:\\Users\\java\\Desktop\\sample2.txt";

		//�Է� ��Ʈ�� ���� �� ���� ����
		FileReader fr = new FileReader(file1);

		//��� ��Ʈ�� ���� �� ���� ����

		//�Է� ��Ʈ������ ������ �б�
		while(true) {

			int data = fr.read();

			if(data == -1) {
				break; //���̻� ���� �����Ͱ� ������
			}

			//��� ��Ʈ������ ������ ����
			char ch = (char) data;
			System.out.print(ch);
		}

		fr.close();

		System.out.println("\n��Ʈ�� �۾� ��");
	}
}

