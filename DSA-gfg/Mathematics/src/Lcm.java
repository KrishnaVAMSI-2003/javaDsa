import java.util.Scanner;

/*
public class Lcm {
    public void lcm() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = Math.max(a,b);{
            while(true){
                if(max%a==0 && max%b==0) {
                    break;
                }
                max++;
            }
        }
        System.out.println("Lcm of given numbers : "+max);
    }
}
*/

public class Lcm {
    public void lcm(int a, int b) {
        int gcd = gcd(a,b);
        int lcm = a*b/gcd;
        System.out.println("Lcm : "+lcm);
    }
    public int gcd(int a, int b) {
        if(b==0) {
            return a;
        }
        return gcd(b,a%b);
    }
}
