import java.util.Scanner;

public class Palidrome {
    public static void palindrome() {
        int reverse = 0;
        int remaider = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        boolean hasNextInt = sc.hasNextInt();
        if(hasNextInt) {
            int x = sc.nextInt();
            int enteredNumber = x;
            while(x!=0) {
                remaider = x%10;
                reverse = reverse*10 + remaider;
                x = x/10;
            }
            if(enteredNumber==reverse){
                System.out.println("entered number is a palindrome");
            } else {
                System.out.println("Entered number is not a palindrome");
            }
        } else {
            System.out.println("Enter a valid number");
        }
    }
}
