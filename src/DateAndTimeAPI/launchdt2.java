package DateAndTimeAPI;
import java.sql.Date;

public class launchdt2 {
    public static void main(String[] args) {
//        Date date = new Date(); // zero parametrized construcotor is allowed here.
        java.util.Date d = new java.util.Date();
        long time=d.getTime();
//        int datee = d.getDate();
        Date date = new Date(time);
        System.out.println(date); // here when we pass time then we got the date as the output.
    }
}
