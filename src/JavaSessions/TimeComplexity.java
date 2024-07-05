package JavaSessions;

public class TimeComplexity {

	public static void main(String[] args) {
		
		int i=1;
		System.out.println(i);
		
		//constant time : Big O(1)
		
		String name =" kanchan";
		System.out.println(name); //O(1)
		
		int n =10;
		for(int p = 1; p<=n; p++) {
			System.out.println(p);
		}
      //1 + n + n + n = 3n+1  ---> linear equation
	 //3n+1 --> 3n -->O(n)
		
		//1 to 100
		int p = 1 ;
		while(p<=100) {
			System.out.println("hi");
			System.out.println(p);
			p++;
		}
		//1 + n + n + n + n --> 4n+1 ---> 4n---> O(n)
	}

}
