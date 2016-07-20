package factorymethodlab;

public class Client {

	public static void main(String[] args){
		DebuggerCreator factory=DebuggerCreatorFactory.getFactory();
		Trace consoleDebugger=factory.createTrace("console");
		consoleDebugger.setDebug(true);
		consoleDebugger.debug("it is console debug");
		consoleDebugger.error("it is console error");
		
		
		Trace fileDebugger=factory.createTrace("trace.log");
		fileDebugger.setDebug(true);
		fileDebugger.debug("it is file debug");
		fileDebugger.error("it is file error");
	}
}
