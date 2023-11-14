package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class stream5 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("kundan","sai","abhi","swapna","ravi","swathi");
        List<String> unames = new ArrayList<>();
//        for(String name: names)
//        {
//            unames.add(name.toUpperCase());
//        }
////        System.out.println(unames);
//        unames.forEach(s-> System.out.println(s));
      unames = names.stream().map(s->s.toUpperCase()).toList();
      unames.forEach(s-> System.out.println(s));

      Integer i = new Integer(23);
      Double d= Double.valueOf(23.5);
      double real = d.doubleValue();

    }
}
