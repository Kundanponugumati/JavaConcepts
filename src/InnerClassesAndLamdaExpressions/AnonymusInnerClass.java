package InnerClassesAndLamdaExpressions;


//interface A
//{
//    void show();
//}
//
//class B implements A
//{
//
//    @Override
//    public void show() {
//        System.out.println("In B Show");
//    }
//}

class IPhone14
{
    public void show()
    {
        System.out.println("Same as iphone 13 + extra price");
    }
    public void hello()
    {
        System.out.println("hello in class Iphone14");
    }
}
public class AnonymusInnerClass {
    public static void main(String[] args) {
        IPhone14 i = new IPhone14()
        {
            public void show()
            {
                System.out.println("same as iphone 12 + double price");
            }
            public void hello()
            {
                System.out.println("hello in Anonymous inner class");
            }
        };
        i.show();
        i.hello();
        IPhone14 i1 = new IPhone14();
        i1.show();
        i.show();
    }
}
