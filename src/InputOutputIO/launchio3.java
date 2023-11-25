package InputOutputIO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class launchio3 {
    public static void main(String[] args) throws IOException {

        FileReader fr = null;
        try{
            String path = "/Users/kundan/IdeaProjects/JavaConcepts/javaio";
            File folder = new File(path);
            File file = new File(folder,"java.txt");
            fr= new FileReader(file);
//            System.out.println(file.length());
           int size = (int) file.length();
//            System.out.println((char)fr.read());
//            int i = fr.read();
//            while(i!=-1)
//            {
//                System.out.println(i+"-->"+(char)i);
//                i=fr.read();
//            }
            // the above method is not optimal because it hits hard disk more.
            char [] carray = new char[size];
            fr.read(carray);
            for(char ele:carray)
            {
                System.out.println(ele);
            }
            // this is also not optimal. no.of hard disk hits are more.
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            fr.close();
        }
    }
}
