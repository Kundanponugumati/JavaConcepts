package StreamAPI;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class stream1 {
    public static void main(String[] args) {
//        System.out.println("hello");
        List <Integer> nums = Arrays.asList(4,6,7,2,1,8,3);
        // sum of double of even numbers.
        // generally this.
//        int sum=0;
//        Iterator <Integer> itr = nums.iterator();
//        while(itr.hasNext())
//        {
//            int a = itr.next();
//            if(a%2==0)
//            {
//                sum=sum+a*2;
//            }
//        }
////        for (Integer num : nums) {
////            if (num % 2 == 0) {
////                sum = sum + num;
////            }
////        }
//        System.out.println(sum);

        // but after stream API.

        Stream<Integer> s1 = nums.stream();
        Predicate<Integer> pred =  new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                return i%2==0;
            }
        };
//        i -> i%2==0;

        Stream<Integer> s2 = s1.filter(i -> i%2==0);
//        s2.forEach(i-> System.out.println(i));
//        Function<Integer,Integer> func = new Function<Integer, Integer>() {
//            @Override
//            public Integer apply(Integer i) {
//                return i*2;
//            }
//        };
//        Function<Integer,Integer> func = i ->  i*2;
        Stream<Integer> s3 = s2.map(i->i*2);
//        s3.forEach(i-> System.out.println(i));
//        BinaryOperator <Integer> bi = new BinaryOperator<Integer>() {
//            @Override
//            public Integer apply(Integer c, Integer e) {
//                return c+e;
//            }
//        };
//        System.out.println(s3.reduce(0,bi));
        BinaryOperator <Integer> bi = (c,e) ->  c+e;
        System.out.println(s3.reduce(0,(c,e) ->  c+e));





















//        int s4 = s3.reduce(0,(c,e)->c+e);
//        System.out.println(s4);
//
////        System.out.println(s1); // gives address of s1
////        s1.forEach(i-> System.out.println(i)); // for printing stream.
//        Stream<Integer> s2 = s1.filter(i -> i%2==0);
//        Stream<Integer> s3 = s2.map(i->i*2);
//        int s4 = s3.reduce(0,(c,e)->c+e);
//        System.out.println(s4);
////        s4.forEach(i-> System.out.println(i));



    }

}
