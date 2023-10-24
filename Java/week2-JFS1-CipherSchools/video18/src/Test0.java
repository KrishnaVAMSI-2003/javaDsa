import java.io.File;
import java.io.IOException;

public class Test0 {
    public static void main(String[] args) throws IOException {
        // Lab1 : Creating empty files
        File f = new File("D:\\myTest.txt");
        f.createNewFile();
        System.out.println("File created successfully!!!");
    }
}
