package ex2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * ��¥ : 2019/10/25
 * �̸� : �̴���
 * ���� : �˰��� �ǽ� - �ߺ����� ã��
 * 
 * ���߰���
 * 1) numbs1�� ù��° ���� 6�� �ڿ� �ִ� 3, 5, 3, 7�� ���ʷ� ��, 6�� �ߺ��� ���� �߰� ����.
 * 2) �ι�° ���� 3�� �ڿ� �ִ� ���� 5, 3, 7�� ���ʷ� ��, �տ� �ִ� 6���� �̹� ������, 4��° �ڸ� 3�� �ߺ� �߰�. 
 * 3) �߰ߵ� �ߺ� ���� 3�� ���� resultSet�� ����
 * 4) resultSet�� ����� ������ ���
 */
 
public class FindSameNum {

	public static void main(String[] args) {

		// ���߿� ������
		int[] numbs1 = {6, 3, 5, 3, 7};

		// �׽�Ʈ�� ������
		int[] numbs2 = {1, 5, 9, 7, 5, 3, 2, 5, 3, 1};

		Set<Integer> resultSet = fineSameNumber(numbs2);

		// ���� ���

	}
	//fineSameNumber �޼��� ����
	public static Set<Integer> fineSameNumber(int[] array) {

		Set<Integer> resultSet = new HashSet<>();

		for (int i=0; i<array.length; i++) {
			for (int k = (i+1); k < (array.length) ; k++ ) {
				if (array[i] == array[k]) {
					resultSet.add(array[k]);
				}
			}
		}
		Iterator<Integer> it = resultSet.iterator(); //���� ���Ҹ� �������ִ� �ݺ���

		while(it.hasNext()) {
			System.out.println("���� : "+it.next());
		}

		return null;
	}
}