// Guvvala Krishna Vamsi, Reg no: 12008526
import java.util.Scanner;
public class StringManipulation {
    public static void stringManipulation() {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] inputArray = input.toCharArray();
        int ascii;
        String manipulatedString = "";
        for(int i=0;i<inputArray.length;i++) {
            ascii = inputArray[i];
             if(ascii>=97&&ascii<=122){
                inputArray[i] =(char) (ascii-32);
                manipulatedString+=inputArray[i];
            } else if(ascii>=65&&ascii<=90){
                inputArray[i] =(char) (ascii+32);
                manipulatedString+=inputArray[i];
            }
        }
        System.out.println(manipulatedString);
    }
}
