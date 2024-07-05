package JavaSessions;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {
		//Limitations of array:
		//1:size is fixed
		
		//static array ex:
		//month/days
		//
//		int a = 10;
//		a = 20;
//		a = 30;
//		System.out.println(a);

		//1: with new keyword
		//default value of integer = 0;
		int a[] = new int[4];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		
		System.out.println(a[0]); 
		System.out.println(a[3]); 
		//System.out.println(a[4]);  //ArrayIndexOutOfBoundException
		//System.out.println(a[-1]);  //ArrayIndexOutOfBoundException
		
		int len = a.length;
        System.out.println(len);
        
        //to print all values from the array : use for loop
        for(int i=0; i<len; i++) {
        	System.out.println(a[i]);
        }
		
        //without using loop
        System.out.println(a); //print memory address of array
        
        System.out.println(Arrays.toString(a));
        
        //double Array
        double d[] = new double[4];
        d[0] = 10.12;
        d[1] = 13.44;
        d[2] = 12.33;
        d[3] = 23;
        System.out.println(d[0] + d[1]);
        
        //String Array:
        String emp[] = new String[3];
        emp[0] = "Kanchan";
        emp[1] = "Naveen";
        emp[2] = "Pooja";
        System.out.println("total emp: " + emp.length);
        System.out.println(Arrays.toString(emp));
        
        for(int k=0; k<emp.length; k++) {
        	System.out.println(emp[k]);
        	if(emp[k].equals("Kanchan")) {
        		System.out.println("kanchan salary is:" + 1000);
        	}
        }
        		
	}

}
