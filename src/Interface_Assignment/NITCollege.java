package Interface_Assignment;

public class NITCollege extends Education implements UKUniversity,USUniversity,IndianUniversity {

	@Override
	public void java() {
		System.out.println("Java course");
		
	}

	@Override
	public void python() {
		System.out.println("Phython course");
		
	}

	@Override
	public void sql() {
		System.out.println("SQL course");
	}

	@Override
	public void apiTesting() {
		System.out.println("API Testing course");
		
	}

	@Override
	public void selenium() {
		System.out.println("Selenium course");
		
	}

	@Override
	public void dataScience() {
		System.out.println("Datascience course");
		
	}

	@Override
	public void ai() {
		System.out.println("AI course");
		
	}

	@Override
	public void machineLearning() {
		System.out.println("Machine Learning course");
		
	}
	
	@Override
	public void grades() {
		System.out.println("grades should be greated than 50");
	}
	
	@Override
	public void test() {
		System.out.println("test NIT");
	}

}
