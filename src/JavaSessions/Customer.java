package JavaSessions;

public class Customer {

	String name;
	int age;
	double salary;
	char gender;
	boolean isActive;
	String dob;
	
	
	public static void main(String[] args) {
		
		Customer c1= new Customer();
		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.println(c1.salary);
		System.out.println(c1.gender);
		System.out.println(c1.isActive);
		
		c1.name = "Tom";
		System.out.println(c1.name);
		
		Customer c2= new Customer();
		
		Customer c3= new Customer();
		
		Customer c4; //only ref without object
		
		new Customer(); //object without reference
		new Customer();
		 
		Customer c5 = new Customer();
		c5 = null; //null reference
		
		Customer c6;
		c6 = new Customer(); //obj with reference
		
		

	}

}
