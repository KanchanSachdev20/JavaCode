package Interface_Assignment;

public interface IndianUniversity {
	
	public void java();
	
	public void python();
	
	public void sql();
	
	public static void billing() {
		System.out.println("billing");
	}
	
	default void test() {
		System.out.println("test");
	}

}
