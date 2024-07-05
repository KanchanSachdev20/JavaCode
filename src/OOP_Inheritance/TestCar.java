package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start(); //Overridden method
		b.stop(); //Inherited Method
		b.refuel(); //Inherited
		b.autoParking(); //Specific method of BMW
        b.engine(); //Inherited
        b.petrolEngine();//Overridden
        b.theftSafety();
		
		System.out.println("------------------");
		Car c =new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		c.petrolEngine();
		
		System.out.println("------------------");
		Audi a = new Audi();
		a.theftSafety();
		
		
		System.out.println("------------------");
		//child class obj can be referred by parent class ref variable:
		//Top/Up casting
		//can accessonly and only overridden and inherited method
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		//c1.autoParking();//not allowed --ref type check is failed
		
		//child class obj can be referred by grand parent class ref variable:'
		Vehicle v1 = new BMW();
		
		
		//down casting: 
		//parent class obj can be referred by child class ref variable
		BMW b1 = (BMW)new Car(); //ClassCastException at runtime
	}

}
