package JavaSessions;

public class StringConcatenation {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		System.out.println(a+b);
	
		String s = "hello";
		String s1 = "Selenium";
		System.out.println(s+s1);
		
		System.out.println(a+b+s+s1);
		System.out.println(s+s1+a+b);
		
		System.out.println(s+s1+(a+b));
		System.out.println(a+b+s+s1+a+b);//30HelloSelenium1020
		System.out.println(a+b+s+s1+(a+b));//30HelloSelenium30
		
		double c =12.33;
		double d = 23.44;
		System.out.println(s+s1+c+d);
		
		char e ='a';
		char f = 'b';
		System.out.println(e+f);//195
		
		char g ='m';
		System.out.println(e+f+g);
		System.out.println(f-e);
		
		System.out.println('a' + 'b');//195
		System.out.println("a+b");		//a+b
		
		
		//To print Ascii valy=ue of any character
		System.out.println((byte)'$'); //print ASCII value of $
		System.out.println((byte)'a');
		System.out.println((int)'b');
		
		int s2 = 100;
		int s3 = 300;
		System.out.println("the value of s1 is :" + s2);
		System.out.println("the value of s2 is :" + s3);
		System.out.println("the sum is: "+ (s2 + s3));
				
	}

}
