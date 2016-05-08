package ss.gofpattern.factory;

import static java.lang.System.out;

public class Scooter implements Vehicle {

	private static final String TYPE = "SCOOTER";

	public String type() {
		out.println(TYPE);

		return TYPE;
	}

}
