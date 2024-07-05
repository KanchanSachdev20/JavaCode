package Assignments;

public class Rectangle {
	
	double length;
	double width;
	
	

	public Rectangle() {
		this.length =0.0;
		this.width = 0.0;
	}
	
   public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double calculateArea() {
		double area = this.length*this.width;
		return area;
	}

    public static void main(String[] args) {
		
    	Rectangle r =new Rectangle(10,20);
    	System.out.println(r.calculateArea());

	}

}
