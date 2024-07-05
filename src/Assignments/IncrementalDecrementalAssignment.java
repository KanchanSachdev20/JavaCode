package Assignments;

public class IncrementalDecrementalAssignment {

	public static void main(String[] args) {
		
		int i =11;
		i = i++ + ++i;
		System.out.println(i);
		
		int a =11, b =22 , c;
		c = a + b + a++ + b++ + ++a + ++b;
		System.out.println(c);
		
		int k =0;
		k = k++ - --k + ++k - k--;
		System.out.println(k);
		
		   char ch = 'A';
          System.out.println(++ch);
          
          int ch1 = 'A';
          System.out.println(ch1++);

	}

}
