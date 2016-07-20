package factorymethodlab;

public class DebuggerCreatorFactory extends DebuggerCreator {
	public static DebuggerCreator traceCreatorFactory ;

	public static DebuggerCreator getFactory(){
		if (traceCreatorFactory==null) {
			traceCreatorFactory=new DebuggerCreatorFactory();
		}
		return traceCreatorFactory;
	}
	@Override
	public Trace createTrace(String type) {
		// TODO Auto-generated method stub
		if (type.matches("trace.log")) {
			return new FileTrace();
		}else if (type.matches("console")) {
			return new ConsoleTrace();
		}
		return null;
	}

}
