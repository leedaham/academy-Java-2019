package p375;

import p374.Bus;
import p374.Vehicle;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); - Vehicle�������̽����� checkFare()�� ��� �ȵ�.
		
		Bus bus = (Bus) vehicle; //����Ÿ�Ժ�ȯ
		
		bus.run();
		bus.checkFare();
	}
}
