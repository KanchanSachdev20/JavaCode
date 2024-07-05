package Assignments;

public class Conditional {

	public static void main(String[] args) {
		
		int a =250;
		int b  = 780;
		int c = 870;
		int d = 755;
		
//		if(a>b && a>c)
//		{
//			System.out.println("A is greatest");
//		}
//
//		else if(b>a && b>c) {
//			System.out.println("B is greatest");
//		}
//		else {
//			System.out.println("C is greatest");
//		}
		
		if(a>b && a>c && a>d)
		{
			System.out.println("A is greatest");
		}

		else if(b>a && b>c && b>d) {
			System.out.println("B is greatest");
		}
		else if(c>a && c>b && c>d) {
			System.out.println("C is greatest");
		}
		else {
			System.out.println("D is greatest");
		}
	
	int num2=100;
	if(num2 >=0) {
		System.out.println("Number is +ve");
	}
	else {
		System.out.println("Number is -ve");
	}
	
	
	int num = 105;
	if (num % 2 ==0)
	{
		System.out.println("Number is Even");
	}
	else {
		System.out.println("Number is ODD");
	}
	
	String browser1 ="Chrome";
	if (browser1.equals("Chrome")) {
		System.out.println("Launch Chrome");
	}
	
	if(browser1.equals("Firefox")) {
		System.out.println("Launch Firefox");
	}
	if(browser1.equals("IE")) {
		System.out.println("Launch IE");
	}
	if(browser1.equals("Safari")) {
		System.out.println("Launch Safari");
	}
	else  {
		System.out.println("Please pass the right browser type");
	}

	
	String browser ="Chrome";
	if (browser.equals("Chrome")) {
		System.out.println("Launch Chrome");
	}
	
	else if(browser.equals("Firefox")) {
		System.out.println("Launch Firefox");
	}
	else if(browser.equals("IE")) {
		System.out.println("Launch IE");
	}
	else if(browser.equals("Safari")) {
		System.out.println("Launch Safari");
	}
	else  {
		System.out.println("Please pass the right browser type");
	}
	
}
}