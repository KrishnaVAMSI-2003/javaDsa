import java.io.FileWriter;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\myTest.txt");
        fw.write("I am The Earth \n");
        fw.write("I am The Forest Green \n");
        fw.write("I am The Four Winds Blowing \n");
        fw.write("I am The Earth \n");
        fw.flush(); // flush clears the data in the buffer memory and writes into the file.
        fw.close(); // closing the connection with file
        System.out.println("File Prepared Successfully!");
    }
}
