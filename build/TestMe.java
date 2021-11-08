import bm.ProgramJava;

/**
 * This is a simple Java program
 * created to provide an example of how an ANT script
 * can Turn Debug messages OFF, compile, and JAR a java file.
 * @author: Jason Grembi
 */
public class TestMe {
	/** A constant that controlls messge output */
	private final static boolean DEBUG = false;

/**
 * TestMe constructor comment.
 */
public TestMe() {
	super();
}
	/**
	 * This method writes debug statements when the
	 * constant is true.
	 */
	public static void debug(String s) {

		if (DEBUG) {
			System.out.println(s);
		}
	}

	/**
	 * This method is the main driver
	 * for this class.
	 *
	 * @param args java.lang.String[]
	 */
	public static void main(String[] args) {
		if (DEBUG){
			debug("I am about to create the ProgramJava class and call the method");
		}
		ProgramJava pj = new ProgramJava();
		pj.writeMessage();

	}
}
