package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class parallelStream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10000);
        for(int i=0;i<10000;i++)
        {
            list.add(i);
        }

        // Sequential stream
        long startse= System.currentTimeMillis();
       int sum1=  list.stream()
                .filter(i->i%2==0)
                .map(i->i*2)
                .reduce(0,(c,e)->c+e);
        long endse= System.currentTimeMillis();
        long res1=endse-startse;
        System.out.println(res1+"sequential stream");
        // Parallel Stream
        long startpa= System.currentTimeMillis();
        int sum2=  list.parallelStream()
                .filter(i->i%2==0)
                .map(i->i*2)
                .reduce(0,(c,e)->c+e);
        long endpa= System.currentTimeMillis();
        long res2=endpa-startpa;
        System.out.println(res2+"Parallel stream");
    }
}
