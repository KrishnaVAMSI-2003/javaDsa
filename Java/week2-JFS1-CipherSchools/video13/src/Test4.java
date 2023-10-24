import java.io.File;
import java.io.IOException;

public class Test4 {
    public static void main(String[] args) throws IOException {

        File f = new File("D:\\abc.txt");
        f.createNewFile();

        // throws is an indication that there is a need of exception handling here
        // try/catch please do it.
    }
}
