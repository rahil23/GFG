package Java;

import java.io.*;

public class ReadingTxtFile {
    public static void main(String[] args) throws IOException {
 String filePath = System.getProperty("user.dir");
 System.out.println(filePath);
File file = new File("C:\\Users\\Admin\\IdeaProjects\\GFG\\src\\Java\\student.txt");
        BufferedReader bf = new BufferedReader(new FileReader(file));
        String st;
        while((st=bf.readLine())!=null)
        {
System.out.println(st);
        }


    }
}
