package DateAndTimeAPI;

// from java8 we are using new date and time api .
import java.time.*;
public class launchdt3 {
    public static void main(String[] args) {
//        LocalDate date = new LocalDate(); // gives you error
        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getChronology());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getEra());
       LocalTime time = LocalTime.now();
        System.out.println(time);
        System.out.println(time.getMinute());
    }
}
