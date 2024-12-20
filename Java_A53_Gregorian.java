import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Java_A53_Gregorian {
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
//		System.out.println(c.getTime());
//		System.out.println(c.get(Calendar.DATE));
//		System.out.println(c.get(Calendar.SECOND));
//		System.out.println(c.get(Calendar.HOUR));
//		System.out.println(c.get(Calendar.HOUR_OF_DAY));
//		System.out.println(c.get(Calendar.YEAR));
//		System.out.println(c.get(Calendar.DAY_OF_MONTH));
//		System.out.println(c.get(Calendar.DAY_OF_WEEK));
//		System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
		
		GregorianCalendar cal = new GregorianCalendar();
		System.out.println(cal.isLeapYear(2016));
		System.out.println(cal.get(Calendar.YEAR));
		
		System.out.println(TimeZone.getAvailableIDs()[0]);
		System.out.println(TimeZone.getAvailableIDs()[1]);
		System.out.println(TimeZone.getAvailableIDs()[2]);
		System.out.println(TimeZone.getAvailableIDs()[3]);
		System.out.println(TimeZone.getAvailableIDs()[4]);
		System.out.println(TimeZone.getAvailableIDs()[15]);
		
	}
}
