package JavaSessions;

public class Browsers {

	String name;
	static String hq = "Banglore";
	public int getBrowserVersion() {
		System.out.println("get browser version");
		return 100;
	}
	
	public static String getBrowserVendor() {
		System.out.println("get browser vendor");
		return "Mozilla";
	}
	public static void main(String[] args) {


		Browsers b = new Browsers();
		System.out.println(b.name);
		System.out.println(Browsers.hq);
		System.out.println(b.getBrowserVersion());
		System.out.println(getBrowserVendor());

	}

}
