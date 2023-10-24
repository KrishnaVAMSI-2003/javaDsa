// Guvvala Krishna Vamsi,  Reg no : 12008526
import java.util.Scanner;
public class Pattern {
    public static void pattern() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int starAt = n;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<i+n;j++) {
                if(j<starAt) {
                    System.out.print(" ");
                } else if(j==starAt) {
                    System.out.print("*");
                } else if(j>starAt && (j+starAt)%2==0) {
                    System.out.print("*");
                } else if(j>starAt) {
                    System.out.print("_");
                }
            }
            starAt--;
            System.out.println("");
        }
    }
}
