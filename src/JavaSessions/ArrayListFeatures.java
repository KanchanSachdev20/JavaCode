package JavaSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListFeatures {

	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<Integer>(20);
		//Vc =20 , pc=0
		//LF = 10
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
        //VC=10 ; PC =0
		ar1.add(100);
		ar1.add(200);
		ar1.add(300);
		ar1.add(400);
		System.out.println(ar1.size());
		
		ar1.remove(2);
		System.out.println(ar1.size());
		System.out.println(ar1.get(2));
		System.out.println("--------------------");
		
		
		ArrayList<String> empList = new ArrayList<String>(Arrays.asList("Tom" , "Peter", "Ravi"));
		System.out.println(empList);
		
		empList.add("Lisa");
		System.out.println(empList.size());
		System.out.println(empList);
		
		empList.add(0, "Ankit");
		System.out.println(empList);
		
//		empList.add(8,"Vijay"); //IndexOutOfBoundException
//		System.out.println(empList);
		
		List<Integer> nums =Arrays.asList(1,2,3,4,5);
		System.out.println(nums.size());
		
		//
		List<String> pagesList = Arrays.asList("LoginPage" , "HomePage" , "RegPage", "CartPage");
	
	ArrayList<String> myList = new ArrayList<String>(Collections.nCopies(5, "iPhone"));
	System.out.println(myList.size());
	System.out.println(myList);
	}

}
