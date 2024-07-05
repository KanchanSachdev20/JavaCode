package Assignments;

public class WhileLoop {

	public static void main(String[] args) {

		int j=1;
		while(j<10) {
			System.out.println("I am Batman" + j);
			j++;
		}
		
		int l =10;
		while(l>=1) {
			System.out.println(l);
			l--;
		}
		
		int m =1;
		while(m<=10) {
			System.out.println("Hello World");
			m++;
		}
		
		int n =1;
		while(n<=100) {
			if(n%5==0) {
			System.out.println("Multiplication of 5" + n);
		}
			n++;
		}
		
		int z =1;
		while(z<=100) {
			if(z%2==0) {
			System.out.println("Number is Even :" + z);
		}
			else {
				System.out.println("Number is Odd :" +z);
			}
			z++;
		}

	}

}
