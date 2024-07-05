package StringManipulation;

public class StringConcept {

	public static void main(String[] args) {
		
		//String literals: created inside constant pool
		String s = "Hello";
		String s1 = "Hello";
		String s2 = "hello";
		
		System.out.println(s==s1);//true
		System.out.println(s1==s2);
		
		//String Objects with new keyword:
		String st = new String("Java");
		String st1 = new String("Hello");
		
		
		System.out.println(s==st1);//false
		System.out.println(s.equals(st1)); //true 
		
		String st2 = new String("Hello");
		
		String test = new String("Selenium"); //1 ---->HEAP
		test.intern(); //intern will create same value on constant pool [no refrence]
		String t1 = "Selenium"; //0 object
		//total objs: 0
		
		
		String st4 = new String();//1 obj will be create without any value
		System.out.println(st4.length());
		
	}

}
