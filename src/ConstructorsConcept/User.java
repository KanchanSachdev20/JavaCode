package ConstructorsConcept;

public class User {
	
	String firstName;
	String lastName;
	String emailId;
	String phone;
	String pwd;
	String city;
	

	public User(String firstName, String lastName, String emailId, String phone, String pwd, String city) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.phone = phone;
		this.pwd = pwd;
		this.city = city;
	}

	public User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public User(String firstName) {
		this.firstName = firstName;
	}

	public User(String firstName, String lastName, String phone, String pwd) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.pwd = pwd;
	}

	public User(String firstName, String lastName, String emailId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}

	public static void main(String[] args) {
		
		User u1 = new User("Ankit");
		System.out.println(u1.firstName+" "+u1.lastName);
		u1.lastName = "Agrawal";
		System.out.println(u1.firstName+" "+u1.lastName);
		
		User u2 = new User("Mahesh","Kumar","mahesh@gmail.com","1234567890","Mahesh@123","pune");
        System.out.println(u2.phone);
	}

}
