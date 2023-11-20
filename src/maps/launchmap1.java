package maps;

import java.util.HashMap;

class Learner
{

}
public class launchmap1 {
    public static void main(String[] args) {
        HashMap hm1 = new HashMap();
        hm1.put(1,"rohit"); // key+value==>Entry
        hm1.put(2,"virat");
        // duplicates allowed for value but not for key.
        hm1.put(4,"virat"); // duplicates are ok for value but not for key.
//        hm1.put(2,"sharma");
        hm1.put(3,"bumrah");
        System.out.println(hm1);
        Learner learn = new Learner();
        hm1.put(learn,"kundan"); // in HashMap order of insertion is not preserved.
        hm1.put("sai",learn);
        System.out.println(hm1);
        hm1.put(null,"key is null"); // in HashMap key can be null
        hm1.put("value is null",null); // in HashMap value can be null
        System.out.println(hm1);
    }
}
