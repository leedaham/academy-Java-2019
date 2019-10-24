package sub3;

import java.util.HashMap;
import java.util.Map;

import sub1.Banana;

/*
��¥ : 2019/10/24
�̸� : �̴���
���� : �÷��� �����ӿ�ũ Map �ǽ��ϱ�/����p724
 */

public class MapTest {
	public static void main(String[] args) {
		
		// �� ���� �� ������ ����
		Map<Integer, String> map1 = new HashMap<>();
		
		map1.put(101, "�ѱ�");
		map1.put(102, "�̱�");
		map1.put(103, "�Ϻ�");
		map1.put(104, "�߱�");
		
		System.out.println("map1 ���� ���� : "+map1.size());
		
		// �� ���� ������
		String value= map1.get(101);
		
		System.out.println("value : "+value);
		System.out.println(map1.get(103));
		
		// �ٳ��� �� ���� �� �ٳ��� ����
		Map<String, Banana> map2 = new HashMap<>();
		map2.put("kor", new Banana("�ѱ�", 3000));
		map2.put("usa", new Banana("�̱�", 2000));
		map2.put("jpn", new Banana("�Ϻ�", 1000));
		
		// �̱� �ٳ��� ������
		Banana banana = map2.get("usa");
		banana.info();
		
		map2.get("kor").info();
	}
}
