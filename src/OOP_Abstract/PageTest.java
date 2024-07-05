package OOP_Abstract;

public class PageTest {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		lp.title();
		lp.url();
		lp.calculatePageLoadTime();
		lp.forgotPwd();
		
		Page p =new LoginPage();
		p.calculatePageLoadTime();
	}

}
