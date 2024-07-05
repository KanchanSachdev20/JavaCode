package JavaSessions;

import java.util.Arrays;

public class ArrayLiteralsConcept {

	public static void main(String[] args) {
		
		//2: Array Literals		
		int a[] = {1,3,4,55,23,12,101};
		System.out.println(a.length);
		System.out.println(Arrays.toString(a));
		
		double d[] = {1.1, 2.3, 4.5, 5.6};
		char vowels[] = {'a' , 'e' ,'i' , 'o' , 'u'};
		
		String browsers[] = {"chrome" , "firefox" , "IE" ,"Edge" ,"Safari"};
		
	for(int i=0; i<browsers.length; i++) {
		System.out.println(browsers[i]);
		if(browsers[i].equals("IE")) {
			System.out.println("this is deprecated");
		}
	}
		
		

	}

}
