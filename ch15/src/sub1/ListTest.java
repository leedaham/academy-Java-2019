package sub1;

import java.util.ArrayList;
import java.util.List;

/*
��¥ : 2019/10/24
�̸� : �̴���
���� : �÷��� �����ӿ�ũ List �ǽ��ϱ�/���� p724
 */

//	�÷���	(�ڷᱸ�� : ��ü�� ���, �Ϲ�Ÿ�� ���� ���X, �� Generic Ŭ������)
// 1) List - ArrayList �̰͸� �� �� �˸� ��.	(�迭�� - ������ �߿���. �ߺ� �����. ������ �迭�� �ٸ�. �迭���� ���� ���.) 
// 2) Set - HashSet �̰͸� �� �� �˸� ��.		(���� - ������ �ǹ̾���. �ߺ� ������.) 
// 3) Map - HashMap �̰͸� �� �� �˸� ��.		(������ �󺧸��ؼ� �������ڿ� �������� �׾Ƶ� ����. �󺧸� ���� ������ ����.) 

public class ListTest {
	public static void main(String[] args) {
		
		//  ����Ʈ ���� �� ������ ����
		List<Integer> list1 = new ArrayList<>();	//ArrayList�� List �������̽��� �����Ѱ���
		
		list1.add(1);		//lis1�� 1�� �߰��Ѵ�.
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.remove(2);	//list1�� 2��°�� �����Ѵ�.
		list1.add(0, 5);	//list1�� 0��°�� 5�� ���Ѵ�.
		list1.add(3, 3);	//list1�� 2��°�� 3�� ���Ѵ�.
		
		
		System.out.println("list1 1��° ���� : "+list1.get(0));
		System.out.println("list1 2��° ���� : "+list1.get(1));
		System.out.println("list1 3��° ���� : "+list1.get(2));
		System.out.println("list1 4��° ���� : "+list1.get(3));
		System.out.println("list1 5��° ���� : "+list1.get(4));
		
		// ����Ʈ ���� �� ������ ����
		List<String> list2 = new ArrayList<>();
		
		list2.add("������");
		list2.add("�̼���");
		list2.add("�����");
		
		// ����Ʈ �ݺ���
		for(String name : list2) {
			System.out.println("list2���� : "+name);
		}
		
		// ��� ����Ʈ ���� �� ��� ����
		Apple a1 = new Apple("�ѱ�", 3000);
		Apple a2 = new Apple("�̱�", 2000);
		Apple a3 = new Apple("�Ϻ�", 1000);
		
		List<Apple> list3 = new ArrayList<>();
		
		list3.add(a1);
		list3.add(a2);
		list3.add(a3);
		
		//�����ü ����
		System.out.println("��ü ��� ���� : "+list3.size());
		
		//������
		Apple apple = list3.get(1);
		apple.info();
		
		list3.get(2).info();
	}
}
