final class Singleton {
	
	private static Singleton s;
	private final String GREETING;
	
	private Singleton() {
		this.GREETING = "Hello, World!";
	}
	
	static final Singleton getInstance() {
		if (s == null) {
			s = new Singleton();
		}
		return s;
	}
	
	final String getMsg() {
		return GREETING;
	}
}
