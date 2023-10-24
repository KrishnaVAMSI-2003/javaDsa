import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) {
        try{
        File f = new File("d:\\abc.txt");
        f.createNewFile();} catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
