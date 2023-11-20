package maps;

import java.util.Hashtable;

// HashTable is legacy class.
public class launchmap4 {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(3,"rohit"); // key+value==>Entry
        ht.put(1,"virat");
        ht.put(2,"bumrah");
        ht.put(4,"virat"); // duplicates are ok for value but not for key.
        System.out.println(ht);
//      ht.put(null,"key is null"); // in HashTable key can't be null
//      ht.put("value is null",null); // in HashTable value can't be null

        // here order of insertion is not preserved and it is sorted in descending order based on key
    }
}
