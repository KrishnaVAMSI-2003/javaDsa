import java.util.Scanner;

public class Ascii {
    public static void ascii() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char charVariable = scan.next().charAt(0);
        int intVariable = charVariable;
        System.out.println("Acsii value of "+charVariable+" is : "+intVariable);
        char nextChar = (char) (intVariable+1);
        char prevChar = (char) (intVariable-1);
        System.out.println("Next character = "+nextChar);
        System.out.println("previous character = "+prevChar);
    }
}
