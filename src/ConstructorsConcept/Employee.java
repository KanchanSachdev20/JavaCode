package ConstructorsConcept;

public class Employee {
	
	String name;
	int age;
	double salary;
	
	//Constructor
	//Same name as class name
	//can not return any thing
	//no return type for const.
	//constructor can be overloaded
	public Employee() {
		System.out.println("default constructor..");
	}
	
	public Employee(int i) {
		System.out.println("1 param constructor.." + i);
	}
	
	public Employee(int i, String p) {
		System.out.println("2 param constructor.." + i + p);
	}


	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.name = "tom";
		emp.age = 20;
		emp.salary = 12.33;
		
		
		Employee emp1 = new Employee(10);
		Employee emp2 = new Employee(20,"tom");
		Employee emp3 = new Employee();
				

	}

}
