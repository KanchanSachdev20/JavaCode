package JavaSessions;

public class MethodsInJava {
	
	//methods ---class data members
	
	//1: no input, no return
	//void ---- no return --function can not return anything
	public void test() {
		System.out.println("test method");
		
		int i = 10;
		System.out.println(i);
	}
	
	//2: no input, but some return
	public int totalAmount() {
		System.out.println("total amount...");
		int i =20;
		int tax = 5;
		int finalPayment = i+tax;
		return finalPayment;
	}
	
	public String trainerName() {
		System.out.println("trainer name");
		String name = "Naveen";
		return name;
	}

	//3. some input , some return
	public int add(int a, int b) {
		System.out.println("adding two numbers...");
		int sum = a+b;
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		//create the object
		MethodsInJava obj = new MethodsInJava();
		obj.test();
		
		int payment = obj.totalAmount();
		System.out.println(payment);
		
		String name = obj.trainerName();
		System.out.println(name);
		
		int s1 = obj.add(20, 30);
		System.out.println(s1);
		
		int s2 = obj.add(30, 40);
		System.out.println(s2-5);
	}

}
