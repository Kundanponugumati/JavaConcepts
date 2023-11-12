package CollectionPackage;
import java.util.*;

class employee
{
    int id;
    String name;
    int Age;

    public employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        Age = age;
    }

    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Age=" + Age +
                '}';
    }
}

//class Alpha implements Comparator<employee>
//{
//    @Override
//    public int compare(employee o1, employee o2) {
//        if(o1.Age>o2.Age)
//            return 0;
//        else
//            return -1;
//    }
//}
public class complexSorting {
    public static void main(String[] args) {
        employee emp1 = new employee(23,"kundan",20);
        employee emp2 = new employee(29,"abhi",18);
        employee emp3 = new employee(12,"sai",29);
        List <employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before Sort : "+list);
//        Comparator <employee>sorting = new Comparator<employee>() {
//            @Override
//            public int compare(employee o1, employee o2) {
//                if(o1.id>o2.id)
//                    return 1;
//                else
//                    return -1;
//            }
//        };

//        Comparator<employee> sorting = (employee o1,employee o2)->
//        {
//            if(o1.id>o2.id)
//                    return 1;
//                else
//                    return -1;
//        };
        Collections.sort(list,(employee o1,employee o2)->
        {
            if(o1.id>o2.id)
                return 1;
            else
                return -1;
        });
        System.out.println("After Sort : "+list);
    }
}
