package DateAndTimeAPI;

import java.util.Date;
public class launchdt1 {
    public static void main(String[] args) {
//        java.util.Date d = new java.util.Date(); // without importing the package we can write like this also.
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getClass());
        System.out.println(date.getTime()); // give time in milliseconds
        // if time is 08:34:44 then
        System.out.println(date.getHours()); // give time in hrs. -> 8
        System.out.println(date.getMinutes()); // give time in min. -> 34
        System.out.println(date.getSeconds());// give time in seconds. -> 44.
    }
}
