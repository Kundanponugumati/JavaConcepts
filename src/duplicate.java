import java.util.Scanner;

import static java.lang.Math.*;


class Demo
{
    Demo pass;
    void demo()
    {
        System.out.println("demo");
    }
}

public class duplicate {
     void main(String[] args) {
//        main();
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int k= Integer.MIN_VALUE;
//        Long.MIN_VALUE
        for(int i=0;i<T;i++)
        {
            String s = sc.nextLine();
            try{
                long n = Long.parseLong(s);
                if(n>0)
                {
                    int d = (int) (Math.log(n)/Math.log(2));
                    System.out.println(n+" can be fitted in:");
                    if(d<7)
                    {
                        System.out.println("* byte");
                    }
                    if(d<15)
                    {
                        System.out.println("* short");
                    }
                    if(d<31)
                    {
                        System.out.println("* int");
                    }
                    if(d<63)
                    {
                        System.out.println("* long");
                    }
                }
                if(n<0)
                {
                    int d1 = (int)(Math.log(-1*n)/Math.log(2));
                    System.out.println(n+" can be fitted in:");
                    if(d1<7)
                    {
                        System.out.println("* byte");
                    }
                    if(d1<15)
                    {
                        System.out.println("* short");
                    }
                    if(d1<31)
                    {
                        System.out.println("* int");
                    }
                    if(d1<63)
                    {
                        System.out.println("* long");
                    }
                }
            }
            catch(Exception e)
            {
                System.out.println(s+" can't be fitted anywhere.");
                continue;
            }
        }
    }
}
    //public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//        Scanner sc = new Scanner(System.in);
//        long q =(long) log(sc.nextInt());
//        String s;
//        System.out.println( Long.parseLong("1234"));
//        System.out.println(q);

//        for(int i=0;i<q;i++)
//        {
//            int a = sc.nextInt();
//            int b= sc.nextInt();
//            int n = sc.nextInt();
//            for(int j=0;j<n;j++)
//            {
//                System.out.print(series(a,b,j)+" ");
//            }
//            System.out.println();
//        }

    //}//
//    public static int series(int a,int b,int n)
//    {
//        if(n==0)
//        {
//            return a+((int)Math.pow(2,n))*b;
//        }
//        return series(a,b,n-1)+(int)(Math.pow(2,n))*b;
//    }

