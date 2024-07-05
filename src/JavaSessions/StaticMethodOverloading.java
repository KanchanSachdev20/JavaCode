package JavaSessions;

public class StaticMethodOverloading {

	public static void login() {
		
	}
	
    public static void login(int i) {
		
	}
    
    //can we overload main method ---> yes 
	public static void main(String[] args) {
		System.out.println("main method");

	}
	
	public static void main(String a) {
		System.out.println("main method" + a);

	}
	
     public static void main(int a) {
		System.out.println("main method" + a);

	}

     public static void main(int a, int b) {
    	 System.out.println("main method" + a +b);

      }

}
