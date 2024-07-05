package OOP_Encapsulation;

public class EmpTest {

	public static void main(String[] args) {
		Employee e1 = new Employee("Aarush",25,12.33,"India","Pune");
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
		System.out.println(e1.getCity());
		System.out.println(e1.getCountry());
		System.out.println("------------------------------------");
		
		e1.setAge(26);
		e1.setSalary(13.55);
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
	}

}
