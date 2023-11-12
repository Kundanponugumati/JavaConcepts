package CollectionPackage;
import java.util.*;
import java.util.function.Consumer;

public class foreachMethod {
    public static void main(String[] args) {
        List list = Arrays.asList(20,30,40,50);
//
//        Consumer<Integer> con = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer*2);
//            }
//        };
//        list.forEach(con);
        list.forEach((n)-> System.out.println(n));
    }
}
