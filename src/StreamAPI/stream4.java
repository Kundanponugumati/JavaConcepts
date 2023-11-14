package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class stream4 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("kundan","sai","abhi","swapna","ravi","swathi");

        names.stream().filter(s->s.contains("w"))
                .forEach(s-> System.out.println(s+" "+s.length()));

//      Optional<String> name=   names.stream().filter(s->s.contains("w")).findFirst();
        String name=   names.stream().filter(s->s.contains("w")).findFirst().orElse("not found");
        System.out.println(name);
    }
}
