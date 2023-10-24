//Guvvala Krishna Vamsi,   Q18
import java.util.Scanner;

public class XtoThePowerY {
    public static void xPowerY() {
        Scanner sc = new Scanner(System.in);
        System.out.println("X = ");
        int x = sc.nextInt();
        System.out.println("Y = ");
        int y = sc.nextInt();
        int res = 1;
        for (int i=0;i<y;i++) {
            res *=x;
        }
        System.out.println("X power Y = "+res);
    }
}
