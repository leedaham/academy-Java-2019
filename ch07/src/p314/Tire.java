package p314;

public class Tire {
	//�ʵ�
	public int maxRotation;			//�ִ� ȸ����(Ÿ�̾����)
	public int accumulateRotation;	//���� ȸ����
	public String location;			//Ÿ�̾��� ��ġ
	
	//������
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//�޼ҵ�
	public boolean roll() {
		++accumulateRotation;	//���� ȸ���� 1����
		if(accumulateRotation<maxRotation) {
			System.out.println(location + " Tire ����: "+(maxRotation-accumulateRotation)+"ȸ");
			return true;
		}else {
			System.out.println("*** " + location + "Tire ��ũ ***");
			return false;
		}
	}
	
	
	
}
