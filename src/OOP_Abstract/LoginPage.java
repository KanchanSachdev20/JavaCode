package OOP_Abstract;

public class LoginPage extends Page{

	@Override
	public void title() {
	 System.out.println("Login page");
		
	}

	@Override
	public void url() {
		System.out.println("https://www.abc.com");
		
	}
	
	public void calculatePageLoadTime() {
		System.out.println("page time out---5 sec");
	}
	
	public void forgotPwd() {
		System.out.println("forgot pwd");
	}

}
