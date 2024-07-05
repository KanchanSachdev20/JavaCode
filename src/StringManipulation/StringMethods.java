package StringManipulation;

public class StringMethods {

	public static void main(String[] args) {
		
		String s = "hello This is my java code";
		int len = s.length();
		System.out.println(len);
		
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(19));
		//System.out.println(s.charAt(20));
		//System.out.println(s.charAt(-1));
		
		System.out.println(s.indexOf('T'));
		System.out.println(s.indexOf('i'));//1st occurrence of i
		System.out.println(s.indexOf('i',s.indexOf('i')+1));//2nd occurrence of i

		System.out.println(s.indexOf("java"));
		System.out.println(s.indexOf("testing"));//-1 if index not found
		
		String msg = "Welcome admin";
		if(msg.indexOf("admin") == 8) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		String test = "   hello world   ";
		System.out.println(test.trim());
		
		String t = "hello this is a java code";
		System.out.println(t.toUpperCase());
		System.out.println(t.toLowerCase());
		
		String dob = "01-01-1990";
		System.out.println(dob.replace("-", "/"));
		
		String test1 = "   hello world   ";
		System.out.println(test1.replace(" ", ""));
		
		String st = "hello world";
		String st1 = "hello World";
		System.out.println(st==st1);
		System.out.println(st.equals(st1));
		System.out.println(st.equalsIgnoreCase(st1));
		
		String p = "this is selenium testing";
		System.out.println(p.contains("selenium"));
		
		
		
	}

}
