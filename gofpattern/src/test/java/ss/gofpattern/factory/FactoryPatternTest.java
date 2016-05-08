package ss.gofpattern.factory;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FactoryPatternTest {
	@Test
	public void testVechileType() {

		final Vehicle bicycleType = VechicleFactory.getVehicle(VehicleType.BICYLE);

		assertNotNull("Unexpected null ", bicycleType);
		assertTrue("Unexpected type for bicycle", bicycleType.type().equals("BICYCLE"));

		final Vehicle scooterType = VechicleFactory.getVehicle(VehicleType.SCOOTER);

		assertNotNull("Unexpected null ", scooterType);
		assertTrue("Unexpected type for scooter", scooterType.type().equals("SCOOTER"));

	}

}
