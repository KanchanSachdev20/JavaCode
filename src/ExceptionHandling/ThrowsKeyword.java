package ExceptionHandling;

public class ThrowsKeyword {

	
	public void m1() throws RuntimeException{
		System.out.println("m1 method");
		m2();
	}
	
	public void m2() throws RuntimeException{
		System.out.println("m2 method");
		
		try {
		m3();
		}
		catch(RuntimeException e) {
			System.out.println("AE is coming");
			e.printStackTrace();
		}
	}
	
	public void m3() throws RuntimeException{
		System.out.println("m3 method");
		int i =9/0;
	}
	public static void main(String[] args) throws RuntimeException{
		
		ThrowsKeyword obj= new ThrowsKeyword();
		obj.m1();
		System.out.println("bye");
		

	}

}
