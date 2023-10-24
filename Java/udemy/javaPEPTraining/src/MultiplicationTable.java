// Guvvala Krishna Vamsi
import java.util.Scanner;

public class MultiplicationTable {
    public static void multiplicationTable() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=20;i++) {
            System.out.println(n+" X "+i+" = "+(n*i));
        }
    }
}
