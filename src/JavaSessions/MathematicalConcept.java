package JavaSessions;

public class MathematicalConcept {

	public static void main(String[] args) {
		
		System.out.println(4/2); //2
		System.out.println(4+2); //6
		System.out.println(4-2); //2
		System.out.println(4*2); //8 

		
		System.out.println(9/3); //3
		System.out.println(9/2); //4 [because both are integer value]
		System.out.println(9.0/2); //4.5
		System.out.println(9/2.0); //4.5 [one of the value is float]
		System.out.println(9.0/2.0);
		
		System.out.println((float)9/2); //4.5
		System.out.println(0/9); //zero divide by any number will give 0
		
		
		//System.out.println(9/0);//ArithmeticException: / by zero
		
		//System.out.println(0/0);//ArithmeticException: / by zero
		//System.out.println(9/0); //Integer number divide by zero will give Arithmetic Exception
		
		System.out.println(9.0/0); //Any value is floating and divided by 0 will give infinity
		System.out.println(9/0.0);
		System.out.println(9.0/0.0);
		
		System.out.println(0.0/0.0); //NaN [not a number]
		System.out.println(0.0/0);//NaN
		System.out.println(0/0.0);//NaN
		
        System.out.println(9/0.0); //Infinity
		
		System.out.println('a'/2); //48
		
		System.out.println(9 % 3); //0
		
		System.out.println(9 % 2); //1
		
		System.out.println(100 % 5); //0
		
		System.out.println(8 % 2);//0
	}

}
