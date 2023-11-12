package CollectionPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class failFastAndFailSafe {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(30);
        al.add(50);
        al.add(20);
        al.add(60);
        al.add(70);
        al.add(40);

//        for(int i=0;i<al.size();i++)
//        {
//            System.out.println(al.get(i));
//            al.add(44);
//            // runs for infinite amount of time.
//            // and this is why we don't use for loop in collections.
//        }

        Iterator itr = al.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
//            al.add(44);
            // gives exception at run time.
            // This is called Fail Fast
        }
        System.out.println("*********");
        CopyOnWriteArrayList li = new CopyOnWriteArrayList();
        li.addAll(al);
        Iterator it = li.iterator();
        while(it.hasNext())
        {
            li.add(44);
            System.out.println(it.next());
        }
        // this is failsafe.
    }
}
