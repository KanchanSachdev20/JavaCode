package OOP_Encapsulation;

public class Employee {

	private String name;
	private int age;
	private double salary;
	private String country;
	private String city;
	
	
	public Employee(String name, int age, double salary, String country, String city) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.country = country;
		this.city = city;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}
