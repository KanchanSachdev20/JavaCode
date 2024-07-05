package OOP_Inheritance;

public class BMW extends Car {
	
	//Method Overriding: Poly + Morphism -->Run Time (Dynamic)
	//When you have a method in parent class and same method in child class 
	//with same name
	//with same no.of param
	//with same seq of param
	//with the same return
	
	
	
	@Override
	public void start() {
		System.out.println("start BMW car");
	}
	
	public void autoParking() {
		System.out.println("BMW autoparking");
	}
	
	@Override
	public void petrolEngine() {
		System.out.println("BMW--petrol engine");
	}
	
	public void theftSafety() {
		System.out.println("BMW--theftSafety");
	}

}
