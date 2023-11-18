package generics;
/*
Wild Card, Lower Bound, Upper Bound --> these 3 cases.

? --> WildCard and only ? this mean equilavent to anytype. when it is more useful means

upper bound
? extends class --> means class and child class ok but parent of that class not ok.

lower bound
? extends super --> means class and parent of that class ok but child not ok.





 */

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class human2
{

}
class employee2 extends human2
{

}
public class launchgen4 {
    public static void main(String[] args) {
        List<human2> humanlist = new ArrayList<>();
        humanlist.add(new human2());
        humanlist.add(new employee2());
        // this can hold both human and employee objects
        List<employee2> employeelist = new ArrayList<>();
        employeelist.add(new employee2());
        // this can only hold employee objects.
//        humanlist = employeelist --> this will not work it gives you complie time error
//                make sure that here parent child drama don't work.

        // wild card.
        List<?> humanlist2 = new ArrayList<>();
        List<employee2> employeelist2 = new ArrayList<>();
        humanlist2=employeelist2; // this is allowed beacuse ? it is wildcard.


        // upper bound
        List<? extends human2> humanlist3 = new ArrayList<>();
        List<employee2> employeelist3 = new ArrayList<>();
        humanlist3=employeelist3;
        List<Object> objectlist = new ArrayList<>();
//        humanlist3=objectlist; --> gives error.

       // lower bound.
        List<? super human2> humanlist4 = new ArrayList<>();
        List<employee2> employeelist4 = new ArrayList<>();
//        humanlist4=employeelist4; --> gives error
        List<Object> objectlist1 = new ArrayList<>();
        humanlist4=objectlist1;



    }
}
