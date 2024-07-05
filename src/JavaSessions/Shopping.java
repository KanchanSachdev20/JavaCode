package JavaSessions;

public class Shopping {

	//Method Overloading
	//within the same class, if you have number of methods:
	//1: with same name
	//2: with different parameters
	//3: with different num of param
	//with diff order of parameters
	//5: return type doesn't matter
	
	
	public void test() {
		System.out.println("test method");
	}
	
	public void test(int i) {
		System.out.println(i);
	}
	
	public void test(int i, int j) {
		System.out.println(i+j);
	}
	
	public void test(String p) {
		System.out.println(p);
	}
	
	public void test(String p, int q) {
		System.out.println(p+q);
	}
	
	public static void main(String[] args) {
		
	}

}
