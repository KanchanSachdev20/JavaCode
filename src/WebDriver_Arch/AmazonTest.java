package WebDriver_Arch;

public class AmazonTest {

	public static void main(String[] args) {
		
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		
		String browser = "firefox";
		WebDriver driver = null;
		
		
		//Cross browser logic:
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		
		else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		
		else if(browser.equals("safari")) {
			driver = new SafariDriver();
		}
		else {
			System.out.println("please pass the right browser");
		}
		

		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement("emailId");
		driver.sendKeys("emailId", "naveen@gmail.com");
		driver.click("loginButton");
		driver.close();
		
		

	}

}
