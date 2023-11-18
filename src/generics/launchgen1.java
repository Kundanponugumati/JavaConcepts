package generics;

import java.util.ArrayList;
import java.util.List;

class human {
    public void sleep()
    {
        System.out.println("human needs sleep");
    }
}

class employee extends human {
    public void sleep()
    {
        System.out.println("employee sleeps");
    }
}
public class launchgen1 {
    public static void main(String[] args) {
        List <human> list1 = new ArrayList <>();
        list1.add(new human());
        list1.add(new employee()); // --> parent type reference can hold child type object.

        List <employee> list2 = new ArrayList<>();
        list2.add( new employee());
//        list2.add( new human()); -->  gives error

    }
}
