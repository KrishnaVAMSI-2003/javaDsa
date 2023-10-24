import java.util.Scanner;

public class Gcd {
    public void gcd() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = Math.min(a,b);
//        while(res>0) {
//            if(a%res == 0 && b%res == 0) {
//                break;
//            }
//            res--;
//        }
        res = gcd(a,b);
        System.out.println("GCD of entered numbers : "+res);


    }
    // Euclid algorithm
    public int gcd(int a, int b) {
        if(b==0) {
            return a;
        }
        return gcd(b,b%a);
    }
}
