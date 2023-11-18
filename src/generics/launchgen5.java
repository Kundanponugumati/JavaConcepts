package generics;

import java.util.ArrayList;
import java.util.List;

class human3
{
    public void sleep()
    {
        System.out.println("human needs sleep");
    }
}
public class launchgen5 {
    public static void main(String[] args) {
        List <human3> list = new ArrayList<>();
        list.add(new human3());
        list.add(new human3());
        list.add(new human3());
        list.add(new human3());
        invoke(list);
    }

    public static void invoke(List<human3> list) {
        for(human3 human: list)
        {
            human.sleep();
        }
    }
    public static void invoke1(List<? extends human3> list) {
        for(human3 human: list)
        {
            human.sleep();
        }
    }
    public static void invoke2(List<? super human3> list) {
        for(Object human: list)
        {
//            human.sleep();
        }
    }
}
