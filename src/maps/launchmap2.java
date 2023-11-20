package maps;

import java.util.LinkedHashMap;

class Student
{
    private String name;
    private int age;

    public Student(String name,int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class launchmap2 {
    public static void main(String[] args) {
        LinkedHashMap lhm1 = new LinkedHashMap();
        lhm1.put(3,"bumrah");
        lhm1.put(1,"rohit"); // key+value==>Entry
        lhm1.put(2,"virat");
        lhm1.put(4,"virat"); // duplicates are ok for value but not for key.
        System.out.println(lhm1);

        lhm1.put(null,"key is null"); // in LinkedHashMap key can be null
        lhm1.put("value is null",null); // in LinkedHashMap value can be null
        System.out.println(lhm1);

        Student std1 = new Student("Kundan",20);
        Student std2 = new Student("Abhi",18);
        lhm1.put(std1,"B.Tech");
        lhm1.put("B.Tech",std2);
        System.out.println(lhm1); // in LinkedHashMap order of insertion is preserved.

    }
}
