// Guvvala Krishna Vamsi,  reg no: 12008526
import java.util.Scanner;
public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        if(n%2==0 || n%3==0 || n==0||n==1) {
            count++;
        }
        for(int i=5;i*i<=n;i+=6) {
            if(n%i==0) {
                count++;
            }
        }
        if(count>0) {
            System.out.println("Not prime");
        } else
            System.out.println("Prime");
    }
}
