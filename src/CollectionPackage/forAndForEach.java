package CollectionPackage;

import java.util.ArrayList;

public class forAndForEach {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(30);
        al.add(50);
        al.add(20);
        al.add(60);
        al.add(70);
        al.add(40);
        System.out.println(al);
        // accessing the collection.
        System.out.println("*************");
        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i)+" ");
        }
        System.out.println();
        System.out.println("*************");
        // accessing in reverse direction.
        for(int i=al.size()-1;i>=0;i--)
        {
            System.out.print(al.get(i)+" ");
        }
        System.out.println();

        // we can use for each loop also instead of for loop
        System.out.println("*************");
        for(Object obj:al)
        {
            System.out.print(obj+" ");
        }
        System.out.println();
    }

}
