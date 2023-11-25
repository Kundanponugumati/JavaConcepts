package InputOutputIO;

import java.io.*;
public class launchio1 {
    public static void main(String[] args) throws IOException {
        try {
            String path1 = "/Users/kundan/IdeaProjects/JavaConcepts/javaio/java.txt";
            String path2 = "/Users/kundan/IdeaProjects/JavaConcepts/javaio/java";
            String path3 = "/Users/kundan/IdeaProjects/JavaConcepts/src/StreamAPI";
            File file1 = new File(path1);
            //System.out.println(file1.createNewFile()); // if file already exists it won't create a new one it gives you false.
            System.out.println(file1.exists());
            System.out.println(file1.canRead());
            System.out.println(file1.canExecute());
            System.out.println(file1.isFile());
            System.out.println(file1.isDirectory());
            File folder = new File(path2);
            folder.mkdir(); // to create new method/directory.
            System.out.println(folder.isDirectory());
            System.out.println(folder.exists());
            System.out.println(folder.canRead());
            System.out.println(folder.canExecute());
            System.out.println(folder.isFile());
            System.out.println(folder.isDirectory());
            System.out.println("********");
            File file2 = new File(path3);
            String[] ar = file2.list(); // shows all files in that path.
            for (String file : ar) {
                System.out.println(file);
            }
        }
        catch (Exception e)
        {
            e.getStackTrace();
        }
    }
}
