import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.swing.text.DateFormatter;

public class Java_A55_DateTimeFormatter{
	
	public static void main(String[] args) {
		LocalDateTime date1 = LocalDateTime.now();
		
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy-EE-H:m a");
		
		String date = date1.format(dft);
		
		System.out.println(date);
		
		Date d1 = new Date();
		System.out.println(d1);
		
		LocalDateTime d2 =  LocalDateTime.now();
//		DateTimeFormatter dft2 = DateTimeFormatter.ofPattern("dd-mm-yyyy");
		String date2 = d2.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		
		System.out.println(date2);
	
	}
	
}