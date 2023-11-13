package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//simple of whole stream1
public class stream2 {
     public static void main(String[] args) {
         List<Integer> list = Arrays.asList(4,6,7,2,1,8,3);
         // we want sum of double of even numbers.

//         list.stream()
//                 .filter(i->i%2==0)
//                 .map(i->i*2)
//                 .forEach(i-> System.out.println(i));
        int sum  =  list.stream()
                 .filter(i->i%2==0)
                 .map(i->i*2)
                .reduce(0,(c,e)->c+e);

         System.out.println(sum);


     }
}
