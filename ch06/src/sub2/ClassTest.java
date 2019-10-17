package sub2;

/*
 * ��¥ : 2019/10/16
 * �̸� : �̴���
 * ���� : �ڹ� Ŭ���� �ǽ��ϱ�
 */
/*
 	Ŭ���� = ��ü (Object)
 	�ڹ� ���α׷� = ��ü ���� ���α׷� (Object Oriented Program, OOP)
 */
public class ClassTest {
	
	public static void main(String[] args) {
	
		//�������� ��ü���� �� �ʱ�ȭ
		Account kb = new Account("��������", "121-11-1234", "������", 10000);
		
		//���Ȱ��
		kb.deposit(20000);
		kb.withdraw(5000);
		//kb.money -= 1; // ����ڵ� -> ��������� ĸ��ȭ(private)�� ���� ����ڵ� ����
		
		kb.info();
		
		//�츮���� ��ü���� �� �ʱ�ȭ
		Account wr = new Account("�츮����", "1124801-8522", "���ؿ�", 150000);
		
		//���Ȱ��
		wr.deposit(100000);
		wr.withdraw(1500);
		wr.info();
	}
}
