package ss.gofpattern.factory;

public class FactoryMain {
	
	
	
	
	
	
	public static void main(String...args) {
		new FactoryMain();
		
		VechicleFactory.getVehicle(VehicleType.BICYLE).type();
		VechicleFactory.getVehicle(VehicleType.SCOOTER).type();
		VechicleFactory.getVehicle(VehicleType.RICKSHAW).type();
		
	}

}
