package maps;

import java.util.LinkedHashMap;
import java.util.TreeMap;

class Teacher
{
    private int age;

    public Teacher(int name) {
        this.age = name;
    }
}
public class launchmap3 {
    public static void main(String[] args) {
        TreeMap tm1 = new TreeMap();
        tm1.put(3,"rohit"); // key+value==>Entry
        tm1.put(1,"virat");
        tm1.put(2,"bumrah");
        tm1.put(4,"virat"); // duplicates are ok for value but not for key.
        System.out.println(tm1);
        // eventhough we are instering values in non sorted order
        // but we are getting them in sorted order same way as that of TreeSet collection.

//        tm1.put(null,"key is null"); // in TreeMap key can't be null
//        tm1.put("value is null",null); // in TreeMap value can't be null
//        Teacher t = new Teacher("Hyder");
//        tm1.put(t,"best");
//        System.out.println(tm1);
        // we can't have above operations because the order of insertion is not preserved
        // and they automatically align then in sorted order and
        // if we have add Teacher type method they can't sort them so classCastException occurs.
    }
}
