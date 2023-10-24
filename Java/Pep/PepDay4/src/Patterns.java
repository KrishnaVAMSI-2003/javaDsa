import java.util.Scanner;

public class Patterns {
    public static void pattern1() {
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void pattern3() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++){
                System.out.print(String.format("%c ",96+j));
            }
            System.out.println();
        }
    }
    public static void pattern4() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
