package maps;
// small project.
import java.util.*;

class details
{
    private String name;
    private int age;
    private String city;

    public details(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "details{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
public class launchmap6 {
    public static void main(String[] args) {
        details d1 = new details("kundan",20,"Ongole");
        details d2 = new details("Karthik",19,"Kakinada");
        details d3 = new details("Hardhik",18,"Vijayawada");
        HashMap<Integer,details> hm = new HashMap<>();
        hm.put(11,d1);
        hm.put(12,d2);
        hm.put(13,d3);
        System.out.println("Enter the no so that you get info");
        Scanner sc = new Scanner(System.in);
        int id= sc.nextInt();
        Set ent = hm.entrySet();
        Iterator <Map.Entry>itr = ent.iterator();
        boolean flag =false;
        while(itr.hasNext())
        {
            Map.Entry en = itr.next();
            int key = (int) en.getKey();
            if(id==key)
            {
                System.out.println(en.getValue());
                flag=true;
            }
        }
        if(flag==false)
        {
            System.out.println("not valid id");
        }
    }
}
