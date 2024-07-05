package DateConcept;

public class DateTest {

	public static void main(String[] args) {
		
		System.out.println(java.time.LocalDate.now().getDayOfMonth());
		System.out.println(java.time.LocalDate.now().getDayOfYear());
		System.out.println(java.time.LocalTime.now());
		System.out.println(java.time.LocalDateTime.now());


	}

}
