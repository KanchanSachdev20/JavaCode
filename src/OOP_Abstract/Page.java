package OOP_Abstract;

public abstract class Page {
	
	//can not create obj of abstract class
	
	public abstract void title();
	public abstract void url();
	
	public void calculatePageLoadTime() {
		System.out.println("page time out---10sec");
	}
	
	public final void displayLogo() {
		System.out.println("display logo");
	}
	}


