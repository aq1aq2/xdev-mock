package fsoft.xdev.mock.utilities;

public class XDebugger {
	private static final boolean ON = true;
	private static final boolean OFF = false;
	private static final String TOKEN = "*** DEBUGGER ***";
	private static boolean state;
	
	static {
		state = ON;
	}
	
	public static void show(String msg) {
		if(state == ON) {
			System.out.println(TOKEN + " : " + msg);
		}
	}
	
	public static void turnOn() {
		state = ON;
	}
	
	public static void turnOff() {
		state = OFF;
	}
}
