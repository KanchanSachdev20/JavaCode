package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListAssignment {

	public static void main(String[] args) {
//		WAP to delete a specific number from the given array.
//
//		int p[] = {1,4,5,2,3,22,31, 2}; 
//
//--Need to remove 22 from the p[] array.
//
//--output should be: [1, 4, 5, 2, 3, 31, 2]
		
		ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(1,4,5,2,3,22,31,2));
		System.out.println(num);
		
		num.remove(5);
		System.out.println(num);
		System.out.println(num.get(3));
		System.out.println("-------------------------------");
		
		
//		  2:Write a Java program to create a new array list,
//          add some colors (string) 
//          and print out the colorslist.
		
		ArrayList<String> colorList = new ArrayList<String>(Arrays.asList("Red", "Blue", "green" ,"Yellow","Pink"));
		System.out.println(colorList);
		System.out.println("-------------------------------");
		
	
	ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(1,4,5,2,3,22,31,2));
	numList.add(2,65);
	System.out.println(numList);
	
	//Write a Java program to search an element in an array list using for loop. Once we find that element, break the loop.
	
	ArrayList<Integer> numList1 = new ArrayList<Integer>(Arrays.asList(1,4,5,2,3,22,31,2));
	for(int i=0; i<numList1.size() ;i++) {
		
		if(numList.get(i)==5) {
			break;
		}
		System.out.println(numList1.get(i));
	}
	System.out.println("-------------------------------");
	
	
	
	ArrayList<String> studentNames = new ArrayList<String>();
     studentNames.add("Varun");
     studentNames.add("Reena");
     studentNames.add("Naveen");
     studentNames.add("Robin");
     studentNames.add("Peter");
     System.out.println(studentNames);
     studentNames.removeAll(studentNames);
     
     
     //Collections.reverse(studentNames);
     System.out.println(studentNames);
}
}