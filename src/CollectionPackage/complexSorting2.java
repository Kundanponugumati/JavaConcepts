package CollectionPackage;
import java.util.*;

class employee1 implements Comparable<employee1>
{
    int id;
    String name;
    int Age;

    public employee1(int id, String name, int age) {
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

    @Override
    public int compareTo(employee1 o) {
        if(this.id>o.id)
        return 1;
        else
            return -1;
    }
}
public class complexSorting2 {
    public static void main(String[] args) {
        employee1 emp1 = new employee1(23,"kundan",20);
        employee1 emp2 = new employee1(29,"abhi",18);
        employee1 emp3 = new employee1(12,"sai",29);
        List <employee1> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before Sort : "+list);
        Collections.sort(list);
        System.out.println("After Sort : "+list);
    }
}

