package CollectionPackage;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorConcept {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(30);
        al.add(50);
        al.add(20);
        al.add(60);
        al.add(70);
        al.add(40);
        System.out.println(al);
        System.out.println("*************");

        Iterator itr = al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println("**************");

        ListIterator litr = al.listIterator(al.size());
        while(litr.hasPrevious())
        {
            System.out.println(litr.previous());
        }
        System.out.println();

        // for all non-list based classes to travese reverse we do

        ArrayDeque ad = new ArrayDeque();
        ad.add(30);
        ad.add(50);
        ad.add(20);
        ad.add(60);
        ad.add(70);
        ad.add(40);

        // now create a list based class and addall(ad)

        ArrayList list = new ArrayList();
        list.addAll(ad);
        ListIterator litr2 = list.listIterator(list.size());
        while(litr2.hasPrevious())
        {
            System.out.println(litr2.previous());
        }
    }
}
