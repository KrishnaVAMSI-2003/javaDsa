import java.util.Scanner;

public class CalculatingXpowerYplusZ {
    public static void xPowerYplusZ() {
        System.out.println("This program calculates X power (Y + Z)");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value for X : ");
        int x = scan.nextInt();
        System.out.println("Enter a value for Y : ");
        int y = scan.nextInt();
        System.out.println("Enter a value for z : ");
        int z = scan.nextInt();
        int n = 1;
        for(int i=0;i<y+z;i++) {
            n *= x;
        }
        System.out.println("X power (Y+Z) = "+n);
    }
}
