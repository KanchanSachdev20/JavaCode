package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		try {
		throw new Exception("user is not found");
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		System.out.println("------------------------------------");
		String data = null;
		if(data == null) {
			try {
				throw new Exception("DATANOTFOUND");
				}
				catch(Exception e) {
					e.printStackTrace();
				}
		}
		try {
		System.out.println(data.length());}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("bye");
	}

}
