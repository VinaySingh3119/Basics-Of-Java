
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Java_A55_DateTimeFormate {
	public static void main(String[] args) {
		
		LocalDateTime dt = LocalDateTime.now(); // This is Date
		System.out.println(dt);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy -- EE -- H:m a"); // This is Formatter
		
		String myDate = dt.format(dtf); // Creating Date String using Date and Format
		System.out.println(myDate);
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ISO_LOCAL_DATE;
		
		String myDate2 = dt.format(dtf2); // Creating Date String using Date and Format
		System.out.println(myDate2);
		
	}
}
