package Assignments;


public class Employee {

	String name;
	int age;
	String cityName;
	
	public static void main(String[] args) {
		
		
		Employee emp1 = new Employee();
		emp1.name = "Tom";
		emp1.age = 20;
		emp1.cityName = "pune";
		
		Employee emp2 = new Employee();
		emp2.name = "Peter";
		emp2.age = 25;
		emp2.cityName = "Banglore";
		
		Employee emp3 = new Employee();
		emp3.name = "Riya";
		emp3.age = 22;
		emp3.cityName = "US";
		
		Employee emp4 = new Employee();
		emp4.name = "Pooja";
		emp4.age = 24;
		emp4.cityName = "LA";
		
		emp1 = emp2;
		System.out.println(emp1.name+ "  "+emp1.age+"  "+emp1.cityName);
		
		emp2=emp3;
		System.out.println(emp2.name+ "  "+emp2.age+"  "+emp2.cityName);
		
		emp3=emp4;
		System.out.println(emp3.name+ "  "+emp3.age+"  "+emp3.cityName);
		
		emp4=emp1;
		System.out.println(emp4.name+ "  "+emp4.age+"  "+emp4.cityName);
	}

}
