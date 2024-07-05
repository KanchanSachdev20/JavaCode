package JavaSessions;

public class LoopConcept {

	public static void main(String[] args) {
		for(int i=0;i<=100;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
        //use cases of while loop:
		//when number of iterations are not fixed -- while loop
		//total number of links/images on page
		//webtable pagination
		//webelement is coming on page
		//page load time out
		//calendar:
		//build is running: 10, 1 hr, 2 hr, 30mins
		
		
		//use cases of for loop
		//when number of iteration are fixed
		//month/days drop down ---> 1 to 12
		//category options -->
		//Arrays, ArrayList
		//excel file --test data -- rows = 1 to rowSize()
		//Read data :JSON/XML
		//reaf data from DB: SQL --- rows/colns
		
		//do-while loop:
		//uses cases for do while loop:
		//webtable pagination
		//go an check the element first and then start the while loop
		//Calendar: 
		int e = 1;
		do {
			e++;
			System.out.println(e);
		
		}
		while(e<=10);
	
	
	int f = 1;
	do {
		f++;
		System.out.println(f);
		break;
	}
	while(f<=10);
}

}
