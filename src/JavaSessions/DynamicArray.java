package JavaSessions;

import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) {
		
		//ArrayList -- default class
		//create the object of ArrayList
		
		ArrayList ar = new ArrayList();
		System.out.println(ar.size());
		
		ar.add(100);
		ar.add(200);
		
		System.out.println(ar.size());

		ar.add(300);
		ar.add(400);
		ar.add(500);
		System.out.println(ar.size());
		
		System.out.println(ar.get(0));
		System.out.println(ar.get(4));
		//System.out.println(ar.get(5)); //IndexOutOfBoundsException
		//System.out.println(ar.get(-1)); //IndexOutOfBoundException
		
		ar.add(600);
		System.out.println(ar.get(5));
		
		ar.add(12.33);
		ar.add(true);
		ar.add('m');
		ar.add("testing");
		
		System.out.println(ar.size());
		
		//generics in arrayList
		
		ArrayList<Integer> markList = new ArrayList<Integer>();
		
		markList.add(100);
		markList.add(200);
		System.out.println(markList.size());
		
		ArrayList<Double> bmiList = new ArrayList<Double>();
		bmiList.add(12.33);
		bmiList.add(100.00);
		
		ArrayList<String> browserList = new ArrayList<String>();
		browserList.add("chrome");
		browserList.add("safari");
		browserList.add("opera");
		System.out.println(browserList);
		
	    //print all values from arrayList: for loop
		
		for(int i=0; i<browserList.size(); i++) {
			System.out.println(browserList.get(i));
			if(browserList.get(i).equals("chrome")) {
				System.out.println("google");
			}
		}

		//for each:
		for(String e :browserList) {
			System.out.println(e);
		}
		
		
		System.out.println("-----------------");
		
		ArrayList<Object> empInfoList = new ArrayList<Object>();
		empInfoList.add("Riya");
		empInfoList.add("Sinha");
		empInfoList.add(30);
		empInfoList.add(45.55);
		empInfoList.add('f');
		empInfoList.add("Banglore");
		empInfoList.add(true);
		
		System.out.println(empInfoList.size());
		
		for(Object emp: empInfoList) {
			System.out.println(emp);
		}
		System.out.println("-----------------");
		
		System.out.println(empInfoList);
		
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(100);
		number.add(200);
		number.add(500);
		number.add(100);
		
		System.out.println(number);
		
		for(Integer num:number) {
			System.out.println(num);
			if(num==200) {
				break;
			}
		}
		
		//LF ---Load Factor ---> Physical Capacity/2 --> size()/2
		
		//use cases:
		//uber: carsList
		//amazon: productList
		//userList
		//total links ----> linksList
		//total images ---> imagesList
	}

}
