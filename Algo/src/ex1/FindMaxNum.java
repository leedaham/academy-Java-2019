package ex1;

/*
 * ��¥ : 2019/10/25
 * �̸� : �̴���
 * ���� : �˰��� �ǽ� - �ִ밪 ã�� 
 * 
 * ���߰���
 * 1) �迭�� 1��° ���� 17�� �ִ����� maxNum�� ����
 * 2) 2��° ���� 92�� ���� �ִ� 17�� ��, 92�� 17���� ũ�Ƿ� �ִ��� 92�� �ٲ� ����
 * 3) 3��° ���� 18�� ���� �ִ��� 92�� ��, 18�� 92���� �����Ƿ� maxNum�� �������� ����.
 * 4) 4��° ���ں��� ���������� ���� ������ �ݺ�.
 */
public class FindMaxNum {
	
	public static void main(String[] args) {
		
		// ���߿� ������
		int numbs[] = {17, 92, 18, 33, 58, 7, 33, 42};
		
		int maxNum = numbs[0];
		
		for(int i=0; i < numbs.length ; i++) {
			if(numbs[i] > maxNum ) {
				maxNum = numbs[i];
			}
		}
		
		System.out.println("numbs �ִ밪 : "+maxNum);
	}
}