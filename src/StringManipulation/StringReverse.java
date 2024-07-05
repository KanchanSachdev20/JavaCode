package StringManipulation;

import ExceptionHandling.MyException;

public class StringReverse {
	
	//Selenium ----muineles
	//A ---> A
	
	
	public static String reverseString(String st) {
		
		if(st==null) {
			System.out.println("null values can not be revresed");
			throw new MyException("Null Values");
		}
		if(st.length()==1) {
			return st;
		}
		else if(st.length()==0) {
			System.out.println("blank value");
			return st;
		}
		String rev = "";
		for(int i=st.length()-1; i>=0; i--) {
			
			rev = rev + st.charAt(i);
		}
		return rev;
		
		
		
	}

	public static void main(String[] args) {
		
		String result= reverseString("Selenium");
		System.out.println(result);
		
		System.out.println(reverseString("A"));
		System.out.println(reverseString("AA"));
		
		String result1= reverseString("Selenium teting java lang");
		System.out.println(result1);
		
		//System.out.println(reverseString(null));
        System.out.println(reverseString(""));
        
        
        String m = "Selenium";
        StringBuilder sb = new StringBuilder(m);
        System.out.println(sb.reverse());
		
		
		
	}

}
