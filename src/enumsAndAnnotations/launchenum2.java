package enumsAndAnnotations;


//class Result extends Enum
//{
//    // for every enum there is a class getting created
//// behind the scene and it extends enum internal class.
//}
 enum Result
 {
     PASS, FAIL,NR; //behind the scene this is what happening
//     public static final Result PASS = new Result();--> when we write PASS
//     public static final Result FAIL = new Result();--> when we write FAIL
//     public static final Result NR = new Result();--> when we write NR
     double grades;

     Result() {
         System.out.println("Constructor Invoked");
     }

     public void setGrades(double grades) {
         this.grades = grades;
     }

     public double getGrades() {
         return grades;
     }
 }

public class launchenum2 {
    public static void main(String[] args) {
        Result.FAIL.setGrades(29.9);
        double gr = Result.FAIL.getGrades();
        System.out.println(gr);
        Result.PASS.setGrades(89.9);
        double gr2 = Result.PASS.getGrades();
        System.out.println(gr2);
        System.out.println(Result.NR.getGrades());
        Result.NR.setGrades(30);
        double gr3 = Result.NR.getGrades();
        System.out.println(gr3);

    }
}
