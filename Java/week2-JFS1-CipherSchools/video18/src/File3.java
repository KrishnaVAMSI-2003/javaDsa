import java.io.File;

public class File3 {
    public static void main(String[] args) {
        // listing files.

        File f = new File("D:\\myTest.txt");
        String[] files = f.list();
        for(String s:files) {
            System.out.println(s);
        }

        File[] filesArr = f.listFiles();
        for(File ff : filesArr) {
            ff.delete();              //it creates the object of the file and we can perform actions on the elements of that file, its deleting all the elements of the file in this case
        }

    }
}
