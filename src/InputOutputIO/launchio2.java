package InputOutputIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// writing --> means java program is writing
// reading --> means java program is reading what is there in the file.
public class launchio2
{
    public static void main(String[] args) throws IOException {
        FileWriter fw = null;
        try {
            String path = "/Users/kundan/IdeaProjects/JavaConcepts/javaio";
            String path1 = "/Users/kundan/IdeaProjects/JavaConcepts/javaio/java.txt";
            String path2 = "/Users/kundan/IdeaProjects/JavaConcepts/javaio/java";
//        File file1 = new File(path1); --> directory we can use.
            File folder = new File(path);
            File file = new File(path, "java.txt");
//        System.out.println(file.exists());
            fw = new FileWriter(file);
            // using filewriter data transformation is happening.
            // filewiter only characters.
            fw.write("java");
            fw.write("\n"); //--> for next line
            fw.write(65); // 65 ascii is A that will be stored.
            fw.write(23900);
            fw.write("\n");
            fw.write(70);//F
            fw.write(85);//U
            fw.write(67);//C
            fw.write(75);//K
//            fw.close();// if there is exception occurs then this will not excute so we write this in finally block.
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fw.close();
        }
    }
}
