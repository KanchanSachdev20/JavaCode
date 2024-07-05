package OOP_Encapsulation;

public class Amazon_Login {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage("Kanchan@gmail.com","kanchan@123");
		lp.doLogin(lp.getUserName(),lp.getPwd());
	}

}
