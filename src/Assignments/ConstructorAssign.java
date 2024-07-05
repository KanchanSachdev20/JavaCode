package Assignments;

public class ConstructorAssign {
	
	String name;
	int age;
	char gender;
	double height;
	
	

	public ConstructorAssign(String name, int age, char gender, double height) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}



	public static void main(String[] args) {
		
		ConstructorAssign c1 = new ConstructorAssign("Tom",20,'m',5.2);
		System.out.println(c1.name+" "+c1.age+" "+c1.gender+" "+c1.height);
		
		ConstructorAssign c2 = new ConstructorAssign("Riya",19,'f',5.1);
		System.out.println(c2.name+" "+c2.age+" "+c2.gender+" "+c2.height);

	}

}
