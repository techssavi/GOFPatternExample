package ss.gofpattern.factory;

import static java.lang.System.out;

public class Bicyle implements Vehicle {
	
	private static final String TYPE="BICYCLE";

	public String type() {
		
		out.println("Bicycle type");
			return TYPE;
	}

}
