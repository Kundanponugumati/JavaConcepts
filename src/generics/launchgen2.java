package generics;

class Gen <T>
{
    T ref;

    public Gen(T ref) {
        this.ref = ref;
    }
    public Gen()
    {
        System.out.println("gen");
    }

    public void setRef(T ref)
    {
     this.ref=ref;
    }
    public void getRef()
    {
        System.out.println(ref);
    }

    public void disp()
    {
        System.out.println("type of data is <T> :"+ref.getClass().getSimpleName());
    }
}
public class launchgen2 {
    public static void main(String[] args) {

        Gen<Integer> g = new Gen<>(23);
        g.disp();
        g.setRef(24);
        g.getRef();
        Gen<Integer> g3 = new Gen<>(23);
        g3.getRef();

        Gen<Double> g1 = new Gen<>(23.33);
        g1.disp();

        Gen<String> g2 = new Gen<>("kundan");
        g2.disp();
    }
}
