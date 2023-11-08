package InnerClassesAndLamdaExpressions;
interface A1
{
    abstract public int show(int i);
}

public class abstractClass {
    public static void main(String[] args) {
        A1 obj =   i-> i*i;
        System.out.println(obj.show(5));
    }
}
