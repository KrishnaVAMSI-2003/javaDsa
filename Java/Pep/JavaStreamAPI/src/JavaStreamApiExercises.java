//Guvvala Krishna Vamsi,  Reg no: 12008526

import java.util.*;
import java.util.stream.Stream;

public class JavaStreamApiExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        for (int i=0;i<=5;i++) {
            list.add(sc.nextLine());
        }
        // Collection<String> list = Arrays.asList("abc","","bcd","defg","","jk");
        Stream<String> listStream = list.stream();
        Stream<String> emptyStrings = listStream.filter(i->i.equals(""));
        System.out.println("List has "+emptyStrings.count()+" empty strings");
    }
}
