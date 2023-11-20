package maps;

import java.util.*;

public class launchmap5 {
    public static void main(String[] args) {
        HashMap <Integer,String> hm = new HashMap<>();
        hm.put(3,"rohit");
        hm.put(1,"virat");
        hm.put(2,"bumrah");
        hm.put(4,"virat");
        System.out.println(hm);
        // 3 ways to retrive data in Map
//        1. only key
//        2. only value
//        3. entry

        // only values
        Collection collect = hm.values();
        System.out.println(collect);
        // iterator method is not there in map hierarchy.
        // values will return collection key will return set
        Iterator<String> itr = collect.iterator();
        String str = null;
        while(itr.hasNext())
        {
            System.out.println(itr.next());
//            str = itr.next();
        }
        System.out.println(str);

        // only keys
        Set <Integer> key = hm.keySet();
        Iterator <Integer>itr2 = key.iterator();
        while(itr2.hasNext())
        {
            System.out.println(itr2.next());
        }

        // entry
       Set en =  hm.entrySet();
        Iterator <Map.Entry>itr3 = en.iterator();
        while(itr3.hasNext())
        {
//            System.out.println(itr3.next());
            Map.Entry ent = itr3.next();
            System.out.println(ent.getKey());
            System.out.println(ent.getValue());
        }

    }
}
