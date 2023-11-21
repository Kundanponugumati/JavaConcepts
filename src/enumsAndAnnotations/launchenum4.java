package enumsAndAnnotations;

enum Results
{
    PASS,FAIL,NR,Others;

}
public class launchenum4 {
    public static void main(String[] args) {
        Results res = Results.Others;
    // enum is compatible with switch case.
        switch (res)
        {
            case PASS:
                    {
                        System.out.println("Passed in the exam");
                        break;
                    }
            case FAIL:
            {
                System.out.println("Failed in the exam");
                break;
            }
            case NR:
            {
                System.out.println("No Result");
                break;
            }
            default:
                System.out.println("Cheated in the Exam");
        }
    }
}
