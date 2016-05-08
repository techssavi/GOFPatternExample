package ss.gofpattern.factory;

public enum VehicleType {

	BICYLE("BICYCLE"), SCOOTER("SCOOTER"), RICKSHAW("RICKSHAW");

	private String value;

	private VehicleType(String s) {
		this.value = s;
	}
}
