public class MySingleton {
	private static MySingleton INSTANCE =null;

	public synchronized static MySingleton getInstance() {
		if(INSTANCE==null)
			INSTANCE=new MySingleton();
		return INSTANCE;
	}

	private MySingleton() {
		
	}
}
