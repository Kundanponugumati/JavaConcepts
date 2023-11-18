package generics;


import java.util.ArrayList;
import java.util.List;

class human1
{
    @Override
    public String toString() {
        return "human1{}";
    }
    public void disp()
    {
        System.out.println("in human1 class");
    }
}
class Gen1 <T> {
    T ref;

    public Gen1(T ref) {
        this.ref = ref;
    }

    public T getRef() {
        return ref;
    }
}
public class launchgen3 {
    public static void main(String[] args) {
        Gen1<human1> gen = new Gen1<>(new human1());
        System.out.println(gen.getRef());
    }
}
