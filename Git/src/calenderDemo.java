
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.*;
import java.time.format.*;
import java.time.ZoneId;
public class calenderDemo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //return of(zoneId, true);
		
		LocalDate localdate1 = LocalDate.now();
		System.out.println("Todays date:"+localdate1);
		LocalDate localdate2 = LocalDate.now(ZoneId.of("Asia / kolkata"));
		System.out.println("Todays date:"+localdate2);
		
		LocalTime localtime1 = LocalTime.now();
		System.out.println("Todays date:"+localtime1);
		LocalTime localtime2 = LocalTime.now(ZoneId.of("Asia / kolkata"));
		System.out.println("Todays date:"+localtime2);
		
		LocalDateTime localdatetime1 = LocalDateTime.now();
		System.out.println("Todays date:"+localdatetime1);
		LocalDateTime localdatetime2 = LocalDateTime.now(ZoneId.of("Asia / kolkata"));
		System.out.println("Todays date:"+localdatetime2);
		
		LocalDate anotherSummerDay = LocalDate.of(2016, 8, 23);
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(anotherSummerDay));
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(anotherSummerDay));
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(anotherSummerDay));
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(anotherSummerDay));
		
		
		
		

	}

}
