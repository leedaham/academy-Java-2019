package p462;

import java.util.HashMap;

import p461.Key;

public class KeyExample {
	public static void main(String[] args) {
		//Key ��ü�� �ĺ�Ű�� ����ؼ� String ���� �����ϴ� HashMap ��ü ����
		HashMap<Key, String> HashMap = new HashMap<Key, String>();
		
		// �ĺ�Ű "new Key(1)"�� "ȫ�浿"�� ������
		HashMap.put(new Key(1), "ȫ�浿");
		
		//�Ĕ�Ű "new Key(1)"�� "ȫ�浿"�� �о��
		String value = HashMap.get(new Key(1));
		System.out.println(value);
		
	}
}
