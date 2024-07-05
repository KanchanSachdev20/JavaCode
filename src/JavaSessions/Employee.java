package JavaSessions;

public class Employee {

	//class variables -- class data members
	String name;
	int age;
	String cityName;
	
	public static void main(String[] args) {
		
		String name = "Kanchan"; //Local Variable
		
		System.out.println(name);
		
		//class -- template/blueprint of the object/category of the object
		//object ---is a physical entity
		
		//Create object of the class : new keyword
		Employee emp = new Employee();
		emp.name = "Tom";
		emp.age = 20;
		emp.cityName = "pune";
		
		System.out.println(emp.name+" "+emp.age+"  "+emp.cityName);

		Employee emp1 = new Employee();
		
		new Employee().name ="Peter";
		new Employee().age =25;
		new Employee().cityName ="Banglore";
	}

}
