import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\myTest.txt");

        //using exists() to check if file exists or not
        if(f.exists()) {
            System.out.println("Printing file details");
            System.out.println("----------------------");
            System.out.println("File name: "+f.getName());
            System.out.println("File size : "+f.length());
            System.out.println("File path : "+f.getAbsolutePath());
            System.out.println("is File readable? "+f.canRead());
            System.out.println("is File Writable? "+f.canWrite());
            System.out.println("-------------------------------");
        }
        // creating directory
        File f1 = new File("D:\\Avengers");
        f1.mkdir();

        // take path from user and create a folder ar that path inside that directory create 1000 text file
        // named as 1.txt,2.txt,....,1000.txt
        for (int i=1;i<=1000;i++) {
            File f2 = new File("D:\\Avengers\\"+i+".txt");
            f2.createNewFile();
        }

    }
}
