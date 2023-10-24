//Guvvala Krishna Vamsi,  Reg no: 12008526

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        for (int i=0;i<=5;i++) {
            list.add(sc.nextLine());
        }
        // Collection<String> list = Arrays.asList("abc","","bcd","","defg","jk");
        Stream<String> listStream = list.stream();
        Stream<String> length3 = listStream.filter(i->i.charAt(0)=='a');
        System.out.println("It has "+length3.count()+" strings which starts with 'a'");
    }
}