package CollectionPackage;

import java.util.*;

public class CollectionsClass {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(4);
        list.add(44);
        list.add(20);
        list.add(10);
        list.add(8);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.max(list));
        Collections.rotate(list,2);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println(Collections.frequency(list,44));

    }
}
