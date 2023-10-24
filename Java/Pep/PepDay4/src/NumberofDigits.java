// Guvvala Krishna Vamsi,   reg no:12008526

import java.util.Scanner;

public class NumberofDigits {
    public static void noOfDigits() {
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        System.out.println("No of digits = "+count(inp));
    }
    public static int count(int num) {
        if (num > 0) {
            return 1+count(num/10);
        } else
            return 0;
    }
}
