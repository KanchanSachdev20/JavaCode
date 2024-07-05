package JavaSessions;

public class PolymorphismConcept {

	public void search() {
		
	}
	
    public void search(String productName) {
		System.out.println(productName);
	}
    public void search(String productName, int price) {
		System.out.println(productName +"  " +price);
	}
	public static void main(String[] args) {
		
		//poly(many) + morphism(forms)
		//Method Overloading
		PolymorphismConcept ob = new PolymorphismConcept();
		ob.search("macbook");
		ob.search("imac", 1000);
		
		//Method Overriding: Run Time (Dynamic binding)

	}

}
