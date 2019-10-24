package p375;

import p374.Bus;
import p374.Vehicle;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); - Vehicle인터페이스에는 checkFare()가 없어서 안됨.
		
		Bus bus = (Bus) vehicle; //강제타입변환
		
		bus.run();
		bus.checkFare();
	}
}
