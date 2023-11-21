package enumsAndAnnotations;

enum Color
{
    RED("The color is Red"),
    GREEN("The color is green"),
    BLUE("The color is blue"),
    YELLOW,
    WHITE;

    String s;

    public String getS() {
        return s;
    }

    Color(String s)
    {
        System.out.println("constructor invoked");
        this.s =s;
    }
    Color()
    {
        System.out.println("zero parameterized constructor ");
    }

}
public class launchenum3 {
    public static void main(String[] args) {
        System.out.println(Color.YELLOW);
        System.out.println(Color.BLUE);
        System.out.println(Color.YELLOW.ordinal());
        System.out.println(Color.BLUE.ordinal());
        System.out.println(Color.RED.getS());

    }
}
