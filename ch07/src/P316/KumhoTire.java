package P316;

import p314.Tire;

public class KumhoTire extends Tire{
	//�ʵ�
	//������
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
		//�޼ҵ�
		@Override
		public boolean roll() {
			++accumulateRotation;
			if(accumulateRotation<maxRotation) {
				System.out.println(location + " KumhoTire ����: " + (maxRotation-accumulateRotation)+"ȸ");
				return true;
			}else {
				System.out.println("*** " + location + "KumhoTire ��ũ ***");
				return false;
			}
	}
}
