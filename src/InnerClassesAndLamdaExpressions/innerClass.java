package InnerClassesAndLamdaExpressions;

class A
{
    int num =9;
    public void show()
    {
        System.out.println("in class A");
    }

    static class B
    {
        void show()
        {
            System.out.println("in class B");
        }
    }
    class C
    {
        void show()
        {
            System.out.println("in class C");
        }
    }
}

public class innerClass {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.num);
        obj.show();
        A.B obj1 = new A.B();
        obj1.show();
//        A.C obj2 = obj.new C();
        A.C obj2 = new A().new C();

        obj2.show();
    }
}
