import java.util.Scanner;

public class ReverseOfNumber {
    public static void reverseOfNumber() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverse=0;
        int rem = 0;
        while(num>0) {
            rem = num%10;
            reverse = reverse*10 + rem;
            num/=10;
        }
    }
    public static void palindrome() {

    }
}
