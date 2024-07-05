package OOP_Encapsulation;

public class LoginPage {

	private String userName;
	private String pwd;

	public LoginPage(String userName, String pwd) {
		this.userName = userName;
		this.pwd = pwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void doLogin(String un, String pwd) {
		System.out.println("enter username:" +un);
		System.out.println("enter pwd:" +pwd);
		System.out.println("click on login btn");
		
		if(isUserActive(un)) {
			System.out.println("user is logged in");
		}
		else {
			System.out.println("user is inactive..account is blocked");
		}
		
		
	}
	
	public boolean isUserActive(String un) {
		System.out.println("checking user status:" +un);
		return true;
	}
}
