package factorymethodlab;

public class ConsoleTrace implements Trace{

	boolean debug=false;
	@Override
	public void setDebug(boolean debug) {
		
		this.debug=debug;
	}

	@Override
	public void debug(String message) {
		if (debug) {
			System.out.println("console debug message :"+message);
		}
	}

	@Override
	public void error(String message) {
		if (debug) {
			System.out.println("console error message :"+message);
		}
		
	}

}
