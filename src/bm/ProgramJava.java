package bm;
/**
 * Insert the type's description here.
 * @author: Administrator
 */
public class ProgramJava {
	/** A constant that controlls messge output */
	private final static boolean DEBUG = true;
/**
 * ProgramJava constructor comment.
 */
public ProgramJava() {
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
	 * This method will check to see if the String is null,
	 * if it is, it will assign the String to emtpy.
	 * Then it will call the debug method
	 */
	public void writeMessage() {

		String s = "Old Man In the Sea";

		if (s == null) {
			s = "";
		}

		debug(s);
	}
}
