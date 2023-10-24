import java.util.Scanner;
public class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int num = sc.nextInt();
        int count = 0;
        int sum=0;
        while(num>0) {
            int rem=num%10;
            sum+=rem;
            count++;
            num/=10;
            if(count>4) {
                break;
            }
        }
        if(count==4) {
            if(sum%3==0 || sum%5==0 || sum%7==0) {
                System.out.println("Lucky Number");
            } else{
                System.out.println("Not a lucky number");
            }
        } else {
            System.out.println("invalid number");
        }
    }
}
