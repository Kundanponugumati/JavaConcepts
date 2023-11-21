package enumsAndAnnotations;


// why we use annotation?
//these are some examples why we need annotations.
@FunctionalInterface
interface demo {
    void demoMethod();
    //void second(); // if we mistakenly write another method here the place we have used
    // lamda expression gets error and compiler is giving any error here it gives error at lamda expression
    // so the person can't know that this not correct.
    // therefore when we use annotation compiler gives you error here so that you don't any extra methods
    // as lamda has been used .
}

class parent{
    void fly()
    {
        System.out.println("parents are flying to dubai");
    }
}

class child extends parent {
//    void Fly()
//    {
//        System.out.println("child is flying to qatar");
//        //here we are assuming we have overridden parent method but actually not but
//        // compiler is not helping us here and when we use polymorphism parent class method gets executed.
//        // so if we use annotation compiler throws error here and we can correct the mistake.
//    }
    @Override
    void fly()
    {
        System.out.println("child is flying to qatar");
    }
}

public class launchAnt1 {
    public static void main(String[] args) {

        demo d = ()-> System.out.println("demo method implementation.");
        d.demoMethod();

        parent p = new child();
        p.fly();
    }
}
