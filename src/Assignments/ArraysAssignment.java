package Assignments;

public class ArraysAssignment {

	public static void main(String[] args) {
		
		Object player1[] = new Object[6];
		Object player2[] = new Object[6];
		Object player3[] = new Object[6];
		
		player1[0] = "Virat";
		player1[1] = 32;
		player1[2] = "RCB";
		player1[3] = 20/01/1989;
		player1[4] = 'm';
		player1[5] = 80;
		
		player2[0] = "Rohit";
		player2[1] = 34;
		player2[2] = "Delhi";
		player2[3] = 18/05/1988;
		player2[4] = 'm';
		player2[5] = 85;
		
		player3[0] = "Hardik";
		player3[1] = 34;
		player3[2] = "Kings";
		player3[3] = 7/8/1988;
		player3[4] = 'm';
		player3[5] = 75;
		
		for(Object ob1: player1) {
			System.out.println(ob1);
		}
		
		for(Object ob2: player2) {
			System.out.println(ob2);
		}
		
		for(Object ob3: player3) {
			System.out.println(ob3);
		}

	}

}
