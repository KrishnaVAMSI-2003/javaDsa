//Guvvala Krishna Vamsi,  Reg no: 12008526

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Stream;

public class Exercise2 {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        ArrayList<String> list = new ArrayList<String>();
//        for (int i=0;i<=5;i++) {
//            list.add(sc.nextLine());
//        }
        Collection<String> list = Arrays.asList("abc","","bcd","","defg","jk");
        Stream<String> listStream = list.stream();
        Stream<String> length3 = listStream.filter(i->i.length()>3);
        System.out.println("It has "+length3.count()+" Strings of length more than 3");
    }
}
