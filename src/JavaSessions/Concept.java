package JavaSessions;

import java.util.ArrayList;

public class Concept {

	// WAF
	// supply a browser name: String: chrome/safari/IE
	// logic: launch the browser
	// return true

	public boolean launchBrowser(String browserName) {
		System.out.println("browser name :" + browserName);

		boolean flag = true;

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "ie":
			System.out.println("launch ie");
			break;

		default:
			System.out.println("Please pass the right browser.." + browserName);
			flag = false;
			break;

		}
		return flag;
	}

	public ArrayList<String> getEmpList(String companyName) {
		System.out.println("company name is :" + companyName);
		
		ArrayList<String> empList = new ArrayList<String>();
		if(companyName.equalsIgnoreCase("IBM")) {
			empList.add("Rakesh");
			empList.add("Ravi");
			empList.add("Geeta");
			
		}
		
		else if(companyName.equalsIgnoreCase("MS")) {
			empList.add("Abhi");
			empList.add("Naveen");
			empList.add("Heena");
			empList.add("Azam");
		}
		
		else if(companyName.equalsIgnoreCase("Google")) {
			empList.add("Fawad");
			empList.add("Dhurv");
		}
		else {
		System.out.println("company name not found");	
		}
		
		return empList;
	}
	
	
	
	public void testing() {
		System.out.println("testing method");
		return;
	}

	public static void main(String[] args) {

		Concept c = new Concept();
		ArrayList<String> ibmList = c.getEmpList("IBM");
		System.out.println(ibmList);
		
		ArrayList<String> googleList = c.getEmpList("google");
		System.out.println(googleList);
		
		
	boolean isLaunched = c.launchBrowser("chrome");
		if (isLaunched) {
			System.out.println("enter url");
		} else {
			System.out.println("don't enter url");
		}

	}

}
