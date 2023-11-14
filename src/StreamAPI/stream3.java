package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class stream3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,6,7,2,1,8,3);
        // we want sum of double of even numbers.

        Predicate<Integer> pred = new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                System.out.println("in filter ");
                return i%2==0;
            }
        };

       Function<Integer,Integer> fun = new Function<Integer, Integer>() {
           @Override
           public Integer apply(Integer i) {
               System.out.println("in map ");
               return i*2;
           }
       };

        BinaryOperator<Integer> bi = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer c, Integer e) {
                System.out.println("in reduce");
                return c+e;
            }
        };

         list.stream()
                .filter(pred)
                .map(fun)
                .reduce(0,bi);

//        System.out.println(sum);
    }
}
