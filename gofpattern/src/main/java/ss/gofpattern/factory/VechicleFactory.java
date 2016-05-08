package ss.gofpattern.factory;

public class VechicleFactory {

	public static Vehicle getVehicle(VehicleType type) {
		switch (type) {
		case BICYLE:
			return new Bicyle();

		case RICKSHAW:
			return new Rickshaw();

		case SCOOTER:
			return new Scooter();

		default:
			break;

		}
		return null;

	}

}
