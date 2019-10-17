package sub3;
/*
��¥ : 2019/10/16
�̸� : �̴���
���� : Ŭ���� �޸� ���� �ǽ��ϱ�
 */
public class AddTest {

		public static void main(String[] args) {
			
			Adder ad1 = new Adder();
			ad1.x = 100;
			
			int[] arr = {10, 20, 30};
			
			ad1.add(100);
			System.out.println("ad1.x = "+ad1.x);
			
			ad1.add(ad1);
			System.out.println("ad1.x = "+ad1.x);
			
			ad1.add(arr);
			System.out.println("arr[0] = "+arr[0]);
			
			ad1 = ad1.addNew(ad1);
			System.out.println("ad1.x = "+ad1.x);
			
		}
}

/*
Adder�� public class ����.
 Adder���� ���Ǵ� x ���� int.
 -Adder ������ ���Ǵ� �Լ���
  add(int x) 	   : add�Լ��� ���� (int x)�� ������ Adder�� ���� x�� �Լ��� �Էµ� ����x�� 50�� ���� ��.
  add(int[] arr)   : add�Լ��� �迭�� ������ �迭�� ù��° ���� ++�Ѵ�.
  add(Adder a1)    : add���Լ��� Adder ��ü�� ������. ��ü�� ���� x���� 40�� ���Ѱ��� ��ü�� ���� x���� �ȴ�.
  addNew(Adder a2) : addNew�Լ��� (a2��� AdderŬ����)��� ������ ������  ���ο� AdderŬ������ ����� �̸� a2���Ѵ�.
		   			  �׸��� �� a2�� return�Ѵ�.
-------------------------------------------------------------------------------------------------------------------------------------

Adder ad1 = new Adder ();   -ad1�̶�� ���ο� Adder ��ü ����.
ad1.x = 100;				-ad1�̶�� Adder ��ü�� �⺻ x�� 100.

int [] arr = {10, 20, 30}; 	-arr�迭 ����.

ad1.add(100};				-ad1 ��ü�� add�Լ� ���. ������ (���� 100). 
			 				  ������ ������ ���� ����x�� 50�� ���� ��. 			  						�� x�� ����, 150.

ad1.add(ad1);				-ad1 ��ü�� add�Լ� ���. ������ (Adder��ü ad1).
			 				  ��ü�� ������ ��ü�� ���� �� x�� 40�� ���Ѱ��� ��ü�� �������� ��. 					�� x�� ����, 190

ad1.add(arr);				-ad1 ��ü�� add�Լ� ���. ������ (arr�迭)
			 				  �迭�� ������ �迭�� 0��° ���� ++����.			  							�� x�� ����, 11

ad1 = ad1.addNew(ad1);		-ad1�� ad1��ü�� addNew�Լ� ����� ���� �ȴ�. addNew�Լ��� ������ (Adder��ü ad1).
			 				 ad1�� ���θ������ ��ü ad1�� ���� �̸� return�Ѵ�.
			 				 return�� ���� ad1�� ���� �Ǹ�, ���ο� ��ü�̱� ������ x�� ���� 0.	   				�� x�� ����, 0
*/