package enumsAndAnnotations;

enum Week // outside the class also we can have enum
{
    MON,TUE,WED,THU,FIR,SAT,SUN; // recommend in upper case;
//    mon,tue,wed,Thur,SAT,suN --> we create like this also but it is recommend to use uppercase
}
public class launchenum1 {
    enum Direction {
        NORTH,SOUTH,EAST,WEST;
    } // inside the class also we can have enum
    public static void main(String[] args) {
        System.out.println(Week.MON); // --> gives MON -> type Week.
        System.out.println(Week.MON.ordinal()); // gives you index
        // for values
        Week [] w = Week.values(); // return type is array of type week.
        // for printing them we can use foreach loop.
        for(Week elem:w)
        {
            System.out.println(elem.ordinal()+ ":"+elem);
        }

        enum Color{
            RED,BLUE,YELLOW,GREEN // inside the method also we can have enum
        }
    }
}
