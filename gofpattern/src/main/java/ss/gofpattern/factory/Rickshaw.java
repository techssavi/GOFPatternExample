package ss.gofpattern.factory;


import static java.lang.System.out;

public class Rickshaw implements Vehicle {

	private static final String TYPE="RICKSHAW";
	
	public String type() {
		out.println(TYPE);
		return TYPE;
	}

}
