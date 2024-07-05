package Assignments;

public class Circle {

	static final float pi =3.141f;
	
	public float areaOfCircle(float radius) {
		System.out.println("Area of Circle is :");
		float area = pi*radius*radius;
		return area;
	}
	
	public float circumferenceOfCircle(float radius) {
		System.out.println("Circumference of Circle is :");
		float cir = 2*pi*radius;
		return cir;
	}
	
	
	
	public static void main(String[] args) {
		
		Circle c = new Circle();
		float areaOfCircle = c.areaOfCircle(4);
		System.out.println(areaOfCircle);
		
		float circumference = c.circumferenceOfCircle(4);
		System.out.println(circumference);

	}

}
