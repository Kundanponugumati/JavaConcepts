package enumsAndAnnotations;

import java.lang.annotation.*;

//@Target(ElementType.TYPE)
//@Target(ElementType.FIELD)
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.CONSTRUCTOR,ElementType.LOCAL_VARIABLE})
// for multiple components also we can use.

@Retention(RetentionPolicy.RUNTIME)  // upto runtime i.e upto JVM  it will go i.e upto where it will conveyed.
//@Retention(RetentionPolicy.CLASS)    // upto class file i.e upto compiler it will go
//@Retention(RetentionPolicy.SOURCE)    // upto source file i.e like comments.
@interface CricketPlayer // if we add @ to interface then its is annotation.
{
    int age() default 36;
    String country() default "india";
}
@CricketPlayer
class RohitSharma
{
    int runs;
    int matches;

    public RohitSharma() {
        System.out.println("Rohit did his best");
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }

    public int getRuns() {
        return runs;
    }

    public int getMatches() {
        return matches;
    }
}
public class launchannotation2 {
    public static void main(String[] args) {
        RohitSharma rs = new RohitSharma();
        rs.setRuns(550);
        rs.setMatches(11);
        System.out.println(rs.getRuns());
        System.out.println(rs.getMatches());
        System.out.println("********");
        Class cl = rs.getClass();
        Annotation an = cl.getAnnotation(CricketPlayer.class);
        CricketPlayer cp =(CricketPlayer)an;
        System.out.println(cp.age());
        System.out.println(cp.country());
    }
}
