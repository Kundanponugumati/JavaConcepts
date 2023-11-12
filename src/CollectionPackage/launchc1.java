package CollectionPackage;
import java.util.*;
public class launchc1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(30);
        al.add(50);
        al.add(20);
        al.add(60);
        al.add(70);
        al.add(40);
        System.out.println(al);
        // order of insertion is preserved.
        al.add(50);
        System.out.println(al);
        // duplicate values are allowed.
        al.add(null);
        System.out.println(al);
        // null value is allowed in arraylist.
        System.out.println(al.get(2));
        // index based accessing is allowed.
        System.out.println("********************");
        LinkedList ll = new LinkedList();
        ll.add(30);
        ll.add(50);
        ll.add(20);
        ll.add(60);
        ll.add(70);
        ll.add(40);
        System.out.println(ll);
        // order of insertion is preserved.
        ll.add(50);
        System.out.println(ll);
        // duplicate values are allowed.
        ll.add(null);
        System.out.println(ll);
        // null value is allowed.
        System.out.println(ll.get(2));
        // index based accessing is allowed.
        System.out.println("********************");

        ArrayDeque ad = new ArrayDeque();
        ad.add(30);
        ad.add(50);
        ad.add(20);
        ad.add(60);
        ad.add(70);
        ad.add(40);
        System.out.println(ad);
        // order of insertion is preserved.
        ad.add(50);
        System.out.println(ad);
        // duplicate values are allowed.
//        ad.add(null);
//        System.out.println(ad);
        // null value is allowed is not allowed.
//        System.out.println(ad.get(2));
        // index based accessing is  not allowed.
        System.out.println("********************");
        PriorityQueue pq = new PriorityQueue();
        pq.add(30);
        pq.add(50);
        pq.add(20);
        pq.add(60);
        pq.add(70);
        pq.add(40);
        System.out.println(pq);
        // order of insertion is not preserved.
        pq.add(50);
        System.out.println(pq);
        // duplicate values are allowed.
//        ad.add(null);
//        System.out.println(ad);
        // null value is allowed is not allowed.
//        System.out.println(ad.get(2));
        // index based accessing is  not allowed.
        System.out.println("********************");
        TreeSet ts = new TreeSet();
        ts.add(30);
        ts.add(50);
        ts.add(20);
        ts.add(60);
        ts.add(70);
        ts.add(40);
        System.out.println(ts);
        // order of insertion is not preserved.
        ts.add(30);
        System.out.println(ts);
        // duplicates not allowed.
//        ts.add(null);
//        System.out.println(ts);
        // null value not allowed.
        // index based accessing not allowed.

        System.out.println("********************");
        HashSet hs= new HashSet();
        hs.add(30);
        hs.add(50);
        hs.add(20);
        hs.add(60);
        hs.add(70);
        hs.add(40);
        System.out.println(hs);
//      order of insertion not preserved.
        hs.add(30);
        System.out.println(hs);
        // duplicates not allowed .
        hs.add(null);
        System.out.println(hs);
        // null values allowed.
        // index based accessing not preserved.

        System.out.println("********************");
        LinkedHashSet lh= new LinkedHashSet();
        lh.add(30);
        lh.add(50);
        lh.add(20);
        lh.add(60);
        lh.add(70);
        lh.add(40);
        System.out.println(lh);
//      order of insertion preserved.
        lh.add(30);
        System.out.println(lh);
        // duplicates not allowed .
        lh.add(null);
        System.out.println(lh);
        // null values allowed.
        // index based accessing  not preserved.

    }
}
