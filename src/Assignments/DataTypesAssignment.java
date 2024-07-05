package Assignments;

public class DataTypesAssignment {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		System.out.println("Kanchan Sachdev");
		
		int a = 74;
		int b = 36;
		System.out.println("Sum of a and b is" + (a+b));
		
		//((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
		float a1 = 25.5f;
		float b1 = 3.5f;
		float c1 = 40.5f;
		float d1 = 4.5f;
		
		float result = ((a1 * b1 - b1* b1)) / (c1/d1);
		System.out.println(result);
		
		String s = "HelloSelenium";
		char s1 ='t';
		System.out.println(s+s1);
		
		int x = 100;
		int y = 200;
		int z = 3400;
		System.out.println("Your total amount is " + (x+y+z));

		System.out.println((byte)'h');
		
		System.out.println((char)('d' +3));
		
		float num = 3.9f;
		float num1 = num*num;
		System.out.println(num1);
	}

}
